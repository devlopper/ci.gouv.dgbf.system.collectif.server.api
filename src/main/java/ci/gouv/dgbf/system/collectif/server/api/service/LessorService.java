package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(LessorService.PATH)
@Tag(name = "Bailleurs")
public interface LessorService extends org.cyk.utility.service.SpecificService<LessorDto> {
	String PATH = "bailleurs";
}