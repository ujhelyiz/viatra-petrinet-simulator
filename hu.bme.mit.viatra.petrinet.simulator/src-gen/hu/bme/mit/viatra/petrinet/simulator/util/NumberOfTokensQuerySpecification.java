package hu.bme.mit.viatra.petrinet.simulator.util;

import com.google.common.collect.Sets;
import hu.bme.mit.viatra.petrinet.simulator.NumberOfTokensMatch;
import hu.bme.mit.viatra.petrinet.simulator.NumberOfTokensMatcher;
import hu.bme.mit.viatra.petrinet.simulator.util.PlaceWithTokenQuerySpecification;
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
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.Equality;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.ExportedParameter;
import org.eclipse.incquery.runtime.matchers.psystem.basicdeferred.PatternMatchCounter;
import org.eclipse.incquery.runtime.matchers.psystem.basicenumerables.TypeUnary;
import org.eclipse.incquery.runtime.matchers.psystem.queries.PParameter;
import org.eclipse.incquery.runtime.matchers.psystem.queries.QueryInitializationException;
import org.eclipse.incquery.runtime.matchers.tuple.FlatTuple;

/**
 * A pattern-specific query specification that can instantiate NumberOfTokensMatcher in a type-safe way.
 * 
 * @see NumberOfTokensMatcher
 * @see NumberOfTokensMatch
 * 
 */
@SuppressWarnings("all")
public final class NumberOfTokensQuerySpecification extends BaseGeneratedEMFQuerySpecification<NumberOfTokensMatcher> {
  private NumberOfTokensQuerySpecification() {
    super(GeneratedPQuery.INSTANCE);
  }
  
  /**
   * @return the singleton instance of the query specification
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static NumberOfTokensQuerySpecification instance() throws IncQueryException {
    try{
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	throw processInitializerError(err);
    }
  }
  
  @Override
  protected NumberOfTokensMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return NumberOfTokensMatcher.on(engine);
  }
  
  @Override
  public NumberOfTokensMatch newEmptyMatch() {
    return NumberOfTokensMatch.newEmptyMatch();
  }
  
  @Override
  public NumberOfTokensMatch newMatch(final Object... parameters) {
    return NumberOfTokensMatch.newMatch((hu.bme.mit.viatra.petrinet.model.petrinet.Place) parameters[0], (java.lang.Integer) parameters[1]);
  }
  
  private static class LazyHolder {
    private final static NumberOfTokensQuerySpecification INSTANCE = make();
    
    public static NumberOfTokensQuerySpecification make() {
      return new NumberOfTokensQuerySpecification();					
    }
  }
  
  private static class GeneratedPQuery extends BaseGeneratedEMFPQuery {
    private final static NumberOfTokensQuerySpecification.GeneratedPQuery INSTANCE = new GeneratedPQuery();
    
    @Override
    public String getFullyQualifiedName() {
      return "hu.bme.mit.viatra.petrinet.simulator.numberOfTokens";
    }
    
    @Override
    public List<String> getParameterNames() {
      return Arrays.asList("pl","no");
    }
    
    @Override
    public List<PParameter> getParameters() {
      return Arrays.asList(new PParameter("pl", "hu.bme.mit.viatra.petrinet.model.petrinet.Place"),new PParameter("no", "java.lang.Integer"));
    }
    
    @Override
    public Set<PBody> doGetContainedBodies() throws QueryInitializationException {
      Set<PBody> bodies = Sets.newLinkedHashSet();
      try {
      {
      	PBody body = new PBody(this);
      	PVariable var_pl = body.getOrCreateVariableByName("pl");
      	PVariable var_no = body.getOrCreateVariableByName("no");
      	PVariable var__virtual_0_ = body.getOrCreateVariableByName(".virtual{0}");
      	PVariable var___0_ = body.getOrCreateVariableByName("_<0>");
      	body.setExportedParameters(Arrays.<ExportedParameter>asList(
      		new ExportedParameter(body, var_pl, "pl"),
      				
      		new ExportedParameter(body, var_no, "no")
      	));
      	new TypeUnary(body, var_pl, getClassifierLiteral("http://inf.mit.bme.hu/petrinet/2014", "Place"), "http://inf.mit.bme.hu/petrinet/2014/Place");
      	new PatternMatchCounter(body, new FlatTuple(var_pl, var___0_), PlaceWithTokenQuerySpecification.instance().getInternalQueryRepresentation(), var__virtual_0_);
      	new Equality(body, var_no, var__virtual_0_);
      	bodies.add(body);
      }
      	{
      	PAnnotation annotation = new PAnnotation("Item");
      	annotation.addAttribute("item", new ParameterReference("pl"));
      	annotation.addAttribute("label", "$pl.name$ : $no$");
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
