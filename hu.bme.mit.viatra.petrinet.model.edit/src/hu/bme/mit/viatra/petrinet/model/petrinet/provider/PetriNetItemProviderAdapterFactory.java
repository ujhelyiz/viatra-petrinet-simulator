/**
 */
package hu.bme.mit.viatra.petrinet.model.petrinet.provider;

import hu.bme.mit.viatra.petrinet.model.petrinet.util.PetriNetAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PetriNetItemProviderAdapterFactory extends PetriNetAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
    /**
     * This keeps track of the root adapter factory that delegates to this adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ComposedAdapterFactory parentAdapterFactory;

    /**
     * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected IChangeNotifier changeNotifier = new ChangeNotifier();

    /**
     * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected Collection<Object> supportedTypes = new ArrayList<Object>();

    /**
     * This constructs an instance.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public PetriNetItemProviderAdapterFactory() {
        supportedTypes.add(IEditingDomainItemProvider.class);
        supportedTypes.add(IStructuredItemContentProvider.class);
        supportedTypes.add(ITreeItemContentProvider.class);
        supportedTypes.add(IItemLabelProvider.class);
        supportedTypes.add(IItemPropertySource.class);
    }

    /**
     * This keeps track of the one adapter used for all {@link hu.bme.mit.viatra.petrinet.model.petrinet.Place} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PlaceItemProvider placeItemProvider;

    /**
     * This creates an adapter for a {@link hu.bme.mit.viatra.petrinet.model.petrinet.Place}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPlaceAdapter() {
        if (placeItemProvider == null) {
            placeItemProvider = new PlaceItemProvider(this);
        }

        return placeItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link hu.bme.mit.viatra.petrinet.model.petrinet.Transition} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TransitionItemProvider transitionItemProvider;

    /**
     * This creates an adapter for a {@link hu.bme.mit.viatra.petrinet.model.petrinet.Transition}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTransitionAdapter() {
        if (transitionItemProvider == null) {
            transitionItemProvider = new TransitionItemProvider(this);
        }

        return transitionItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link hu.bme.mit.viatra.petrinet.model.petrinet.NamedElement} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NamedElementItemProvider namedElementItemProvider;

    /**
     * This creates an adapter for a {@link hu.bme.mit.viatra.petrinet.model.petrinet.NamedElement}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createNamedElementAdapter() {
        if (namedElementItemProvider == null) {
            namedElementItemProvider = new NamedElementItemProvider(this);
        }

        return namedElementItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link hu.bme.mit.viatra.petrinet.model.petrinet.PetriNet} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PetriNetItemProvider petriNetItemProvider;

    /**
     * This creates an adapter for a {@link hu.bme.mit.viatra.petrinet.model.petrinet.PetriNet}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPetriNetAdapter() {
        if (petriNetItemProvider == null) {
            petriNetItemProvider = new PetriNetItemProvider(this);
        }

        return petriNetItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link hu.bme.mit.viatra.petrinet.model.petrinet.PTArc} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PTArcItemProvider ptArcItemProvider;

    /**
     * This creates an adapter for a {@link hu.bme.mit.viatra.petrinet.model.petrinet.PTArc}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createPTArcAdapter() {
        if (ptArcItemProvider == null) {
            ptArcItemProvider = new PTArcItemProvider(this);
        }

        return ptArcItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link hu.bme.mit.viatra.petrinet.model.petrinet.TPArc} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TPArcItemProvider tpArcItemProvider;

    /**
     * This creates an adapter for a {@link hu.bme.mit.viatra.petrinet.model.petrinet.TPArc}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTPArcAdapter() {
        if (tpArcItemProvider == null) {
            tpArcItemProvider = new TPArcItemProvider(this);
        }

        return tpArcItemProvider;
    }

    /**
     * This keeps track of the one adapter used for all {@link hu.bme.mit.viatra.petrinet.model.petrinet.Token} instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TokenItemProvider tokenItemProvider;

    /**
     * This creates an adapter for a {@link hu.bme.mit.viatra.petrinet.model.petrinet.Token}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter createTokenAdapter() {
        if (tokenItemProvider == null) {
            tokenItemProvider = new TokenItemProvider(this);
        }

        return tokenItemProvider;
    }

    /**
     * This returns the root adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ComposeableAdapterFactory getRootAdapterFactory() {
        return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
    }

    /**
     * This sets the composed adapter factory that contains this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
        this.parentAdapterFactory = parentAdapterFactory;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object type) {
        return supportedTypes.contains(type) || super.isFactoryForType(type);
    }

    /**
     * This implementation substitutes the factory itself as the key for the adapter.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Adapter adapt(Notifier notifier, Object type) {
        return super.adapt(notifier, this);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object adapt(Object object, Object type) {
        if (isFactoryForType(type)) {
            Object adapter = super.adapt(object, type);
            if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
                return adapter;
            }
        }

        return null;
    }

    /**
     * This adds a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void addListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.addListener(notifyChangedListener);
    }

    /**
     * This removes a listener.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void removeListener(INotifyChangedListener notifyChangedListener) {
        changeNotifier.removeListener(notifyChangedListener);
    }

    /**
     * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void fireNotifyChanged(Notification notification) {
        changeNotifier.fireNotifyChanged(notification);

        if (parentAdapterFactory != null) {
            parentAdapterFactory.fireNotifyChanged(notification);
        }
    }

    /**
     * This disposes all of the item providers created by this factory. 
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void dispose() {
        if (placeItemProvider != null) placeItemProvider.dispose();
        if (transitionItemProvider != null) transitionItemProvider.dispose();
        if (namedElementItemProvider != null) namedElementItemProvider.dispose();
        if (petriNetItemProvider != null) petriNetItemProvider.dispose();
        if (ptArcItemProvider != null) ptArcItemProvider.dispose();
        if (tpArcItemProvider != null) tpArcItemProvider.dispose();
        if (tokenItemProvider != null) tokenItemProvider.dispose();
    }

}
