package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

@Path(LessorService.PATH)
public interface LessorService extends org.cyk.utility.service.SpecificService<LessorDto> {
	String PATH = "bailleurs";
}