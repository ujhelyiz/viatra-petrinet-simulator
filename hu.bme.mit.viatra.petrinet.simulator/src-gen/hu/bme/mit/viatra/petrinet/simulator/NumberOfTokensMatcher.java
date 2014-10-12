package hu.bme.mit.viatra.petrinet.simulator;

import hu.bme.mit.viatra.petrinet.model.petrinet.Place;
import hu.bme.mit.viatra.petrinet.simulator.NumberOfTokensMatch;
import hu.bme.mit.viatra.petrinet.simulator.util.NumberOfTokensQuerySpecification;
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
 * Generated pattern matcher API of the hu.bme.mit.viatra.petrinet.simulator.numberOfTokens pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link NumberOfTokensMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Item(item = pl, label = "$pl.name$ : $no$")
 * pattern numberOfTokens(pl : Place, no) {
 * 	no == count find placeWithToken(pl, _);
 * }
 * </pre></code>
 * 
 * @see NumberOfTokensMatch
 * @see NumberOfTokensProcessor
 * @see NumberOfTokensQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class NumberOfTokensMatcher extends BaseMatcher<NumberOfTokensMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static NumberOfTokensMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    NumberOfTokensMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new NumberOfTokensMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_PL = 0;
  
  private final static int POSITION_NO = 1;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(NumberOfTokensMatcher.class);
  
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
  public NumberOfTokensMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public NumberOfTokensMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @param pNo the fixed value of pattern parameter no, or null if not bound.
   * @return matches represented as a NumberOfTokensMatch object.
   * 
   */
  public Collection<NumberOfTokensMatch> getAllMatches(final Place pPl, final Integer pNo) {
    return rawGetAllMatches(new Object[]{pPl, pNo});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @param pNo the fixed value of pattern parameter no, or null if not bound.
   * @return a match represented as a NumberOfTokensMatch object, or null if no match is found.
   * 
   */
  public NumberOfTokensMatch getOneArbitraryMatch(final Place pPl, final Integer pNo) {
    return rawGetOneArbitraryMatch(new Object[]{pPl, pNo});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @param pNo the fixed value of pattern parameter no, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Place pPl, final Integer pNo) {
    return rawHasMatch(new Object[]{pPl, pNo});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @param pNo the fixed value of pattern parameter no, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Place pPl, final Integer pNo) {
    return rawCountMatches(new Object[]{pPl, pNo});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @param pNo the fixed value of pattern parameter no, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Place pPl, final Integer pNo, final IMatchProcessor<? super NumberOfTokensMatch> processor) {
    rawForEachMatch(new Object[]{pPl, pNo}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @param pNo the fixed value of pattern parameter no, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Place pPl, final Integer pNo, final IMatchProcessor<? super NumberOfTokensMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pPl, pNo}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters.
   * It can also be reset to track changes from a later point in time,
   * and changes can even be acknowledged on an individual basis.
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @param pNo the fixed value of pattern parameter no, or null if not bound.
   * @return the delta monitor.
   * @deprecated use the IncQuery Databinding API (IncQueryObservables) instead.
   * 
   */
  @Deprecated
  public DeltaMonitor<NumberOfTokensMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Place pPl, final Integer pNo) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pPl, pNo});
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @param pNo the fixed value of pattern parameter no, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public NumberOfTokensMatch newMatch(final Place pPl, final Integer pNo) {
    return NumberOfTokensMatch.newMatch(pPl, pNo);
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
  public Set<Place> getAllValuesOfpl(final NumberOfTokensMatch partialMatch) {
    return rawAccumulateAllValuesOfpl(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for pl.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Place> getAllValuesOfpl(final Integer pNo) {
    return rawAccumulateAllValuesOfpl(new Object[]{
    null, 
    pNo
    });
  }
  
  /**
   * Retrieve the set of values that occur in matches for no.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Integer> rawAccumulateAllValuesOfno(final Object[] parameters) {
    Set<Integer> results = new HashSet<Integer>();
    rawAccumulateAllValues(POSITION_NO, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for no.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfno() {
    return rawAccumulateAllValuesOfno(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for no.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfno(final NumberOfTokensMatch partialMatch) {
    return rawAccumulateAllValuesOfno(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for no.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Integer> getAllValuesOfno(final Place pPl) {
    return rawAccumulateAllValuesOfno(new Object[]{
    pPl, 
    null
    });
  }
  
  @Override
  protected NumberOfTokensMatch tupleToMatch(final Tuple t) {
    try {
    	return NumberOfTokensMatch.newMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Place) t.get(POSITION_PL), (java.lang.Integer) t.get(POSITION_NO));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NumberOfTokensMatch arrayToMatch(final Object[] match) {
    try {
    	return NumberOfTokensMatch.newMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Place) match[POSITION_PL], (java.lang.Integer) match[POSITION_NO]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected NumberOfTokensMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return NumberOfTokensMatch.newMutableMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Place) match[POSITION_PL], (java.lang.Integer) match[POSITION_NO]);
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
  public static IQuerySpecification<NumberOfTokensMatcher> querySpecification() throws IncQueryException {
    return NumberOfTokensQuerySpecification.instance();
  }
}
