package hu.bme.mit.viatra.petrinet.simulator.util;

import com.google.common.collect.Sets;
import hu.bme.mit.viatra.petrinet.simulator.NotFireableMatch;
import hu.bme.mit.viatra.petrinet.simulator.NotFireableMatcher;
import hu.bme.mit.viatra.petrinet.simulator.util.PlaceWithToken2QuerySpecification;
import hu.bme.mit.viatra.petrinet.simulator.util.SourcePlaceQuerySpecification;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFPQuery;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedEMFQuerySpecification;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.psystem.PBody;
import org.eclipse.incquery.runtime.matchers.psystem.PVariable;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.PAnnotation;
import org.eclipse.incquery.runtime.matchers.psystem.annotations.ParameterReference;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.NegativePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.PositivePatternCall;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate NotFireableMatcher in a type-safe way.
 * 
 * @see NotFireableMatcher
 * @see NotFireableMatch
 * 
 */
@SuppressWarnings("all")
public final class NotFireableQuerySpecification extends BaseGeneratedEMFQuerySpecification<NotFireableMatcher> {
  private NotFireableQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static NotFireableQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected NotFireableMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return NotFireableMatcher.on(engine);
  }
  
  @Override
  public NotFireableMatch newEmptyMatch() {
    return NotFireableMatch.newEmptyMatch();
  }
  
  @Override
  public NotFireableMatch newMatch(final Object... parameters) {
    return NotFireableMatch.newMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Transition) parameters[0]);
  }
  
  private static class LazyHolder {
    private final static NotFireableQuerySpecification INSTANCE = make();
    
    public static NotFireableQuerySpecification make() {
      return new NotFireableQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static NotFireableQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.viatra.petrinet.simulator.notFireable";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("t");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("t", "hu.bme.mit.viatra.petrinet.model.petrinet.Transition"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_t = body.getOrCreateVariableByName("t");
      	PVariable var_Place = body.getOrCreateVariableByName("Place");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_t, "t")
      	));
      	new TypeUnary(body, var_t, getClassifierLiteral("http://inf.mit.bme.hu/petrinet/2014", "Transition"), "http://inf.mit.bme.hu/petrinet/2014/Transition");
      	new PositivePatternCall(body, new FlatTuple(var_t, var_Place), SourcePlaceQuerySpecification.instance().getInternalQueryRepresentation());
      	new NegativePatternCall(body, new FlatTuple(var_Place), PlaceWithToken2QuerySpecification.instance().getInternalQueryRepresentation());
      	bodies.add(body);
      }
      	{
      	PAnnotation annotation = new PAnnotation("Item");
      	annotation.addAttribute("item", new ParameterReference("t"));
      	annotation.addAttribute("label", "$t.name$");
      	addAnnotation(annotation);
      }
      {
      	PAnnotation annotation = new PAnnotation("Format");
      	annotation.addAttribute("color", "#ff0000");
      	addAnnotation(annotation);
      }
      	// to silence compiler error
      	if (false) throw new IncQueryException("Never", "happens");
      } catch (IncQueryException ex) {
      	throw processDependencyException(ex);
      }
      return bodies;
    }
  }
}
