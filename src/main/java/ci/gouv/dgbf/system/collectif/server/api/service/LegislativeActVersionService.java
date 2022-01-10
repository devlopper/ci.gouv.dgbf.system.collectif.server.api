package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(LegislativeActVersionService.PATH)
@Tag(name = "Versions collectifs budgétaires",description = "Gestion des versions des collectifs budgétaires")
public interface LegislativeActVersionService extends org.cyk.utility.service.SpecificService<LegislativeActVersionDto> {
	String PATH = "versions_collectifs_budgetaires";
}