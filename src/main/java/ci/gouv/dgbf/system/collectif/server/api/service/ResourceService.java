package ci.gouv.dgbf.system.collectif.server.api.service;

import java.util.List;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(ResourceService.PATH)
@Tag(name = "Ressources",description = "Gestion des ressources")
public interface ResourceService extends org.cyk.utility.service.SpecificService<ResourceDto> {
	String PATH = "ressources";
	
	@POST
	@Path("ajustement")
	@Produces({MediaType.APPLICATION_JSON})
	@Operation(description = "Ajuster une liste de ressources")
	@APIResponses(value = {
			@APIResponse(description = "Une liste de ressources",responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON))
			,@APIResponse(description = "Erreur lors de l'ajustement",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response adjust(List<ResourceDto.AdjustmentDto> adjustmentsDtos,@QueryParam(ResourceDto.JSON___AUDIT_WHO__) String auditWho);
}