package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

@Path(BudgetSpecializationUnitService.PATH)
public interface BudgetSpecializationUnitService extends org.cyk.utility.service.SpecificService<BudgetSpecializationUnitDto> {
	String PATH = "unites_specialisations_budgets";
	
}