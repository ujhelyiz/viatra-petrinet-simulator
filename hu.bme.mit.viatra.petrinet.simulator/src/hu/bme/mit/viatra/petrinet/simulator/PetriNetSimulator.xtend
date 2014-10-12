package hu.bme.mit.viatra.petrinet.simulator

import hu.bme.mit.viatra.petrinet.model.petrinet.PetriNetPackage
import org.eclipse.incquery.runtime.api.AdvancedIncQueryEngine
import org.eclipse.incquery.runtime.evm.api.RuleEngine
import org.eclipse.incquery.runtime.evm.specific.RuleEngines
import org.eclipse.incquery.runtime.evm.specific.event.IncQueryEventRealm
import org.eclipse.viatra2.emf.runtime.modelmanipulation.IModelManipulations
import org.eclipse.viatra2.emf.runtime.modelmanipulation.SimpleModelManipulations
import org.eclipse.viatra2.emf.runtime.rules.batch.BatchTransformationRuleFactory
import org.eclipse.viatra2.emf.runtime.rules.batch.BatchTransformationStatements
import org.eclipse.viatra2.emf.runtime.transformation.batch.BatchTransformation

class PetriNetSimulator {
	extension BatchTransformationRuleFactory factory = new BatchTransformationRuleFactory
	extension BatchTransformation transformation
	extension BatchTransformationStatements statements
	extension IModelManipulations manipulation

	extension PetriNetPackage pnPackage = PetriNetPackage::eINSTANCE
	extension PetriNetSimulatorQueries queries = PetriNetSimulatorQueries::instance
	val AdvancedIncQueryEngine engine
	
	new(AdvancedIncQueryEngine engine) {
		this(RuleEngines.createIncQueryRuleEngine(engine))
	}
	
	new(RuleEngine ruleEngine) {
		engine = (ruleEngine.eventRealm as IncQueryEventRealm).engine as AdvancedIncQueryEngine
		transformation = new BatchTransformation(ruleEngine, engine)
		statements = new BatchTransformationStatements(transformation)
		manipulation = new SimpleModelManipulations(iqEngine)

//		transformation.ruleEngine.logger.level = Level::DEBUG
		
	}
	
	val removeTokenRule = createRule.precondition(sourcePlace).action [
		pl.tokens.findFirst[true].remove
	].build
	
	val addTokenRule = createRule.precondition(targetPlace).action [
		createChild(pl, place_Tokens, token)
	].build
	
	val fireTransitionRule = createRule.precondition(fireableTransition).action [
		//Remove tokens from source places
		fireAllCurrent(removeTokenRule, "t" -> t)

		//Add tokens to target places
		fireAllCurrent(addTokenRule, "t" -> t)
	].build
	
	def fire(int maxCount) {
		var count = 0
		while (count < maxCount) {
			engine.fireableTransition.forEachMatch[println(it.prettyPrint)]
			fireTransitionRule.fireOne
			Thread.sleep(1000)
			count = count + 1
		}
	}
}