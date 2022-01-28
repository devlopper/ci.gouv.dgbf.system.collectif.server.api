package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(LegislativeActService.PATH)
@Tag(name = "Collectifs budgétaires",description = "Gestion des collectifs budgétaires")
public interface LegislativeActService extends org.cyk.utility.service.SpecificService<LegislativeActDto> {
	String PATH = "collectifs_budgetaires";

	@POST
	@Path("version-par-defaut")
	@Operation(description = "Mise à jour de la version par défaut")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
			,@APIResponse(description = "Erreur lors de la mise à jour de la version par défaut",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response updateDefaultVersion(@QueryParam(LegislativeActDto.JSON_LEGISLATIVE_ACT_IDENTIFIER) String identifier,@QueryParam(LegislativeActDto.JSON_DEFAULT_VERSION_IDENTIFIER) String versionIdentifier,@QueryParam(LegislativeActDto.JSON___AUDIT_WHO__) String auditWho);
}