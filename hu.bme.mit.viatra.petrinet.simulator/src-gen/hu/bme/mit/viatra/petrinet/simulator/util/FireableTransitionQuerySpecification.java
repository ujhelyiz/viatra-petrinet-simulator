package hu.bme.mit.viatra.petrinet.simulator.util;

import com.google.common.collect.Sets;
import hu.bme.mit.viatra.petrinet.simulator.FireableTransitionMatch;
import hu.bme.mit.viatra.petrinet.simulator.FireableTransitionMatcher;
import hu.bme.mit.viatra.petrinet.simulator.util.NotFireableQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate FireableTransitionMatcher in a type-safe way.
 * 
 * @see FireableTransitionMatcher
 * @see FireableTransitionMatch
 * 
 */
@SuppressWarnings("all")
public final class FireableTransitionQuerySpecification extends BaseGeneratedQuerySpecification<FireableTransitionMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static FireableTransitionQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
  }
  
  @Override
  protected FireableTransitionMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return FireableTransitionMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.viatra.petrinet.simulator.fireableTransition";
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("t");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("t", "hu.bme.mit.viatra.petrinet.model.petrinet.Transition"));
  }
  
  @Override
  public FireableTransitionMatch newEmptyMatch() {
    return FireableTransitionMatch.newEmptyMatch();
  }
  
  @Override
  public FireableTransitionMatch newMatch(final Object... parameters) {
    return FireableTransitionMatch.newMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Transition) parameters[0]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody>  bodies = Sets.newLinkedHashSet();
    
    {
    	PBody body = new PBody(this);
    	PVariable var_t = body.getOrCreateVariableByName("t");
    	body.setExportedParameters(Arrays.<ExportedParameter>asList(
    		new ExportedParameter(body, var_t, "t")
    	));
    new TypeUnary(body, var_t, getClassifierLiteral("http://inf.mit.bme.hu/petrinet/2014", "Transition"), "http://inf.mit.bme.hu/petrinet/2014/Transition");
    	new NegativePatternCall(body, new FlatTuple(var_t), NotFireableQuerySpecification.instance().instance());
    	bodies.add(body);
    }
    {
    	PAnnotation annotation = new PAnnotation("Item");
    	annotation.addAttribute("item", new ParameterReference("t"));
    	annotation.addAttribute("label", "$t.name$");
    	addAnnotation(annotation);
    }
    {
    	PAnnotation annotation = new PAnnotation("Format");
    	annotation.addAttribute("color", "#00ff00");
    	addAnnotation(annotation);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static FireableTransitionQuerySpecification INSTANCE = make();
    
    public static FireableTransitionQuerySpecification make() {
      return new FireableTransitionQuerySpecification();					
    }
  }
}
