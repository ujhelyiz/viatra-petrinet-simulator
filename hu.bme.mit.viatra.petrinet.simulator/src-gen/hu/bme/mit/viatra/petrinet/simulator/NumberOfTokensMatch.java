package hu.bme.mit.viatra.petrinet.simulator;

import hu.bme.mit.viatra.petrinet.model.petrinet.Place;
import hu.bme.mit.viatra.petrinet.simulator.util.NumberOfTokensQuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.viatra.petrinet.simulator.numberOfTokens pattern,
 * to be used in conjunction with {@link NumberOfTokensMatcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see NumberOfTokensMatcher
 * @see NumberOfTokensProcessor
 * 
 */
@SuppressWarnings("all")
public abstract class NumberOfTokensMatch extends BasePatternMatch {
  private Place fPl;
  
  private Integer fNo;
  
  private static List<String> parameterNames = makeImmutableList("pl", "no");
  
  private NumberOfTokensMatch(final Place pPl, final Integer pNo) {
    this.fPl = pPl;
    this.fNo = pNo;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("pl".equals(parameterName)) return this.fPl;
    if ("no".equals(parameterName)) return this.fNo;
    return null;
  }
  
  public Place getPl() {
    return this.fPl;
  }
  
  public Integer getNo() {
    return this.fNo;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("pl".equals(parameterName) ) {
    	this.fPl = (hu.bme.mit.viatra.petrinet.model.petrinet.Place) newValue;
    	return true;
    }
    if ("no".equals(parameterName) ) {
    	this.fNo = (java.lang.Integer) newValue;
    	return true;
    }
    return false;
  }
  
  public void setPl(final Place pPl) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPl = pPl;
  }
  
  public void setNo(final Integer pNo) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fNo = pNo;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.viatra.petrinet.simulator.numberOfTokens";
  }
  
  @Override
  public List<String> parameterNames() {
    return NumberOfTokensMatch.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fPl, fNo};
  }
  
  @Override
  public NumberOfTokensMatch toImmutable() {
    return isMutable() ? newMatch(fPl, fNo) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"pl\"=" + prettyPrintValue(fPl) + ", ");
    
    result.append("\"no\"=" + prettyPrintValue(fNo)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fPl == null) ? 0 : fPl.hashCode());
    result = prime * result + ((fNo == null) ? 0 : fNo.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof NumberOfTokensMatch)) { // this should be infrequent
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
    NumberOfTokensMatch other = (NumberOfTokensMatch) obj;
    if (fPl == null) {if (other.fPl != null) return false;}
    else if (!fPl.equals(other.fPl)) return false;
    if (fNo == null) {if (other.fNo != null) return false;}
    else if (!fNo.equals(other.fNo)) return false;
    return true;
  }
  
  @Override
  public NumberOfTokensQuerySpecification specification() {
    try {
    	return NumberOfTokensQuerySpecification.instance();
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
  public static NumberOfTokensMatch newEmptyMatch() {
    return new Mutable(null, null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @param pNo the fixed value of pattern parameter no, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static NumberOfTokensMatch newMutableMatch(final Place pPl, final Integer pNo) {
    return new Mutable(pPl, pNo);
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
  public static NumberOfTokensMatch newMatch(final Place pPl, final Integer pNo) {
    return new Immutable(pPl, pNo);
  }
  
  private static final class Mutable extends NumberOfTokensMatch {
    Mutable(final Place pPl, final Integer pNo) {
      super(pPl, pNo);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends NumberOfTokensMatch {
    Immutable(final Place pPl, final Integer pNo) {
      super(pPl, pNo);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
