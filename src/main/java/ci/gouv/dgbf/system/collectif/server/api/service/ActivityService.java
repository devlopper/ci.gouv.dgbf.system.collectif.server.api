package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

@Path(ActivityService.PATH)
public interface ActivityService extends org.cyk.utility.service.SpecificService<ActivityDto> {
	String PATH = "activites";
}