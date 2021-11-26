package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(ExpenditureNatureService.PATH)
@Tag(name = "Nature de dépenses")
public interface ExpenditureNatureService extends org.cyk.utility.service.SpecificService<ExpenditureNatureDto> {
	String PATH = "nature_depense";
	
}