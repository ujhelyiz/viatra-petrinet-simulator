package hu.bme.mit.viatra.petrinet.simulator.util;

import hu.bme.mit.viatra.petrinet.model.petrinet.Place;
import hu.bme.mit.viatra.petrinet.model.petrinet.Transition;
import hu.bme.mit.viatra.petrinet.simulator.SourcePlaceMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.viatra.petrinet.simulator.sourcePlace pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class SourcePlaceProcessor implements IMatchProcessor<SourcePlaceMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter t in the currently processed match
   * @param pPl the value of pattern parameter pl in the currently processed match
   * 
   */
  public abstract void process(final Transition pT, final Place pPl);
  
  @Override
  public void process(final SourcePlaceMatch match) {
    process(match.getT(), match.getPl());
  }
}
