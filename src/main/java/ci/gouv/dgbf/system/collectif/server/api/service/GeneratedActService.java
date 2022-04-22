package ci.gouv.dgbf.system.collectif.server.api.service;

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

@Path(GeneratedActService.PATH)
@Tag(name = "Actes générés",description = "Gestion des actes générés")
public interface GeneratedActService extends org.cyk.utility.service.SpecificService<GeneratedActDto> {
	String PATH = "actes-generes";
	
	@POST
	@Path("generation-par-version-collectif-budgetaire")
	@Produces({MediaType.APPLICATION_JSON})
	@Operation(description = "Générer les actes d'une version d'un collectif budgétaire")
	@APIResponses(value = {
		@APIResponse(description = "Les actes ont été générés",responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON))
		,@APIResponse(description = "Erreur lors de la génération",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response generateByLegislativeActVersionIdentifier(@QueryParam(GeneratedActDto.JSON_LEGISLATIVE_ACT_VERSION_IDENTIFIER) String legislativeActVersionIdentifier,@QueryParam(GeneratedActDto.JSON___AUDIT_WHO__) String auditWho);
	
	@POST
	@Path("suppression-par-version-collectif-budgetaire")
	@Produces({MediaType.APPLICATION_JSON})
	@Operation(description = "Supprimer les actes d'une version d'un collectif budgétaire")
	@APIResponses(value = {
		@APIResponse(description = "Les actes ont été supprimés",responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON))
		,@APIResponse(description = "Erreur lors de la suppression",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response deleteByLegislativeActVersionIdentifier(@QueryParam(GeneratedActDto.JSON_LEGISLATIVE_ACT_VERSION_IDENTIFIER) String legislativeActVersionIdentifier,@QueryParam(GeneratedActDto.JSON___AUDIT_WHO__) String auditWho);
}