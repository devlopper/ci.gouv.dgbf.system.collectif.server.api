package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

@Path(SectionService.PATH)
public interface SectionService extends org.cyk.utility.service.SpecificService<SectionDto> {
	String PATH = "sections";
}