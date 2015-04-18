package hu.bme.mit.viatra.petrinet.simulator.util;

import com.google.common.collect.Sets;
import hu.bme.mit.viatra.petrinet.simulator.PlaceWithTokenMatch;
import hu.bme.mit.viatra.petrinet.simulator.PlaceWithTokenMatcher;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeBinary;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;

/**
 * A pattern-specific query specification that can instantiate PlaceWithTokenMatcher in a type-safe way.
 * 
 * @see PlaceWithTokenMatcher
 * @see PlaceWithTokenMatch
 * 
 */
@SuppressWarnings("all")
public final class PlaceWithTokenQuerySpecification extends BaseGeneratedEMFQuerySpecification<PlaceWithTokenMatcher> {
  private PlaceWithTokenQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static PlaceWithTokenQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected PlaceWithTokenMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return PlaceWithTokenMatcher.on(engine);
  }
  
  @Override
  public PlaceWithTokenMatch newEmptyMatch() {
    return PlaceWithTokenMatch.newEmptyMatch();
  }
  
  @Override
  public PlaceWithTokenMatch newMatch(final Object... parameters) {
    return PlaceWithTokenMatch.newMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Place) parameters[0], (hu.bme.mit.viatra.petrinet.model.petrinet.Token) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static PlaceWithTokenQuerySpecification INSTANCE = make();
    
    public static PlaceWithTokenQuerySpecification make() {
      return new PlaceWithTokenQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static PlaceWithTokenQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
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
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_pl = body.getOrCreateVariableByName("pl");
      	PVariable var_to = body.getOrCreateVariableByName("to");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_pl, "pl"),
      				
      		new ExportedParameter(body, var_to, "to")
      	));
      	new TypeUnary(body, var_pl, getClassifierLiteral("http://inf.mit.bme.hu/petrinet/2014", "Place"), "http://inf.mit.bme.hu/petrinet/2014/Place");
      	new TypeUnary(body, var_to, getClassifierLiteral("http://inf.mit.bme.hu/petrinet/2014", "Token"), "http://inf.mit.bme.hu/petrinet/2014/Token");
      	new TypeUnary(body, var_pl, getClassifierLiteral("http://inf.mit.bme.hu/petrinet/2014", "Place"), "http://inf.mit.bme.hu/petrinet/2014/Place");
      	new TypeBinary(body, CONTEXT, var_pl, var__virtual_0_, getFeatureLiteral("http://inf.mit.bme.hu/petrinet/2014", "Place", "tokens"), "http://inf.mit.bme.hu/petrinet/2014/Place.tokens");
      	new Equality(body, var__virtual_0_, var_to);
      	bodies.add(body);
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
