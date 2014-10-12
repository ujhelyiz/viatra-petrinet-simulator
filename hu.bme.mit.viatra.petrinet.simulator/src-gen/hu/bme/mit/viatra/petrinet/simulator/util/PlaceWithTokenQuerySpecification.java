package hu.bme.mit.viatra.petrinet.simulator.util;

import com.google.common.collect.Sets;
import hu.bme.mit.viatra.petrinet.simulator.PlaceWithTokenMatch;
import hu.bme.mit.viatra.petrinet.simulator.PlaceWithTokenMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;

/**
 * A pattern-specific query specification that can instantiate PlaceWithTokenMatcher in a type-safe way.
 * 
 * @see PlaceWithTokenMatcher
 * @see PlaceWithTokenMatch
 * 
 */
@SuppressWarnings("all")
public final class PlaceWithTokenQuerySpecification extends BaseGeneratedQuerySpecification<PlaceWithTokenMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static PlaceWithTokenQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
  }
  
  @Override
  protected PlaceWithTokenMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return PlaceWithTokenMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.viatra.petrinet.simulator.placeWithToken";
  }
  
  @Override
  public List<String> getParameterNames() {
    return Arrays.asList("pl","to");
  }
  
  @Override
  public List<PParameter> getParameters() {
    return Arrays.asList(new PParameter("pl", "hu.bme.mit.viatra.petrinet.model.petrinet.Place"),new PParameter("to", "hu.bme.mit.viatra.petrinet.model.petrinet.Token"));
  }
  
  @Override
  public PlaceWithTokenMatch newEmptyMatch() {
    return PlaceWithTokenMatch.newEmptyMatch();
  }
  
  @Override
  public PlaceWithTokenMatch newMatch(final Object... parameters) {
    return PlaceWithTokenMatch.newMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Place) parameters[0], (hu.bme.mit.viatra.petrinet.model.petrinet.Token) parameters[1]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody>  bodies = Sets.newLinkedHashSet();
    
    {
    	PBody body = new PBody(this);
    	PVariable var_pl = body.getOrCreateVariableByName("pl");
    	PVariable var_to = body.getOrCreateVariableByName("to");
    	body.setExportedParameters(Arrays.<ExportedParameter>asList(
    		new ExportedParameter(body, var_pl, "pl"),
    		
    		new ExportedParameter(body, var_to, "to")
    	));
    new TypeBinary(body, CONTEXT, var_pl, var_to, getFeatureLiteral("http://inf.mit.bme.hu/petrinet/2014", "Place", "tokens"), "http://inf.mit.bme.hu/petrinet/2014/Place.tokens");
    	bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static PlaceWithTokenQuerySpecification INSTANCE = make();
    
    public static PlaceWithTokenQuerySpecification make() {
      return new PlaceWithTokenQuerySpecification();					
    }
  }
}
