package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(BudgetaryActVersionService.PATH)
@Tag(name = "Versions actes budgétaires",description = "Gestion des versions des actes budgétaires")
public interface BudgetaryActVersionService extends org.cyk.utility.service.SpecificService<BudgetaryActVersionDto> {
	String PATH = "versions_actes_budgetaires";
}