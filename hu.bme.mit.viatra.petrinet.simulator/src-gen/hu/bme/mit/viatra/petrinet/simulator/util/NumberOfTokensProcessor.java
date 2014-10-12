package hu.bme.mit.viatra.petrinet.simulator.util;

import hu.bme.mit.viatra.petrinet.model.petrinet.Place;
import hu.bme.mit.viatra.petrinet.simulator.NumberOfTokensMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.viatra.petrinet.simulator.numberOfTokens pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class NumberOfTokensProcessor implements IMatchProcessor<NumberOfTokensMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pPl the value of pattern parameter pl in the currently processed match
   * @param pNo the value of pattern parameter no in the currently processed match
   * 
   */
  public abstract void process(final Place pPl, final Integer pNo);
  
  @Override
  public void process(final NumberOfTokensMatch match) {
    process(match.getPl(), match.getNo());
  }
}
