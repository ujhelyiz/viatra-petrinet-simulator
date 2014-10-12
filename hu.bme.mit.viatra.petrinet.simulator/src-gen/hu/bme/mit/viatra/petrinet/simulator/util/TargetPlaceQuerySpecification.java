package hu.bme.mit.viatra.petrinet.simulator.util;

import com.google.common.collect.Sets;
import hu.bme.mit.viatra.petrinet.simulator.TargetPlaceMatch;
import hu.bme.mit.viatra.petrinet.simulator.TargetPlaceMatcher;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;

/**
 * A pattern-specific query specification that can instantiate TargetPlaceMatcher in a type-safe way.
 * 
 * @see TargetPlaceMatcher
 * @see TargetPlaceMatch
 * 
 */
@SuppressWarnings("all")
public final class TargetPlaceQuerySpecification extends BaseGeneratedQuerySpecification<TargetPlaceMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static TargetPlaceQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
  }
  
  @Override
  protected TargetPlaceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return TargetPlaceMatcher.on(engine);
  }
  
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
  public TargetPlaceMatch newEmptyMatch() {
    return TargetPlaceMatch.newEmptyMatch();
  }
  
  @Override
  public TargetPlaceMatch newMatch(final Object... parameters) {
    return TargetPlaceMatch.newMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Transition) parameters[0], (hu.bme.mit.viatra.petrinet.model.petrinet.Place) parameters[1]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody>  bodies = Sets.newLinkedHashSet();
    
    {
    	PBody body = new PBody(this);
    	PVariable var_t = body.getOrCreateVariableByName("t");
    	PVariable var_pl = body.getOrCreateVariableByName("pl");
    	PVariable var_n = body.getOrCreateVariableByName("n");
    	PVariable var_arc = body.getOrCreateVariableByName("arc");
    	body.setExportedParameters(Arrays.<ExportedParameter>asList(
    		new ExportedParameter(body, var_t, "t"),
    		
    		new ExportedParameter(body, var_pl, "pl")
    	));
    new TypeBinary(body, CONTEXT, var_n, var_t, getFeatureLiteral("http://inf.mit.bme.hu/petrinet/2014", "PetriNet", "transitions"), "http://inf.mit.bme.hu/petrinet/2014/PetriNet.transitions");
    new TypeBinary(body, CONTEXT, var_n, var_pl, getFeatureLiteral("http://inf.mit.bme.hu/petrinet/2014", "PetriNet", "places"), "http://inf.mit.bme.hu/petrinet/2014/PetriNet.places");
    new TypeBinary(body, CONTEXT, var_t, var_arc, getFeatureLiteral("http://inf.mit.bme.hu/petrinet/2014", "Transition", "outArcs"), "http://inf.mit.bme.hu/petrinet/2014/Transition.outArcs");
    new TypeBinary(body, CONTEXT, var_arc, var_pl, getFeatureLiteral("http://inf.mit.bme.hu/petrinet/2014", "TPArc", "target"), "http://inf.mit.bme.hu/petrinet/2014/TPArc.target");
    	bodies.add(body);
    }
    {
    	PAnnotation annotation = new PAnnotation("Edge");
    	annotation.addAttribute("source", new ParameterReference("t"));
    	annotation.addAttribute("target", new ParameterReference("pl"));
    	addAnnotation(annotation);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static TargetPlaceQuerySpecification INSTANCE = make();
    
    public static TargetPlaceQuerySpecification make() {
      return new TargetPlaceQuerySpecification();					
    }
  }
}
