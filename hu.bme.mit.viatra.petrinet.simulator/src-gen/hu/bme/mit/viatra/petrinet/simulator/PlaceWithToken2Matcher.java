package hu.bme.mit.viatra.petrinet.simulator;

import hu.bme.mit.viatra.petrinet.model.petrinet.Place;
import hu.bme.mit.viatra.petrinet.simulator.PlaceWithToken2Match;
import hu.bme.mit.viatra.petrinet.simulator.util.PlaceWithToken2QuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.viatra.petrinet.simulator.placeWithToken2 pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link PlaceWithToken2Match}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern placeWithToken2(pl : Place) {
 * 	find placeWithToken(pl, _);
 * }
 * </pre></code>
 * 
 * @see PlaceWithToken2Match
 * @see PlaceWithToken2Processor
 * @see PlaceWithToken2QuerySpecification
 * 
 */
@SuppressWarnings("all")
public class PlaceWithToken2Matcher extends BaseMatcher<PlaceWithToken2Match> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static PlaceWithToken2Matcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    PlaceWithToken2Matcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new PlaceWithToken2Matcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_PL = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(PlaceWithToken2Matcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public PlaceWithToken2Matcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public PlaceWithToken2Matcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @return matches represented as a PlaceWithToken2Match object.
   * 
   */
  public Collection<PlaceWithToken2Match> getAllMatches(final Place pPl) {
    return rawGetAllMatches(new Object[]{pPl});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @return a match represented as a PlaceWithToken2Match object, or null if no match is found.
   * 
   */
  public PlaceWithToken2Match getOneArbitraryMatch(final Place pPl) {
    return rawGetOneArbitraryMatch(new Object[]{pPl});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Place pPl) {
    return rawHasMatch(new Object[]{pPl});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Place pPl) {
    return rawCountMatches(new Object[]{pPl});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Place pPl, final IMatchProcessor<? super PlaceWithToken2Match> processor) {
    rawForEachMatch(new Object[]{pPl}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Place pPl, final IMatchProcessor<? super PlaceWithToken2Match> processor) {
    return rawForOneArbitraryMatch(new Object[]{pPl}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public PlaceWithToken2Match newMatch(final Place pPl) {
    return PlaceWithToken2Match.newMatch(pPl);
  }
  
  /**
   * Retrieve the set of values that occur in matches for pl.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Place> rawAccumulateAllValuesOfpl(final Object[] parameters) {
    Set<Place> results = new HashSet<Place>();
    rawAccumulateAllValues(POSITION_PL, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for pl.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Place> getAllValuesOfpl() {
    return rawAccumulateAllValuesOfpl(emptyArray());
  }
  
  @Override
  protected PlaceWithToken2Match tupleToMatch(final Tuple t) {
    try {
    	return PlaceWithToken2Match.newMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Place) t.get(POSITION_PL));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected PlaceWithToken2Match arrayToMatch(final Object[] match) {
    try {
    	return PlaceWithToken2Match.newMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Place) match[POSITION_PL]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected PlaceWithToken2Match arrayToMatchMutable(final Object[] match) {
    try {
    	return PlaceWithToken2Match.newMutableMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Place) match[POSITION_PL]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<PlaceWithToken2Matcher> querySpecification() throws IncQueryException {
    return PlaceWithToken2QuerySpecification.instance();
  }
}
