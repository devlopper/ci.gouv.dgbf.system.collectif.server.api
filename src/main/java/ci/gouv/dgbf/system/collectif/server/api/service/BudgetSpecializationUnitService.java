package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(BudgetSpecializationUnitService.PATH)
@Tag(name = "Unités de spécialisations du budget")
public interface BudgetSpecializationUnitService extends org.cyk.utility.service.SpecificService<BudgetSpecializationUnitDto> {
	String PATH = "unites_specialisations_budgets";
	
}