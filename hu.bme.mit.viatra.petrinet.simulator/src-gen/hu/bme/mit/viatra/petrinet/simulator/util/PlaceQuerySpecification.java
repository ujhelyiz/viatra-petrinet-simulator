package hu.bme.mit.viatra.petrinet.simulator.util;

import com.google.common.collect.Sets;
import hu.bme.mit.viatra.petrinet.simulator.PlaceMatch;
import hu.bme.mit.viatra.petrinet.simulator.PlaceMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;

/**
 * A pattern-specific query specification that can instantiate PlaceMatcher in a type-safe way.
 * 
 * @see PlaceMatcher
 * @see PlaceMatch
 * 
 */
@SuppressWarnings("all")
public final class PlaceQuerySpecification extends BaseGeneratedQuerySpecification<PlaceMatcher> {
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static PlaceQuerySpecification instance() throws IncQueryException {
    return LazyHolder.INSTANCE;
  }
  
  @Override
  protected PlaceMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return PlaceMatcher.on(engine);
  }
  
  @Override
  public String getFullyQualifiedName() {
    return "hu.bme.mit.viatra.petrinet.simulator.place";
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
  public PlaceMatch newEmptyMatch() {
    return PlaceMatch.newEmptyMatch();
  }
  
  @Override
  public PlaceMatch newMatch(final Object... parameters) {
    return PlaceMatch.newMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Place) parameters[0]);
  }
  
  @Override
  public Set<PBody> doGetContainedBodies() throws IncQueryException {
    Set<PBody>  bodies = Sets.newLinkedHashSet();
    
    {
    	PBody body = new PBody(this);
    	PVariable var_pl = body.getOrCreateVariableByName("pl");
    	body.setExportedParameters(Arrays.<ExportedParameter>asList(
    		new ExportedParameter(body, var_pl, "pl")
    	));
    new TypeUnary(body, var_pl, getClassifierLiteral("http://inf.mit.bme.hu/petrinet/2014", "Place"), "http://inf.mit.bme.hu/petrinet/2014/Place");
    	bodies.add(body);
    }
    return bodies;
  }
  
  private static class LazyHolder {
    private final static PlaceQuerySpecification INSTANCE = make();
    
    public static PlaceQuerySpecification make() {
      return new PlaceQuerySpecification();					
    }
  }
}
