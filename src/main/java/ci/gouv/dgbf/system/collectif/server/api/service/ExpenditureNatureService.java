package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

@Path(ExpenditureNatureService.PATH)
public interface ExpenditureNatureService extends org.cyk.utility.service.SpecificService<ExpenditureNatureDto> {
	String PATH = "natures_depenses";
	
}