package hu.bme.mit.viatra.petrinet.simulator.util;

import hu.bme.mit.viatra.petrinet.model.petrinet.Place;
import hu.bme.mit.viatra.petrinet.model.petrinet.Token;
import hu.bme.mit.viatra.petrinet.simulator.PlaceWithTokenMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.viatra.petrinet.simulator.placeWithToken pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class PlaceWithTokenProcessor implements IMatchProcessor<PlaceWithTokenMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pPl the value of pattern parameter pl in the currently processed match
   * @param pTo the value of pattern parameter to in the currently processed match
   * 
   */
  public abstract void process(final Place pPl, final Token pTo);
  
  @Override
  public void process(final PlaceWithTokenMatch match) {
    process(match.getPl(), match.getTo());
  }
}
