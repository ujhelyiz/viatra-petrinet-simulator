/**
 */
package hu.bme.mit.viatra.petrinet.model.petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TP Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.viatra.petrinet.model.petrinet.TPArc#getSource <em>Source</em>}</li>
 *   <li>{@link hu.bme.mit.viatra.petrinet.model.petrinet.TPArc#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.viatra.petrinet.model.petrinet.PetriNetPackage#getTPArc()
 * @model
 * @generated
 */
public interface TPArc extends Arc {
    /**
     * Returns the value of the '<em><b>Source</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link hu.bme.mit.viatra.petrinet.model.petrinet.Transition#getOutArcs <em>Out Arcs</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' container reference.
     * @see #setSource(Transition)
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.PetriNetPackage#getTPArc_Source()
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.Transition#getOutArcs
     * @model opposite="outArcs" required="true" transient="false"
     * @generated
     */
    Transition getSource();

    /**
     * Sets the value of the '{@link hu.bme.mit.viatra.petrinet.model.petrinet.TPArc#getSource <em>Source</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' container reference.
     * @see #getSource()
     * @generated
     */
    void setSource(Transition value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * It is bidirectional and its opposite is '{@link hu.bme.mit.viatra.petrinet.model.petrinet.Place#getInArcs <em>In Arcs</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(Place)
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.PetriNetPackage#getTPArc_Target()
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.Place#getInArcs
     * @model opposite="inArcs" required="true"
     * @generated
     */
    Place getTarget();

    /**
     * Sets the value of the '{@link hu.bme.mit.viatra.petrinet.model.petrinet.TPArc#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(Place value);

} // TPArc
