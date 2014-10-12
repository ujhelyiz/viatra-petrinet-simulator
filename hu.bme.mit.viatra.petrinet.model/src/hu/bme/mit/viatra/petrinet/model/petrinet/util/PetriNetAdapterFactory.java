/**
 */
package hu.bme.mit.viatra.petrinet.model.petrinet.util;

import hu.bme.mit.viatra.petrinet.model.petrinet.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.viatra.petrinet.model.petrinet.PetriNetPackage
 * @generated
 */
public class PetriNetAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static PetriNetPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PetriNetAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = PetriNetPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PetriNetSwitch<Adapter> modelSwitch =
        new PetriNetSwitch<Adapter>() {
            @Override
            public Adapter casePlace(Place object) {
                return createPlaceAdapter();
            }
            @Override
            public Adapter caseTransition(Transition object) {
                return createTransitionAdapter();
            }
            @Override
            public Adapter caseArc(Arc object) {
                return createArcAdapter();
            }
            @Override
            public Adapter caseNamedElement(NamedElement object) {
                return createNamedElementAdapter();
            }
            @Override
            public Adapter casePetriNet(PetriNet object) {
                return createPetriNetAdapter();
            }
            @Override
            public Adapter casePTArc(PTArc object) {
                return createPTArcAdapter();
            }
            @Override
            public Adapter caseTPArc(TPArc object) {
                return createTPArcAdapter();
            }
            @Override
            public Adapter caseToken(Token object) {
                return createTokenAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link hu.bme.mit.viatra.petrinet.model.petrinet.Place <em>Place</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.Place
     * @generated
     */
    public Adapter createPlaceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.bme.mit.viatra.petrinet.model.petrinet.Transition <em>Transition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.Transition
     * @generated
     */
    public Adapter createTransitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.bme.mit.viatra.petrinet.model.petrinet.Arc <em>Arc</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.Arc
     * @generated
     */
    public Adapter createArcAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.bme.mit.viatra.petrinet.model.petrinet.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.bme.mit.viatra.petrinet.model.petrinet.PetriNet <em>Petri Net</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.PetriNet
     * @generated
     */
    public Adapter createPetriNetAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.bme.mit.viatra.petrinet.model.petrinet.PTArc <em>PT Arc</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.PTArc
     * @generated
     */
    public Adapter createPTArcAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.bme.mit.viatra.petrinet.model.petrinet.TPArc <em>TP Arc</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.TPArc
     * @generated
     */
    public Adapter createTPArcAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link hu.bme.mit.viatra.petrinet.model.petrinet.Token <em>Token</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see hu.bme.mit.viatra.petrinet.model.petrinet.Token
     * @generated
     */
    public Adapter createTokenAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //PetriNetAdapterFactory
