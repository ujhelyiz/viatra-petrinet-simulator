package hu.bme.mit.viatra.petrinet.simulator;

import hu.bme.mit.viatra.petrinet.model.petrinet.PetriNetPackage;

import java.io.IOException;
import java.util.Set;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gef4.layout.algorithms.SpringLayoutAlgorithm;
import org.eclipse.gef4.zest.core.viewers.GraphViewer;
import org.eclipse.gef4.zest.core.widgets.ZestStyles;
import org.eclipse.incquery.runtime.api.AdvancedIncQueryEngine;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.viewers.runtime.model.IncQueryViewerDataModel;
import org.eclipse.incquery.viewers.runtime.model.ViewerDataFilter;
import org.eclipse.incquery.viewers.runtime.model.ViewerState;
import org.eclipse.incquery.viewers.runtime.model.ViewerState.ViewerStateFeature;
import org.eclipse.incquery.viewers.runtime.zest.IncQueryGraphViewers;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.google.common.collect.ImmutableSet;

public class SimulatorApplication {

	public static GraphViewer initializeGraphViewer(Composite container) {
			
		GraphViewer viewer = new GraphViewer(container, ZestStyles.NONE);
		viewer.setLayoutAlgorithm(new SpringLayoutAlgorithm());
		return viewer;
	}
	
	public static void main(String[] args) throws IncQueryException, IOException {
		//Initializing the EMF
		PetriNetPackage.eINSTANCE.getName();
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("petrinet", new XMIResourceFactoryImpl());
		
		
		ResourceSet set = new ResourceSetImpl();
		URI uri = URI.createFileURI("/Users/stampie/Documents/eclipse/runtime-EMF-IncQuery/hu.bme.mit.viatra.petrinet.sample/My.petrinet");
		Resource res = set.getResource(uri, true);
		
		final AdvancedIncQueryEngine engine = AdvancedIncQueryEngine.createUnmanagedEngine(set);
		final Set<IQuerySpecification<?>> queries = PetriNetSimulatorQueries.instance().getSpecifications();
		
		final Display d = new Display();
		final Shell shell = new Shell(d);
		final StackLayout layout = new StackLayout();
		shell.setLayout(layout);
		
		Realm.runWithDefault(SWTObservables.getRealm(d), new Runnable() {
			
			@Override
			public void run() {
				
				GraphViewer viewer = initializeGraphViewer(shell);
				layout.topControl = viewer.getControl();
				ViewerState state = IncQueryViewerDataModel.newViewerState(
						engine, 
						queries,
						ViewerDataFilter.UNFILTERED,
						ImmutableSet.of(ViewerStateFeature.EDGE));
				IncQueryGraphViewers.bind(viewer, state);
				shell.open();
				
				Runnable executeSimulation = new Runnable() {
					
					@Override
					public void run() {
						PetriNetSimulator simulator = new PetriNetSimulator(engine);
						simulator.fire(10);
					}
				};
				new Thread(executeSimulation).start();
				
				while(!shell.isDisposed()) {
					if(! d.readAndDispatch()) {
						d.sleep();
					}
				}
			}
		});
		

		
	}

}
