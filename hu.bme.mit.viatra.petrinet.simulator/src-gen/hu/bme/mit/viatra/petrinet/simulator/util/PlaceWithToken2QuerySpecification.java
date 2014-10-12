package hu.bme.mit.viatra.petrinet.simulator.util;

import com.google.common.collect.Sets;
import hu.bme.mit.viatra.petrinet.simulator.PlaceWithToken2Match;
import hu.bme.mit.viatra.petrinet.simulator.PlaceWithToken2Matcher;
import hu.bme.mit.viatra.petrinet.simulator.util.PlaceWithTokenQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate PlaceWithToken2Matcher in a type-safe way.
 * 
 * @see PlaceWithToken2Matcher
 * @see PlaceWithToken2Match
 * 
 */
@SuppressWarnings("all")
public final class PlaceWithToken2QuerySpecification extends BaseGeneratedQuerySpecification<PlaceWithToken2Matcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static PlaceWithToken2QuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
  }
  
  @Override
  protected PlaceWithToken2Matcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return PlaceWithToken2Matcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.viatra.petrinet.simulator.placeWithToken2";
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("pl");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("pl", "hu.bme.mit.viatra.petrinet.model.petrinet.Place"));
  }
  
  @Override
  public PlaceWithToken2Match newEmptyMatch() {
    return PlaceWithToken2Match.newEmptyMatch();
  }
  
  @Override
  public PlaceWithToken2Match newMatch(final Object... parameters) {
    return PlaceWithToken2Match.newMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Place) parameters[0]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody>  bodies = Sets.newLinkedHashSet();
    
    {
    	PBody body = new PBody(this);
    	PVariable var_pl = body.getOrCreateVariableByName("pl");
    	PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
    	body.setExportedParameters(Arrays.<ExportedParameter>asList(
    		new ExportedParameter(body, var_pl, "pl")
    	));
    new TypeUnary(body, var_pl, getClassifierLiteral("http://inf.mit.bme.hu/petrinet/2014", "Place"), "http://inf.mit.bme.hu/petrinet/2014/Place");
    	new PositivePatternCall(body, new FlatTuple(var_pl, var___0_), PlaceWithTokenQuerySpecification.instance().instance());
    	bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static PlaceWithToken2QuerySpecification INSTANCE = make();
    
    public static PlaceWithToken2QuerySpecification make() {
      return new PlaceWithToken2QuerySpecification();					
    }
  }
}
