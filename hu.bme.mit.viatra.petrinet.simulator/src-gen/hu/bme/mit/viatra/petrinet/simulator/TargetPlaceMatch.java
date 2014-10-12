package hu.bme.mit.viatra.petrinet.simulator;

import hu.bme.mit.viatra.petrinet.model.petrinet.Place;
import hu.bme.mit.viatra.petrinet.model.petrinet.Transition;
import hu.bme.mit.viatra.petrinet.simulator.util.TargetPlaceQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.viatra.petrinet.simulator.targetPlace pattern,
 * to be used in conjunction with {@link TargetPlaceMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see TargetPlaceMatcher
 * @see TargetPlaceProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class TargetPlaceMatch extends BasePatternMatch {
  private Transition fT;
  
  private Place fPl;
  
  private static List<String> parameterNames = makeImmutableList("t", "pl");
  
  private TargetPlaceMatch(final Transition pT, final Place pPl) {
    this.fT = pT;
    this.fPl = pPl;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("t".equals(parameterName)) return this.fT;
    if ("pl".equals(parameterName)) return this.fPl;
    return null;
  }
  
  public Transition getT() {
    return this.fT;
  }
  
  public Place getPl() {
    return this.fPl;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("t".equals(parameterName) ) {
    	this.fT = (hu.bme.mit.viatra.petrinet.model.petrinet.Transition) newValue;
    	return true;
    }
    if ("pl".equals(parameterName) ) {
    	this.fPl = (hu.bme.mit.viatra.petrinet.model.petrinet.Place) newValue;
    	return true;
    }
    return false;
  }
  
  public void setT(final Transition pT) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fT = pT;
  }
  
  public void setPl(final Place pPl) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPl = pPl;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.viatra.petrinet.simulator.targetPlace";
  }
  
  @Override
  public List<String> parameterNames() {
    return TargetPlaceMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fT, fPl};
  }
  
  @Override
  public TargetPlaceMatch toImmutable() {
    return isMutable() ? newMatch(fT, fPl) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"t\"=" + prettyPrintValue(fT) + ", ");
    
    result.append("\"pl\"=" + prettyPrintValue(fPl)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fT == null) ? 0 : fT.hashCode());
    result = prime * result + ((fPl == null) ? 0 : fPl.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof TargetPlaceMatch)) { // this should be infrequent
    	if (obj == null) {
    		return false;
    	}
    	if (!(obj instanceof IPatternMatch)) {
    		return false;
    	}
    	IPatternMatch otherSig  = (IPatternMatch) obj;
    	if (!specification().equals(otherSig.specification()))
    		return false;
    	return Arrays.deepEquals(toArray(), otherSig.toArray());
    }
    TargetPlaceMatch other = (TargetPlaceMatch) obj;
    if (fT == null) {if (other.fT != null) return false;}
    else if (!fT.equals(other.fT)) return false;
    if (fPl == null) {if (other.fPl != null) return false;}
    else if (!fPl.equals(other.fPl)) return false;
    return true;
  }
  
  @Override
  public TargetPlaceQuerySpecification specification() {
    try {
    	return TargetPlaceQuerySpecification.instance();
    } catch (IncQueryException ex) {
     	// This cannot happen, as the match object can only be instantiated if the query specification exists
     	throw new IllegalStateException (ex);
    }
  }
  
  /**
   * Returns an empty, mutable match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @return the empty match.
   * 
   */
  public static TargetPlaceMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pT the fixed value of pattern parameter t, or null if not bound.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static TargetPlaceMatch newMutableMatch(final Transition pT, final Place pPl) {
    return new Mutable(pT, pPl);
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
  public static TargetPlaceMatch newMatch(final Transition pT, final Place pPl) {
    return new Immutable(pT, pPl);
  }
  
  private static final class Mutable extends TargetPlaceMatch {
    Mutable(final Transition pT, final Place pPl) {
      super(pT, pPl);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends TargetPlaceMatch {
    Immutable(final Transition pT, final Place pPl) {
      super(pT, pPl);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
