package hu.bme.mit.viatra.petrinet.simulator;

import hu.bme.mit.viatra.petrinet.model.petrinet.Place;
import hu.bme.mit.viatra.petrinet.simulator.util.PlaceWithToken2QuerySpecification;
import java.util.Arrays;
import java.util.List;
import org.eclipse.incquery.runtime.api.IPatternMatch;
import org.eclipse.incquery.runtime.api.impl.BasePatternMatch;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * Pattern-specific match representation of the hu.bme.mit.viatra.petrinet.simulator.placeWithToken2 pattern,
 * to be used in conjunction with {@link PlaceWithToken2Matcher}.
 * 
 * <p>Class fields correspond to parameters of the pattern. Fields with value null are considered unassigned.
 * Each instance is a (possibly partial) substitution of pattern parameters,
 * usable to represent a match of the pattern in the result of a query,
 * or to specify the bound (fixed) input parameters when issuing a query.
 * 
 * @see PlaceWithToken2Matcher
 * @see PlaceWithToken2Processor
 * 
 */
@SuppressWarnings("all")
public abstract class PlaceWithToken2Match extends BasePatternMatch {
  private Place fPl;
  
  private static List<String> parameterNames = makeImmutableList("pl");
  
  private PlaceWithToken2Match(final Place pPl) {
    this.fPl = pPl;
  }
  
  @Override
  public Object get(final String parameterName) {
    if ("pl".equals(parameterName)) return this.fPl;
    return null;
  }
  
  public Place getPl() {
    return this.fPl;
  }
  
  @Override
  public boolean set(final String parameterName, final Object newValue) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    if ("pl".equals(parameterName) ) {
    	this.fPl = (hu.bme.mit.viatra.petrinet.model.petrinet.Place) newValue;
    	return true;
    }
    return false;
  }
  
  public void setPl(final Place pPl) {
    if (!isMutable()) throw new java.lang.UnsupportedOperationException();
    this.fPl = pPl;
  }
  
  @Override
  public String patternName() {
    return "hu.bme.mit.viatra.petrinet.simulator.placeWithToken2";
  }
  
  @Override
  public List<String> parameterNames() {
    return PlaceWithToken2Match.parameterNames;
  }
  
  @Override
  public Object[] toArray() {
    return new Object[]{fPl};
  }
  
  @Override
  public PlaceWithToken2Match toImmutable() {
    return isMutable() ? newMatch(fPl) : this;
  }
  
  @Override
  public String prettyPrint() {
    StringBuilder result = new StringBuilder();
    result.append("\"pl\"=" + prettyPrintValue(fPl)
    );
    return result.toString();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((fPl == null) ? 0 : fPl.hashCode());
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
    	return true;
    if (!(obj instanceof PlaceWithToken2Match)) { // this should be infrequent
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
    PlaceWithToken2Match other = (PlaceWithToken2Match) obj;
    if (fPl == null) {if (other.fPl != null) return false;}
    else if (!fPl.equals(other.fPl)) return false;
    return true;
  }
  
  @Override
  public PlaceWithToken2QuerySpecification specification() {
    try {
    	return PlaceWithToken2QuerySpecification.instance();
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
  public static PlaceWithToken2Match newEmptyMatch() {
    return new Mutable(null);
  }
  
  /**
   * Returns a mutable (partial) match.
   * Fields of the mutable match can be filled to create a partial match, usable as matcher input.
   * 
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @return the new, mutable (partial) match object.
   * 
   */
  public static PlaceWithToken2Match newMutableMatch(final Place pPl) {
    return new Mutable(pPl);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPl the fixed value of pattern parameter pl, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public static PlaceWithToken2Match newMatch(final Place pPl) {
    return new Immutable(pPl);
  }
  
  private static final class Mutable extends PlaceWithToken2Match {
    Mutable(final Place pPl) {
      super(pPl);
    }
    
    @Override
    public boolean isMutable() {
      return true;
    }
  }
  
  private static final class Immutable extends PlaceWithToken2Match {
    Immutable(final Place pPl) {
      super(pPl);
    }
    
    @Override
    public boolean isMutable() {
      return false;
    }
  }
}
