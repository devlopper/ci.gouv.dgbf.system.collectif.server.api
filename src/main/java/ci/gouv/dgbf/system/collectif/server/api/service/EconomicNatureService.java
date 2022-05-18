package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(EconomicNatureService.PATH)
@Tag(name = "Nature économique")
public interface EconomicNatureService extends org.cyk.utility.service.SpecificService<EconomicNatureDto> {
	String PATH = "natures-economiques";
}