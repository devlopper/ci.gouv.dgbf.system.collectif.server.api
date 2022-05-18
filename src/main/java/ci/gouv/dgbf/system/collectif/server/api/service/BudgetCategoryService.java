package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(BudgetCategoryService.PATH)
@Tag(name = "Catégorie de budget")
public interface BudgetCategoryService extends org.cyk.utility.service.SpecificService<BudgetCategoryDto> {
	String PATH = "categories-budgets";
	
}