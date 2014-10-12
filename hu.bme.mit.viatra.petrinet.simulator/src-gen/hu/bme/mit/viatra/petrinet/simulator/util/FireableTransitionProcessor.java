package hu.bme.mit.viatra.petrinet.simulator.util;

import hu.bme.mit.viatra.petrinet.model.petrinet.Transition;
import hu.bme.mit.viatra.petrinet.simulator.FireableTransitionMatch;
import org.eclipse.incquery.runtime.api.IMatchProcessor;

/**
 * A match processor tailored for the hu.bme.mit.viatra.petrinet.simulator.fireableTransition pattern.
 * 
 * Clients should derive an (anonymous) class that implements the abstract process().
 * 
 */
@SuppressWarnings("all")
public abstract class FireableTransitionProcessor implements IMatchProcessor<FireableTransitionMatch> {
  /**
   * Defines the action that is to be executed on each match.
   * @param pT the value of pattern parameter t in the currently processed match
   * 
   */
  public abstract void process(final Transition pT);
  
  @Override
  public void process(final FireableTransitionMatch match) {
    process(match.getT());
  }
}
