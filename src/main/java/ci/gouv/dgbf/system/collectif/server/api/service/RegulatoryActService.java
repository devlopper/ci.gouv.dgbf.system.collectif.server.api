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

@Path(RegulatoryActService.PATH)
@Tag(name = "Acte de gestion")
public interface RegulatoryActService extends org.cyk.utility.service.SpecificService<RegulatoryActDto> {
	String PATH = "actes-gestion";
	
	@POST
	@Path("inclusion")
	@Produces({MediaType.APPLICATION_JSON})
	@Operation(description = "Inclure une liste d'actes de gestion dans un collectif budgétaire")
	@APIResponses(value = {
		@APIResponse(description = "Une liste d'actes de gestion",responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON))
		,@APIResponse(description = "Erreur lors de l'inclusion",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response include(@QueryParam(RegulatoryActDto.JSONS_IDENTIFIERS) List<String> identifiers,@QueryParam(RegulatoryActDto.JSON_LEGISLATIVE_VERSION_IDENTIFIER) String legislativeActVersionIdentifier
			,@QueryParam(RegulatoryActDto.JSON_EXISTING_IGNORABLE) Boolean existingIgnorable,@QueryParam(RegulatoryActDto.JSON___AUDIT_WHO__) String auditWho);
	
	@POST
	@Path("exclusion")
	@Produces({MediaType.APPLICATION_JSON})
	@Operation(description = "Exclure une liste d'actes de gestion d'un collectif budgétaire")
	@APIResponses(value = {
		@APIResponse(description = "Une liste d'actes de gestion",responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON))
		,@APIResponse(description = "Erreur lors de l'exclusion",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response exclude(@QueryParam(RegulatoryActDto.JSONS_IDENTIFIERS) List<String> identifiers,@QueryParam(RegulatoryActDto.JSON_LEGISLATIVE_VERSION_IDENTIFIER) String legislativeActVersionIdentifier
			,@QueryParam(RegulatoryActDto.JSON_EXISTING_IGNORABLE) Boolean existingIgnorable,@QueryParam(RegulatoryActDto.JSON___AUDIT_WHO__) String auditWho);
	
	@POST
	@Path("inclusion-exhaustive")
	@Produces({MediaType.APPLICATION_JSON})
	@Operation(description = "Inclure de manière exhaustive une liste d'actes de gestion dans un collectif budgétaire")
	@APIResponses(value = {
		@APIResponse(description = "Une liste exhaustive d'actes de gestion",responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON))
		,@APIResponse(description = "Erreur lors de l'inclusion de manière exhaustive",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response includeComprehensively(@QueryParam(RegulatoryActDto.JSONS_IDENTIFIERS) List<String> identifiers,@QueryParam(RegulatoryActDto.JSON_LEGISLATIVE_VERSION_IDENTIFIER) String legislativeActVersionIdentifier
			,@QueryParam(RegulatoryActDto.JSON___AUDIT_WHO__) String auditWho);
}