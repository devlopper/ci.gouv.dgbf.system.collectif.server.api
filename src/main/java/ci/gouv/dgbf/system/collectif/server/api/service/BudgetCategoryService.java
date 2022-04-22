package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

@Path(BudgetCategoryService.PATH)
public interface BudgetCategoryService extends org.cyk.utility.service.SpecificService<BudgetCategoryDto> {
	String PATH = "categories-budgets";
	
}