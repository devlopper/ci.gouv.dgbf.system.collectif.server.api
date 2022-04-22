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

@Path(LegislativeActVersionService.PATH)
@Tag(name = "Versions collectifs budgétaires",description = "Gestion des versions des collectifs budgétaires")
public interface LegislativeActVersionService extends org.cyk.utility.service.SpecificService<LegislativeActVersionDto> {
	String PATH = "versions-collectifs-budgetaires";
	
	@POST
	@Path("/")
	@Operation(description = "Création de version collectif budgétaire")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
			,@APIResponse(description = "Erreur lors de création de version collectif budgétaire",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response create(@QueryParam(LegislativeActVersionDto.JSON_CODE) String identifier,@QueryParam(LegislativeActVersionDto.JSON_NAME) String name,@QueryParam(LegislativeActVersionDto.JSON_NUMBER) Byte number
			,@QueryParam(LegislativeActVersionDto.JSON_LEGISLATIVE_ACT_IDENTIFIER) String actIdentifier,@QueryParam(LegislativeActVersionDto.JSON___AUDIT_WHO__) String auditWho);
	
	@POST
	@Path("/duplication")
	@Operation(description = "Duplication de version collectif budgétaire")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
			,@APIResponse(description = "Erreur lors de duplication de version collectif budgétaire",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response duplicate(@QueryParam(LegislativeActVersionDto.JSON_CODE) String identifier,@QueryParam(LegislativeActVersionDto.JSON___AUDIT_WHO__) String auditWho);
}