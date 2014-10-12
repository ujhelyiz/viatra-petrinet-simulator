/**
 */
package hu.bme.mit.viatra.petrinet.model.petrinet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.viatra.petrinet.model.petrinet.Place#getNet <em>Net</em>}</li>
 *   <li>{@link hu.bme.mit.viatra.petrinet.model.petrinet.Place#getOutArcs <em>Out Arcs</em>}</li>
 *   <li>{@link hu.bme.mit.viatra.petrinet.model.petrinet.Place#getInArcs <em>In Arcs</em>}</li>
 *   <li>{@link hu.bme.mit.viatra.petrinet.model.petrinet.Place#getTokens <em>Tokens</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.viatra.petrinet.model.petrinet.PetriNetPackage#getPlace()
 * @model
 * @generated
 */
public interface Place extends NamedElement {
    /**
     * Returns the value of the '<em><b>Net</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link hu.bme.mit.viatra.petrinet.model.petrinet.PetriNet#getPlaces <em>Places</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Net</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Net</em>' container reference.
     * @see #setNet(PetriNet)
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.PetriNetPackage#getPlace_Net()
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.PetriNet#getPlaces
     * @model opposite="places" required="true" transient="false"
     * @generated
     */
    PetriNet getNet();

    /**
     * Sets the value of the '{@link hu.bme.mit.viatra.petrinet.model.petrinet.Place#getNet <em>Net</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Net</em>' container reference.
     * @see #getNet()
     * @generated
     */
    void setNet(PetriNet value);

    /**
     * Returns the value of the '<em><b>Out Arcs</b></em>' containment reference list.
     * The list contents are of type {@link hu.bme.mit.viatra.petrinet.model.petrinet.PTArc}.
     * It is bidirectional and its opposite is '{@link hu.bme.mit.viatra.petrinet.model.petrinet.PTArc#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Out Arcs</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Out Arcs</em>' containment reference list.
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.PetriNetPackage#getPlace_OutArcs()
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.PTArc#getSource
     * @model opposite="source" containment="true"
     * @generated
     */
    EList<PTArc> getOutArcs();

    /**
     * Returns the value of the '<em><b>In Arcs</b></em>' reference list.
     * The list contents are of type {@link hu.bme.mit.viatra.petrinet.model.petrinet.TPArc}.
     * It is bidirectional and its opposite is '{@link hu.bme.mit.viatra.petrinet.model.petrinet.TPArc#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>In Arcs</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>In Arcs</em>' reference list.
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.PetriNetPackage#getPlace_InArcs()
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.TPArc#getTarget
     * @model opposite="target"
     * @generated
     */
    EList<TPArc> getInArcs();

    /**
     * Returns the value of the '<em><b>Tokens</b></em>' containment reference list.
     * The list contents are of type {@link hu.bme.mit.viatra.petrinet.model.petrinet.Token}.
     * It is bidirectional and its opposite is '{@link hu.bme.mit.viatra.petrinet.model.petrinet.Token#getPlace <em>Place</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tokens</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tokens</em>' containment reference list.
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.PetriNetPackage#getPlace_Tokens()
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.Token#getPlace
     * @model opposite="place" containment="true"
     * @generated
     */
    EList<Token> getTokens();

} // Place
