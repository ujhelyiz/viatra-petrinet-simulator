package hu.bme.mit.viatra.petrinet.simulator;

import hu.bme.mit.viatra.petrinet.model.petrinet.Place;
import hu.bme.mit.viatra.petrinet.model.petrinet.Transition;
import hu.bme.mit.viatra.petrinet.simulator.TargetPlaceMatch;
import hu.bme.mit.viatra.petrinet.simulator.util.TargetPlaceQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.viatra.petrinet.simulator.targetPlace pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link TargetPlaceMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * //pattern sourcePlaceInhibitor(Transition, Place) {
 * //		'PetriNet'(PN);
 * //		'PetriNet'.'Transition'(Transition);
 * //		'PetriNet'.'transitions'(X1, PN, Transition);
 * //		'PetriNet'.'Place'(Place);
 * //		'PetriNet'.'places'(X2, PN, Place);
 * //		'PetriNet'.'Place'.'InhibitorArc'(OutArc, Place, Transition);
 * //	}
 * 
 *  'Place' is a target place for transition 'Transition'.  
 * {@literal @}Edge(source = t, target = pl)
 * pattern targetPlace(t : Transition, pl : Place) {
 * 	PetriNet.transitions(n, t);
 * 	PetriNet.places(n, pl);
 * 	Transition.outArcs(t, arc);
 * 	TPArc.target(arc, pl);
 * }
 * </pre></code>
 * 
 * @see TargetPlaceMatch
 * @see TargetPlaceProcessor
 * @see TargetPlaceQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class TargetPlaceMatcher extends BaseMatcher<TargetPlaceMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static TargetPlaceMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    TargetPlaceMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new TargetPlaceMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_T = 0;
  
  private final static int POSITION_PL = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(TargetPlaceMatcher.class);
  
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
  public TargetPlaceMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public TargetPlaceMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pT the fixed value of pattern parameter t, or null if not bound.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @return matches represented as a TargetPlaceMatch object.
   * 
   */
  public Collection<TargetPlaceMatch> getAllMatches(final Transition pT, final Place pPl) {
    return rawGetAllMatches(new Object[]{pT, pPl});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pT the fixed value of pattern parameter t, or null if not bound.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @return a match represented as a TargetPlaceMatch object, or null if no match is found.
   * 
   */
  public TargetPlaceMatch getOneArbitraryMatch(final Transition pT, final Place pPl) {
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
  public void forEachMatch(final Transition pT, final Place pPl, final IMatchProcessor<? super TargetPlaceMatch> processor) {
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
  public boolean forOneArbitraryMatch(final Transition pT, final Place pPl, final IMatchProcessor<? super TargetPlaceMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pT, pPl}, processor);
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
  public TargetPlaceMatch newMatch(final Transition pT, final Place pPl) {
    return TargetPlaceMatch.newMatch(pT, pPl);
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
  public Set<Transition> getAllValuesOft(final TargetPlaceMatch partialMatch) {
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
  public Set<Place> getAllValuesOfpl(final TargetPlaceMatch partialMatch) {
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
  protected TargetPlaceMatch tupleToMatch(final Tuple t) {
    try {
    	return TargetPlaceMatch.newMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Transition) t.get(POSITION_T), (hu.bme.mit.viatra.petrinet.model.petrinet.Place) t.get(POSITION_PL));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected TargetPlaceMatch arrayToMatch(final Object[] match) {
    try {
    	return TargetPlaceMatch.newMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Transition) match[POSITION_T], (hu.bme.mit.viatra.petrinet.model.petrinet.Place) match[POSITION_PL]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected TargetPlaceMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return TargetPlaceMatch.newMutableMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Transition) match[POSITION_T], (hu.bme.mit.viatra.petrinet.model.petrinet.Place) match[POSITION_PL]);
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
  public static IQuerySpecification<TargetPlaceMatcher> querySpecification() throws IncQueryException {
    return TargetPlaceQuerySpecification.instance();
  }
}
