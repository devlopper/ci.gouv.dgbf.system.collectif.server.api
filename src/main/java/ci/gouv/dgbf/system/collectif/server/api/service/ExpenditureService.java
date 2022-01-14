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

@Path(ExpenditureService.PATH)
@Tag(name = "Dépenses",description = "Gestion des dépenses")
public interface ExpenditureService extends org.cyk.utility.service.SpecificService<ExpenditureDto> {
	String PATH = "depenses";
	
	@POST
	@Path("ajustement")
	@Produces({MediaType.APPLICATION_JSON})
	@Operation(description = "Ajuster une liste de dépenses")
	@APIResponses(value = {
			@APIResponse(description = "Une liste de dépenses",responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON))
			,@APIResponse(description = "Erreur lors de l'ajustement",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response adjust(List<ExpenditureDto.AdjustmentDto> adjustmentsDtos,@QueryParam(ExpenditureDto.JSON___AUDIT_WHO__) String auditWho);
	
	@POST
	@Path("ajustement-par-autorisation-engagement")
	@Produces({MediaType.APPLICATION_JSON})
	@Operation(description = "Ajuster une liste de dépenses par autorisations d'engagements")
	@APIResponses(value = {
			@APIResponse(description = "Une liste de dépenses",responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON))
			,@APIResponse(description = "Erreur lors de l'ajustement par autorisations d'engagements",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response adjustByEntryAuthorizations(List<ExpenditureDto.AdjustmentDto> adjustmentsDtos,@QueryParam(ExpenditureDto.JSON___AUDIT_WHO__) String auditWho);
}