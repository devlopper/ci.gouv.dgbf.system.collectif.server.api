package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(ActionService.PATH)
@Tag(name = "Action")
public interface ActionService extends org.cyk.utility.service.SpecificService<ActionDto> {
	String PATH = "actions";
}