package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(BudgetaryActService.PATH)
@Tag(name = "Actes budgétaires",description = "Gestion des actes budgétaires")
public interface BudgetaryActService extends org.cyk.utility.service.SpecificService<BudgetaryActDto> {
	String PATH = "acte_budgetaire";
	
}