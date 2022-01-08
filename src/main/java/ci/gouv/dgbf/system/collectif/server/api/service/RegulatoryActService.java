package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

@Path(RegulatoryActService.PATH)
public interface RegulatoryActService extends org.cyk.utility.service.SpecificService<RegulatoryActDto> {
	String PATH = "actes_reglementaires";
	
}