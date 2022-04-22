package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

@Path(EconomicNatureService.PATH)
public interface EconomicNatureService extends org.cyk.utility.service.SpecificService<EconomicNatureDto> {
	String PATH = "natures-economiques";
}