package hu.bme.mit.viatra.petrinet.simulator;

import hu.bme.mit.viatra.petrinet.model.petrinet.Place;
import hu.bme.mit.viatra.petrinet.model.petrinet.Transition;
import hu.bme.mit.viatra.petrinet.simulator.SourcePlaceMatch;
import hu.bme.mit.viatra.petrinet.simulator.util.SourcePlaceQuerySpecification;
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
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.viatra.petrinet.simulator.sourcePlace pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link SourcePlaceMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * // 'Place' is a source place for transition 'Transition'.
 * {@literal @}Edge(source = pl, target = t)
 * pattern sourcePlace(t : Transition, pl : Place) {
 * 	PetriNet.transitions(net, t);
 * 	PetriNet.places(net, pl);
 * 	Place.outArcs(pl, arc);
 * 	PTArc.target(arc, t);
 * }
 * </pre></code>
 * 
 * @see SourcePlaceMatch
 * @see SourcePlaceProcessor
 * @see SourcePlaceQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class SourcePlaceMatcher extends BaseMatcher<SourcePlaceMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static SourcePlaceMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    SourcePlaceMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new SourcePlaceMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_T = 0;
  
  private final static int POSITION_PL = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(SourcePlaceMatcher.class);
  
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
  public SourcePlaceMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public SourcePlaceMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pT the fixed value of pattern parameter t, or null if not bound.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @return matches represented as a SourcePlaceMatch object.
   * 
   */
  public Collection<SourcePlaceMatch> getAllMatches(final Transition pT, final Place pPl) {
    return rawGetAllMatches(new Object[]{pT, pPl});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pT the fixed value of pattern parameter t, or null if not bound.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @return a match represented as a SourcePlaceMatch object, or null if no match is found.
   * 
   */
  public SourcePlaceMatch getOneArbitraryMatch(final Transition pT, final Place pPl) {
    return rawGetOneArbitraryMatch(new Object[]{pT, pPl});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pT the fixed value of pattern parameter t, or null if not bound.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Transition pT, final Place pPl) {
    return rawHasMatch(new Object[]{pT, pPl});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pT the fixed value of pattern parameter t, or null if not bound.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Transition pT, final Place pPl) {
    return rawCountMatches(new Object[]{pT, pPl});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pT the fixed value of pattern parameter t, or null if not bound.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Transition pT, final Place pPl, final IMatchProcessor<? super SourcePlaceMatch> processor) {
    rawForEachMatch(new Object[]{pT, pPl}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pT the fixed value of pattern parameter t, or null if not bound.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Transition pT, final Place pPl, final IMatchProcessor<? super SourcePlaceMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pT, pPl}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pT the fixed value of pattern parameter t, or null if not bound.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<SourcePlaceMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Transition pT, final Place pPl) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pT, pPl});
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pT the fixed value of pattern parameter t, or null if not bound.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public SourcePlaceMatch newMatch(final Transition pT, final Place pPl) {
    return SourcePlaceMatch.newMatch(pT, pPl);
  }
  
  /**
   * Retrieve the set of values that occur in matches for t.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Transition> rawAccumulateAllValuesOft(final Object[] parameters) {
    Set<Transition> results = new HashSet<Transition>();
    rawAccumulateAllValues(POSITION_T, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for t.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Transition> getAllValuesOft() {
    return rawAccumulateAllValuesOft(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for t.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Transition> getAllValuesOft(final SourcePlaceMatch partialMatch) {
    return rawAccumulateAllValuesOft(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for t.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Transition> getAllValuesOft(final Place pPl) {
    return rawAccumulateAllValuesOft(new Object[]{
    null, 
    pPl
    });
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
  
  /**
   * Retrieve the set of values that occur in matches for pl.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Place> getAllValuesOfpl(final SourcePlaceMatch partialMatch) {
    return rawAccumulateAllValuesOfpl(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for pl.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Place> getAllValuesOfpl(final Transition pT) {
    return rawAccumulateAllValuesOfpl(new Object[]{
    pT, 
    null
    });
  }
  
  @Override
  protected SourcePlaceMatch tupleToMatch(final Tuple t) {
    try {
    	return SourcePlaceMatch.newMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Transition) t.get(POSITION_T), (hu.bme.mit.viatra.petrinet.model.petrinet.Place) t.get(POSITION_PL));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SourcePlaceMatch arrayToMatch(final Object[] match) {
    try {
    	return SourcePlaceMatch.newMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Transition) match[POSITION_T], (hu.bme.mit.viatra.petrinet.model.petrinet.Place) match[POSITION_PL]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected SourcePlaceMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return SourcePlaceMatch.newMutableMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Transition) match[POSITION_T], (hu.bme.mit.viatra.petrinet.model.petrinet.Place) match[POSITION_PL]);
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
  public static IQuerySpecification<SourcePlaceMatcher> querySpecification() throws IncQueryException {
    return SourcePlaceQuerySpecification.instance();
  }
}
