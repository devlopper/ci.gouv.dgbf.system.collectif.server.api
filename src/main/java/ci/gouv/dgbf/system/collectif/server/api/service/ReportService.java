package ci.gouv.dgbf.system.collectif.server.api.service;

import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.cyk.utility.service.Service;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(ReportService.PATH)
@Tag(name = "Rapport")
public interface ReportService extends Service {
	String PATH = "rapports";
	
	@POST
	@Path("/")
	Response get(@QueryParam("identifier") String identifier,@QueryParam("file-type") String fileType,@QueryParam("is-content-inline") Boolean isContentInline,@QueryParam("parameters-as-json") String parametersAsJson);
	/*
	@GET
	@Path("ajustements")
	@Produces( MediaType.APPLICATION_OCTET_STREAM)
	@Operation(description = "Obtenir les ajustements")
	@APIResponses(value = {
			@APIResponse(description = "Ajustements obtenus",responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_OCTET_STREAM))
			,@APIResponse(description = "Erreur lors de l'obtention des ajustements",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response getAdjustments(@Parameter(name = PARAMETER_NAME_FILTER,description = PARAMETER_NAME_FILTER_DESCRIPTION_FRENCH) @QueryParam(PARAMETER_NAME_FILTER) String filterAsJson);
	*/
}