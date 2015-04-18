package hu.bme.mit.viatra.petrinet.simulator.util;

import com.google.common.collect.Sets;
import hu.bme.mit.viatra.petrinet.simulator.TargetPlaceMatch;
import hu.bme.mit.viatra.petrinet.simulator.TargetPlaceMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;

/**
 * A pattern-specific query specification that can instantiate TargetPlaceMatcher in a type-safe way.
 * 
 * @see TargetPlaceMatcher
 * @see TargetPlaceMatch
 * 
 */
@SuppressWarnings("all")
public final class TargetPlaceQuerySpecification extends BaseGeneratedEMFQuerySpecification<TargetPlaceMatcher> {
  private TargetPlaceQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TargetPlaceQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected TargetPlaceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TargetPlaceMatcher.on(engine);
  }
  
  @Override
  public TargetPlaceMatch newEmptyMatch() {
    return TargetPlaceMatch.newEmptyMatch();
  }
  
  @Override
  public TargetPlaceMatch newMatch(final Object... parameters) {
    return TargetPlaceMatch.newMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Transition) parameters[0], (hu.bme.mit.viatra.petrinet.model.petrinet.Place) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static TargetPlaceQuerySpecification INSTANCE = make();
    
    public static TargetPlaceQuerySpecification make() {
      return new TargetPlaceQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static TargetPlaceQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.viatra.petrinet.simulator.targetPlace";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("t","pl");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("t", "hu.bme.mit.viatra.petrinet.model.petrinet.Transition"),new PParameter("pl", "hu.bme.mit.viatra.petrinet.model.petrinet.Place"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_t = body.getOrCreateVariableByName("t");
      	PVariable var_pl = body.getOrCreateVariableByName("pl");
      	PVariable var_n = body.getOrCreateVariableByName("n");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var__virtual_1_ = body.getOrCreateVariableByName(".virtual{1}");
      	PVariable var_arc = body.getOrCreateVariableByName("arc");
      	PVariable var__virtual_2_ = body.getOrCreateVariableByName(".virtual{2}");
      	PVariable var__virtual_3_ = body.getOrCreateVariableByName(".virtual{3}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_t, "t"),
      				
      		new ExportedParameter(body, var_pl, "pl")
      	));
      	new TypeUnary(body, var_t, getClassifierLiteral("http://inf.mit.bme.hu/petrinet/2014", "Transition"), "http://inf.mit.bme.hu/petrinet/2014/Transition");
      	new TypeUnary(body, var_pl, getClassifierLiteral("http://inf.mit.bme.hu/petrinet/2014", "Place"), "http://inf.mit.bme.hu/petrinet/2014/Place");
      	new TypeUnary(body, var_n, getClassifierLiteral("http://inf.mit.bme.hu/petrinet/2014", "PetriNet"), "http://inf.mit.bme.hu/petrinet/2014/PetriNet");
      	new TypeBinary(body, CONTEXT, var_n, var__virtual_0_, getFeatureLiteral("http://inf.mit.bme.hu/petrinet/2014", "PetriNet", "transitions"), "http://inf.mit.bme.hu/petrinet/2014/PetriNet.transitions");
      	new Equality(body, var__virtual_0_, var_t);
      	new TypeUnary(body, var_n, getClassifierLiteral("http://inf.mit.bme.hu/petrinet/2014", "PetriNet"), "http://inf.mit.bme.hu/petrinet/2014/PetriNet");
      	new TypeBinary(body, CONTEXT, var_n, var__virtual_1_, getFeatureLiteral("http://inf.mit.bme.hu/petrinet/2014", "PetriNet", "places"), "http://inf.mit.bme.hu/petrinet/2014/PetriNet.places");
      	new Equality(body, var__virtual_1_, var_pl);
      	new TypeUnary(body, var_t, getClassifierLiteral("http://inf.mit.bme.hu/petrinet/2014", "Transition"), "http://inf.mit.bme.hu/petrinet/2014/Transition");
      	new TypeBinary(body, CONTEXT, var_t, var__virtual_2_, getFeatureLiteral("http://inf.mit.bme.hu/petrinet/2014", "Transition", "outArcs"), "http://inf.mit.bme.hu/petrinet/2014/Transition.outArcs");
      	new Equality(body, var__virtual_2_, var_arc);
      	new TypeUnary(body, var_arc, getClassifierLiteral("http://inf.mit.bme.hu/petrinet/2014", "TPArc"), "http://inf.mit.bme.hu/petrinet/2014/TPArc");
      	new TypeBinary(body, CONTEXT, var_arc, var__virtual_3_, getFeatureLiteral("http://inf.mit.bme.hu/petrinet/2014", "TPArc", "target"), "http://inf.mit.bme.hu/petrinet/2014/TPArc.target");
      	new Equality(body, var__virtual_3_, var_pl);
      	bodies.add(body);
      }
      	{
      	PAnnotation annotation = new PAnnotation("Edge");
      	annotation.addAttribute("source", new ParameterReference("t"));
      	annotation.addAttribute("target", new ParameterReference("pl"));
      	addAnnotation(annotation);
      }
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
