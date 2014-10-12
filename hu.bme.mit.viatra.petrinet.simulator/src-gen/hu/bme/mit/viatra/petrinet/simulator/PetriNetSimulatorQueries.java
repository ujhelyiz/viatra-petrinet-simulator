package hu.bme.mit.viatra.petrinet.simulator;

import hu.bme.mit.viatra.petrinet.simulator.FireableTransitionMatcher;
import hu.bme.mit.viatra.petrinet.simulator.NotFireableMatcher;
import hu.bme.mit.viatra.petrinet.simulator.NumberOfTokensMatcher;
import hu.bme.mit.viatra.petrinet.simulator.PlaceMatcher;
import hu.bme.mit.viatra.petrinet.simulator.PlaceWithToken2Matcher;
import hu.bme.mit.viatra.petrinet.simulator.PlaceWithTokenMatcher;
import hu.bme.mit.viatra.petrinet.simulator.SourcePlaceMatcher;
import hu.bme.mit.viatra.petrinet.simulator.TargetPlaceMatcher;
import hu.bme.mit.viatra.petrinet.simulator.util.FireableTransitionQuerySpecification;
import hu.bme.mit.viatra.petrinet.simulator.util.NotFireableQuerySpecification;
import hu.bme.mit.viatra.petrinet.simulator.util.NumberOfTokensQuerySpecification;
import hu.bme.mit.viatra.petrinet.simulator.util.PlaceQuerySpecification;
import hu.bme.mit.viatra.petrinet.simulator.util.PlaceWithToken2QuerySpecification;
import hu.bme.mit.viatra.petrinet.simulator.util.PlaceWithTokenQuerySpecification;
import hu.bme.mit.viatra.petrinet.simulator.util.SourcePlaceQuerySpecification;
import hu.bme.mit.viatra.petrinet.simulator.util.TargetPlaceQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in PetriNetSimulatorQueries.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file PetriNetSimulatorQueries.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.viatra.petrinet.simulator, the group contains the definition of the following patterns: <ul>
 * <li>sourcePlace</li>
 * <li>targetPlace</li>
 * <li>placeWithToken</li>
 * <li>placeWithToken2</li>
 * <li>place</li>
 * <li>numberOfTokens</li>
 * <li>notFireable</li>
 * <li>fireableTransition</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class PetriNetSimulatorQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static PetriNetSimulatorQueries instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new PetriNetSimulatorQueries();
    }
    return INSTANCE;
  }
  
  private static PetriNetSimulatorQueries INSTANCE;
  
  private PetriNetSimulatorQueries() throws IncQueryException {
    querySpecifications.add(SourcePlaceQuerySpecification.instance());
    querySpecifications.add(TargetPlaceQuerySpecification.instance());
    querySpecifications.add(PlaceWithTokenQuerySpecification.instance());
    querySpecifications.add(PlaceWithToken2QuerySpecification.instance());
    querySpecifications.add(PlaceQuerySpecification.instance());
    querySpecifications.add(NumberOfTokensQuerySpecification.instance());
    querySpecifications.add(NotFireableQuerySpecification.instance());
    querySpecifications.add(FireableTransitionQuerySpecification.instance());
  }
  
  public SourcePlaceQuerySpecification getSourcePlace() throws IncQueryException {
    return SourcePlaceQuerySpecification.instance();
  }
  
  public SourcePlaceMatcher getSourcePlace(final IncQueryEngine engine) throws IncQueryException {
    return SourcePlaceMatcher.on(engine);
  }
  
  public TargetPlaceQuerySpecification getTargetPlace() throws IncQueryException {
    return TargetPlaceQuerySpecification.instance();
  }
  
  public TargetPlaceMatcher getTargetPlace(final IncQueryEngine engine) throws IncQueryException {
    return TargetPlaceMatcher.on(engine);
  }
  
  public PlaceWithTokenQuerySpecification getPlaceWithToken() throws IncQueryException {
    return PlaceWithTokenQuerySpecification.instance();
  }
  
  public PlaceWithTokenMatcher getPlaceWithToken(final IncQueryEngine engine) throws IncQueryException {
    return PlaceWithTokenMatcher.on(engine);
  }
  
  public PlaceWithToken2QuerySpecification getPlaceWithToken2() throws IncQueryException {
    return PlaceWithToken2QuerySpecification.instance();
  }
  
  public PlaceWithToken2Matcher getPlaceWithToken2(final IncQueryEngine engine) throws IncQueryException {
    return PlaceWithToken2Matcher.on(engine);
  }
  
  public PlaceQuerySpecification getPlace() throws IncQueryException {
    return PlaceQuerySpecification.instance();
  }
  
  public PlaceMatcher getPlace(final IncQueryEngine engine) throws IncQueryException {
    return PlaceMatcher.on(engine);
  }
  
  public NumberOfTokensQuerySpecification getNumberOfTokens() throws IncQueryException {
    return NumberOfTokensQuerySpecification.instance();
  }
  
  public NumberOfTokensMatcher getNumberOfTokens(final IncQueryEngine engine) throws IncQueryException {
    return NumberOfTokensMatcher.on(engine);
  }
  
  public NotFireableQuerySpecification getNotFireable() throws IncQueryException {
    return NotFireableQuerySpecification.instance();
  }
  
  public NotFireableMatcher getNotFireable(final IncQueryEngine engine) throws IncQueryException {
    return NotFireableMatcher.on(engine);
  }
  
  public FireableTransitionQuerySpecification getFireableTransition() throws IncQueryException {
    return FireableTransitionQuerySpecification.instance();
  }
  
  public FireableTransitionMatcher getFireableTransition(final IncQueryEngine engine) throws IncQueryException {
    return FireableTransitionMatcher.on(engine);
  }
}
