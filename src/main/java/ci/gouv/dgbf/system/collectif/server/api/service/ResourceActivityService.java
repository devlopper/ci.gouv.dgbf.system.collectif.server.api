package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(ResourceActivityService.PATH)
@Tag(name = "Activité de ressource")
public interface ResourceActivityService extends org.cyk.utility.service.SpecificService<ResourceActivityDto> {
	String PATH = "activites-ressource";
}