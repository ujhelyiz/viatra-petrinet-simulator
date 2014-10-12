/**
 */
package hu.bme.mit.viatra.petrinet.model.petrinet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PT Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link hu.bme.mit.viatra.petrinet.model.petrinet.PTArc#getSource <em>Source</em>}</li>
 *   <li>{@link hu.bme.mit.viatra.petrinet.model.petrinet.PTArc#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see hu.bme.mit.viatra.petrinet.model.petrinet.PetriNetPackage#getPTArc()
 * @model
 * @generated
 */
public interface PTArc extends Arc {
    /**
     * Returns the value of the '<em><b>Source</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link hu.bme.mit.viatra.petrinet.model.petrinet.Place#getOutArcs <em>Out Arcs</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Source</em>' container reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' container reference.
     * @see #setSource(Place)
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.PetriNetPackage#getPTArc_Source()
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.Place#getOutArcs
     * @model opposite="outArcs" required="true" transient="false"
     * @generated
     */
    Place getSource();

    /**
     * Sets the value of the '{@link hu.bme.mit.viatra.petrinet.model.petrinet.PTArc#getSource <em>Source</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' container reference.
     * @see #getSource()
     * @generated
     */
    void setSource(Place value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * It is bidirectional and its opposite is '{@link hu.bme.mit.viatra.petrinet.model.petrinet.Transition#getInArcs <em>In Arcs</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(Transition)
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.PetriNetPackage#getPTArc_Target()
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.Transition#getInArcs
     * @model opposite="inArcs" required="true"
     * @generated
     */
    Transition getTarget();

    /**
     * Sets the value of the '{@link hu.bme.mit.viatra.petrinet.model.petrinet.PTArc#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(Transition value);

} // PTArc
