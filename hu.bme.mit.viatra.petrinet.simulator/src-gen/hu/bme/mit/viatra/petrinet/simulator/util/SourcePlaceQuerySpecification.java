package hu.bme.mit.viatra.petrinet.simulator.util;

import com.google.common.collect.Sets;
import hu.bme.mit.viatra.petrinet.simulator.SourcePlaceMatch;
import hu.bme.mit.viatra.petrinet.simulator.SourcePlaceMatcher;
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
 * A pattern-specific query specification that can instantiate SourcePlaceMatcher in a type-safe way.
 * 
 * @see SourcePlaceMatcher
 * @see SourcePlaceMatch
 * 
 */
@SuppressWarnings("all")
public final class SourcePlaceQuerySpecification extends BaseGeneratedQuerySpecification<SourcePlaceMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SourcePlaceQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
  }
  
  @Override
  protected SourcePlaceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SourcePlaceMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.viatra.petrinet.simulator.sourcePlace";
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
  public SourcePlaceMatch newEmptyMatch() {
    return SourcePlaceMatch.newEmptyMatch();
  }
  
  @Override
  public SourcePlaceMatch newMatch(final Object... parameters) {
    return SourcePlaceMatch.newMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Transition) parameters[0], (hu.bme.mit.viatra.petrinet.model.petrinet.Place) parameters[1]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody>  bodies = Sets.newLinkedHashSet();
    
    {
    	PBody body = new PBody(this);
    	PVariable var_t = body.getOrCreateVariableByName("t");
    	PVariable var_pl = body.getOrCreateVariableByName("pl");
    	PVariable var_net = body.getOrCreateVariableByName("net");
    	PVariable var_arc = body.getOrCreateVariableByName("arc");
    	body.setExportedParameters(Arrays.<ExportedParameter>asList(
    		new ExportedParameter(body, var_t, "t"),
    		
    		new ExportedParameter(body, var_pl, "pl")
    	));
    new TypeBinary(body, CONTEXT, var_net, var_t, getFeatureLiteral("http://inf.mit.bme.hu/petrinet/2014", "PetriNet", "transitions"), "http://inf.mit.bme.hu/petrinet/2014/PetriNet.transitions");
    new TypeBinary(body, CONTEXT, var_net, var_pl, getFeatureLiteral("http://inf.mit.bme.hu/petrinet/2014", "PetriNet", "places"), "http://inf.mit.bme.hu/petrinet/2014/PetriNet.places");
    new TypeBinary(body, CONTEXT, var_pl, var_arc, getFeatureLiteral("http://inf.mit.bme.hu/petrinet/2014", "Place", "outArcs"), "http://inf.mit.bme.hu/petrinet/2014/Place.outArcs");
    new TypeBinary(body, CONTEXT, var_arc, var_t, getFeatureLiteral("http://inf.mit.bme.hu/petrinet/2014", "PTArc", "target"), "http://inf.mit.bme.hu/petrinet/2014/PTArc.target");
    	bodies.add(body);
    }
    {
    	PAnnotation annotation = new PAnnotation("Edge");
    	annotation.addAttribute("source", new ParameterReference("pl"));
    	annotation.addAttribute("target", new ParameterReference("t"));
    	addAnnotation(annotation);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static SourcePlaceQuerySpecification INSTANCE = make();
    
    public static SourcePlaceQuerySpecification make() {
      return new SourcePlaceQuerySpecification();					
    }
  }
}
