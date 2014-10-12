/**
 */
package hu.bme.mit.viatra.petrinet.model.petrinet;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.viatra.petrinet.model.petrinet.PetriNet#getPlaces <em>Places</em>}</li>
 *   <li>{@link hu.bme.mit.viatra.petrinet.model.petrinet.PetriNet#getTransitions <em>Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.viatra.petrinet.model.petrinet.PetriNetPackage#getPetriNet()
 * @model
 * @generated
 */
public interface PetriNet extends EObject {
    /**
     * Returns the value of the '<em><b>Places</b></em>' containment reference list.
     * The list contents are of type {@link hu.bme.mit.viatra.petrinet.model.petrinet.Place}.
     * It is bidirectional and its opposite is '{@link hu.bme.mit.viatra.petrinet.model.petrinet.Place#getNet <em>Net</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Places</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Places</em>' containment reference list.
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.PetriNetPackage#getPetriNet_Places()
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.Place#getNet
     * @model opposite="net" containment="true"
     * @generated
     */
    EList<Place> getPlaces();

    /**
     * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
     * The list contents are of type {@link hu.bme.mit.viatra.petrinet.model.petrinet.Transition}.
     * It is bidirectional and its opposite is '{@link hu.bme.mit.viatra.petrinet.model.petrinet.Transition#getNet <em>Net</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Transitions</em>' containment reference list.
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.PetriNetPackage#getPetriNet_Transitions()
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.Transition#getNet
     * @model opposite="net" containment="true"
     * @generated
     */
    EList<Transition> getTransitions();

} // PetriNet
