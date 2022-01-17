package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

@Path(ResourceActivityService.PATH)
public interface ResourceActivityService extends org.cyk.utility.service.SpecificService<ResourceActivityDto> {
	String PATH = "activites_recette";
}