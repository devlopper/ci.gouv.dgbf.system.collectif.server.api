package ci.gouv.dgbf.system.collectif.server.api.service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(ExpenditureService.PATH)
@Tag(name = "Dépenses",description = "Gestion des dépenses")
public interface ExpenditureService extends org.cyk.utility.service.SpecificService<ExpenditureDto> {
	String PATH = "depenses";
	
	@POST
	@Path("ajustement")
	@Produces( MediaType.TEXT_PLAIN)
	@Operation(description = "Ajuster une liste de dépenses")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
			,@APIResponse(description = "Erreur lors de l'ajustement",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response adjust(List<ExpenditureDto.AdjustmentDto> adjustmentsDtos,@QueryParam(ExpenditureDto.JSON___AUDIT_WHO__) String auditWho);
	
	@POST
	@Path("ajustement-par-autorisation-engagement")
	@Produces( MediaType.TEXT_PLAIN)
	@Operation(description = "Ajuster une liste de dépenses par autorisations d'engagements")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
			,@APIResponse(description = "Erreur lors de l'ajustement par autorisations d'engagements",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response adjustByEntryAuthorizations(List<ExpenditureDto.AdjustmentDto> adjustmentsDtos,@QueryParam(ExpenditureDto.JSON___AUDIT_WHO__) String auditWho);
	
	@POST
	@Path("importation")
	@Produces( MediaType.TEXT_PLAIN)
	@Operation(description = "Importer les dépenses")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
			,@APIResponse(description = "Erreur lors de l'importation des dépenses",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response import_(@QueryParam(ExpenditureDto.JSON_LEGISLATIVE_ACT_VERSION_IDENTIFIER) String legislativeActVersionIdentifier,@QueryParam(ExpenditureDto.JSON___AUDIT_WHO__) String auditWho);
	
	@GET
	@Path("sommation-montants")
	@Produces( MediaType.APPLICATION_JSON)
	@Operation(description = "Sommer les montants")
	@APIResponses(value = {
			@APIResponse(description = "Sommation des montants obtenue",responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON))
			,@APIResponse(description = "Erreur lors de la sommation des montants",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response getAmountsSums(@Parameter(name = PARAMETER_NAME_FILTER,description = PARAMETER_NAME_FILTER_DESCRIPTION_FRENCH) @QueryParam(PARAMETER_NAME_FILTER) String filter);
	
	@POST
	@Path("verification-chargeable")
	@Produces( MediaType.TEXT_PLAIN)
	@Operation(description = "Verifier les dépenses chargeables")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", content = @Content(mediaType = MediaType.TEXT_PLAIN))
			,@APIResponse(description = "Erreur lors de la vérification des dépenses chargeables",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response verifyLoadable(List<ExpenditureDto.LoadDto> loads);
	
	/**/
	
	String HEADER_UNDEFINED_CODES_IDENTIFIERS = "identifiants_codes_non_defini";
	String HEADER_UNKNOWN_ACTIVITIES_CODES = "codes_activites_inconnus";
	String HEADER_UNKNOWN_ECONOMICS_NATURES_CODES = "codes_natures_economiques_inconnus";
	String HEADER_UNKNOWN_FUNDINGS_SOURCES_CODES = "codes_sources_financements_inconnus";
	String HEADER_UNKNOWN_LESSORS_CODES = "codes_bailleurs_inconnus";
	String HEADER_DUPLICATES_IDENTIFIERS = "identifiants_doublons";
}