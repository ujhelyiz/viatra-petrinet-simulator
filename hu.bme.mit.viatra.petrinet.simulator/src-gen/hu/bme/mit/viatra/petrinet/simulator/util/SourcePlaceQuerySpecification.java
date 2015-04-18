package hu.bme.mit.viatra.petrinet.simulator.util;

import com.google.common.collect.Sets;
import hu.bme.mit.viatra.petrinet.simulator.SourcePlaceMatch;
import hu.bme.mit.viatra.petrinet.simulator.SourcePlaceMatcher;
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
 * A pattern-specific query specification that can instantiate SourcePlaceMatcher in a type-safe way.
 * 
 * @see SourcePlaceMatcher
 * @see SourcePlaceMatch
 * 
 */
@SuppressWarnings("all")
public final class SourcePlaceQuerySpecification extends BaseGeneratedEMFQuerySpecification<SourcePlaceMatcher> {
  private SourcePlaceQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static SourcePlaceQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected SourcePlaceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return SourcePlaceMatcher.on(engine);
  }
  
  @Override
  public SourcePlaceMatch newEmptyMatch() {
    return SourcePlaceMatch.newEmptyMatch();
  }
  
  @Override
  public SourcePlaceMatch newMatch(final Object... parameters) {
    return SourcePlaceMatch.newMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Transition) parameters[0], (hu.bme.mit.viatra.petrinet.model.petrinet.Place) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static SourcePlaceQuerySpecification INSTANCE = make();
    
    public static SourcePlaceQuerySpecification make() {
      return new SourcePlaceQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static SourcePlaceQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
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
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_t = body.getOrCreateVariableByName("t");
      	PVariable var_pl = body.getOrCreateVariableByName("pl");
      	PVariable var_net = body.getOrCreateVariableByName("net");
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
      	new TypeUnary(body, var_net, getClassifierLiteral("http://inf.mit.bme.hu/petrinet/2014", "PetriNet"), "http://inf.mit.bme.hu/petrinet/2014/PetriNet");
      	new TypeBinary(body, CONTEXT, var_net, var__virtual_0_, getFeatureLiteral("http://inf.mit.bme.hu/petrinet/2014", "PetriNet", "transitions"), "http://inf.mit.bme.hu/petrinet/2014/PetriNet.transitions");
      	new Equality(body, var__virtual_0_, var_t);
      	new TypeUnary(body, var_net, getClassifierLiteral("http://inf.mit.bme.hu/petrinet/2014", "PetriNet"), "http://inf.mit.bme.hu/petrinet/2014/PetriNet");
      	new TypeBinary(body, CONTEXT, var_net, var__virtual_1_, getFeatureLiteral("http://inf.mit.bme.hu/petrinet/2014", "PetriNet", "places"), "http://inf.mit.bme.hu/petrinet/2014/PetriNet.places");
      	new Equality(body, var__virtual_1_, var_pl);
      	new TypeUnary(body, var_pl, getClassifierLiteral("http://inf.mit.bme.hu/petrinet/2014", "Place"), "http://inf.mit.bme.hu/petrinet/2014/Place");
      	new TypeBinary(body, CONTEXT, var_pl, var__virtual_2_, getFeatureLiteral("http://inf.mit.bme.hu/petrinet/2014", "Place", "outArcs"), "http://inf.mit.bme.hu/petrinet/2014/Place.outArcs");
      	new Equality(body, var__virtual_2_, var_arc);
      	new TypeUnary(body, var_arc, getClassifierLiteral("http://inf.mit.bme.hu/petrinet/2014", "PTArc"), "http://inf.mit.bme.hu/petrinet/2014/PTArc");
      	new TypeBinary(body, CONTEXT, var_arc, var__virtual_3_, getFeatureLiteral("http://inf.mit.bme.hu/petrinet/2014", "PTArc", "target"), "http://inf.mit.bme.hu/petrinet/2014/PTArc.target");
      	new Equality(body, var__virtual_3_, var_t);
      	bodies.add(body);
      }
      	{
      	PAnnotation annotation = new PAnnotation("Edge");
      	annotation.addAttribute("source", new ParameterReference("pl"));
      	annotation.addAttribute("target", new ParameterReference("t"));
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
