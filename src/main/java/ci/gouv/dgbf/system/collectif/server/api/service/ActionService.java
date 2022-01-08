package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

@Path(ActionService.PATH)
public interface ActionService extends org.cyk.utility.service.SpecificService<ActionDto> {
	String PATH = "actions";
}