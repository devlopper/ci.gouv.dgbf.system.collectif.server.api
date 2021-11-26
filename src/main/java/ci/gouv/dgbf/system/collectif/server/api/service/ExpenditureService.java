package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(ExpenditureService.PATH)
@Tag(name = "Dépenses",description = "Gestion des dépenses")
public interface ExpenditureService extends org.cyk.utility.service.SpecificService<ExpenditureDto> {
	String PATH = "depense";
	
}