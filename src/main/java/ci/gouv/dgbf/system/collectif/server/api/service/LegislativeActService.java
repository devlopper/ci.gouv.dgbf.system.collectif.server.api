package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(LegislativeActService.PATH)
@Tag(name = "Collectifs budgétaires",description = "Gestion des collectifs budgétaires")
public interface LegislativeActService extends org.cyk.utility.service.SpecificService<LegislativeActDto> {
	String PATH = "collectifs_budgetaires";
	
}