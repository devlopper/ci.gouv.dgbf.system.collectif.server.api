package ci.gouv.dgbf.system.collectif.server.api.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.json.bind.annotation.JsonbProperty;
import javax.json.bind.annotation.JsonbTransient;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.cyk.utility.__kernel__.collection.CollectionHelper;
import org.cyk.utility.__kernel__.map.MapHelper;
import org.cyk.utility.rest.ResponseHelper;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.parameters.Parameter;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import ci.gouv.dgbf.system.collectif.server.api.business.ExpenditureBusiness;
import ci.gouv.dgbf.system.collectif.server.api.business.ExpenditureBusiness.LoadableVerificationResult;
import ci.gouv.dgbf.system.collectif.server.api.business.ExpenditureBusiness.LoadableVerificationResultable;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

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
	@Path("chargement")
	@Produces( MediaType.APPLICATION_JSON)
	@Operation(description = "Charger des dépenses")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON))
			,@APIResponse(description = "Erreur lors du chargement des dépenses",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response load(@QueryParam(ExpenditureDto.JSON_LEGISLATIVE_ACT_VERSION_IDENTIFIER) String legislativeActVersionIdentifier,List<ExpenditureDto.LoadDto> loads,@QueryParam(ExpenditureDto.JSON___AUDIT_WHO__) String auditWho);
	
	@POST
	@Path("verification-chargeable")
	@Produces( MediaType.APPLICATION_JSON)
	@Operation(description = "Verifier les dépenses chargeables")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON))
			,@APIResponse(description = "Erreur lors de la vérification des dépenses chargeables",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	Response verifyLoadable(@QueryParam(ExpenditureDto.JSON_LEGISLATIVE_ACT_VERSION_IDENTIFIER) String legislativeActVersionIdentifier,List<ExpenditureDto.LoadDto> loads);
	
	@Getter @Setter @Accessors(chain=true) @NoArgsConstructor
	public static class LoadableVerificationResultDto implements ExpenditureBusiness.LoadableVerificationResultable,Serializable {
		@JsonbProperty(JSON_MESSAGE) private String message;
		@JsonbProperty(JSON_UNDEFINED) private SetDto undefined;
		@JsonbProperty(JSON_UNKNOWN) private SetDto unknown;
		@JsonbProperty(JSON_DUPLICATES) private List<String> duplicates;
		@JsonbProperty(JSON_ENTRY_AUTHORIZATION_AVAILABLE_IS_NOT_ENOUGH) private List<String> entryAuthorizationAvailableIsNotEnough;
		@JsonbProperty(JSON_PAYMENT_CREDIT_AVAILABLE_IS_NOT_ENOUGH) private List<String> paymentCreditAvailableIsNotEnough;
		@JsonbProperty(JSON_ENTRY_AUTHORIZATION_ADJUSTMENT) private Map<String,Long> entryAuthorizationAdjustment;
		@JsonbProperty(JSON_PAYMENT_CREDIT_ADJUSTMENT) private Map<String,Long> paymentCreditAdjustment;
		@JsonbProperty(JSON_ENTRY_AUTHORIZATION_AVAILABLE) private Map<String,Long> entryAuthorizationAvailable;
		@JsonbProperty(JSON_PAYMENT_CREDIT_AVAILABLE) private Map<String,Long> paymentCreditAvailable;
		
		public LoadableVerificationResultDto(LoadableVerificationResult loadableVerificationResult) {
			message = ResponseHelper.concatenate(loadableVerificationResult.getMessages());
			if(loadableVerificationResult.hasUndefined())
				undefined = new SetDto(loadableVerificationResult.getUndefined());
			if(loadableVerificationResult.hasUnknown())
				unknown = new SetDto(loadableVerificationResult.getUnknown());
			if(loadableVerificationResult.hasDuplicates())
				duplicates = new ArrayList<String>(loadableVerificationResult.getDuplicates());
			if(loadableVerificationResult.hasEntryAuthorizationAvailableIsNotEnough())
				entryAuthorizationAvailableIsNotEnough = new ArrayList<String>(loadableVerificationResult.getEntryAuthorizationAvailableIsNotEnough());
			if(loadableVerificationResult.hasPaymentCreditAvailableIsNotEnough())
				paymentCreditAvailableIsNotEnough = new ArrayList<String>(loadableVerificationResult.getPaymentCreditAvailableIsNotEnough());
			
			if(MapHelper.isNotEmpty(loadableVerificationResult.getEntryAuthorizationAdjustment()))
				entryAuthorizationAdjustment = new HashMap<String, Long>(loadableVerificationResult.getEntryAuthorizationAdjustment());
			if(MapHelper.isNotEmpty(loadableVerificationResult.getPaymentCreditAdjustment()))
				paymentCreditAdjustment = new HashMap<String, Long>(loadableVerificationResult.getPaymentCreditAdjustment());
			
			if(MapHelper.isNotEmpty(loadableVerificationResult.getEntryAuthorizationAvailable()))
				entryAuthorizationAvailable = new HashMap<String, Long>(loadableVerificationResult.getEntryAuthorizationAvailable());
			if(MapHelper.isNotEmpty(loadableVerificationResult.getPaymentCreditAvailable()))
				paymentCreditAvailable = new HashMap<String, Long>(loadableVerificationResult.getPaymentCreditAvailable());
		}
		
		@Override @JsonbTransient
		public Collection<String> getUndefinedActivities() {
			return LoadableVerificationResultable.super.getUndefinedActivities();
		}
		
		@Override @JsonbTransient
		public Collection<String> getUndefinedEconomicsNatures() {
			return LoadableVerificationResultable.super.getUndefinedEconomicsNatures();
		}
		
		@Override @JsonbTransient
		public Collection<String> getUndefinedFundingsSources() {
			return LoadableVerificationResultable.super.getUndefinedFundingsSources();
		}
		
		@Override @JsonbTransient
		public Collection<String> getUndefinedLessors() {
			return LoadableVerificationResultable.super.getUndefinedLessors();
		}
		
		@Override @JsonbTransient
		public Collection<String> getUndefinedEntriesAuthorizationsAdjustments() {
			return LoadableVerificationResultable.super.getUndefinedEntriesAuthorizationsAdjustments();
		}
		
		@Override @JsonbTransient
		public Collection<String> getUndefinedPaymentsCreditsAdjustments() {
			return LoadableVerificationResultable.super.getUndefinedPaymentsCreditsAdjustments();
		}
		
		@Override @JsonbTransient
		public Collection<String> getUnknownActivities() {
			return LoadableVerificationResultable.super.getUnknownActivities();
		}
		
		@Override @JsonbTransient
		public Collection<String> getUnknownEconomicsNatures() {
			return LoadableVerificationResultable.super.getUnknownEconomicsNatures();
		}
		
		@Override @JsonbTransient
		public Collection<String> getUnknownFundingsSources() {
			return LoadableVerificationResultable.super.getUnknownFundingsSources();
		}
		
		@Override @JsonbTransient
		public Collection<String> getUnknownLessors() {
			return LoadableVerificationResultable.super.getUnknownLessors();
		}
		
		@Override @JsonbTransient
		public Collection<String> getUnknownEntriesAuthorizationsAdjustments() {
			return LoadableVerificationResultable.super.getUnknownEntriesAuthorizationsAdjustments();
		}
		
		@Override @JsonbTransient
		public Collection<String> getUnknownPaymentsCreditsAdjustments() {
			return LoadableVerificationResultable.super.getUnknownPaymentsCreditsAdjustments();
		}
		
		public static final String JSON_MESSAGE = "message";
		public static final String JSON_UNDEFINED = "non_defini";
		public static final String JSON_UNKNOWN = "inconnu";
		public static final String JSON_DUPLICATES = "doublon";
		public static final String JSON_ENTRY_AUTHORIZATION_AVAILABLE_IS_NOT_ENOUGH = "disponible_autorisation_engagement_insuffisant";
		public static final String JSON_PAYMENT_CREDIT_AVAILABLE_IS_NOT_ENOUGH = "disponible_credit_paiement_insuffisant";
		public static final String JSON_ENTRY_AUTHORIZATION_ADJUSTMENT = "ajustement_autorisation_engagement";
		public static final String JSON_PAYMENT_CREDIT_ADJUSTMENT = "ajustement_credit_paiement";
		public static final String JSON_ENTRY_AUTHORIZATION_AVAILABLE = "disponible_autorisation_engagement";
		public static final String JSON_PAYMENT_CREDIT_AVAILABLE = "disponible_credit_paiement";
		
		@Getter @Setter @Accessors(chain=true) @NoArgsConstructor
		public static class SetDto implements ExpenditureBusiness.LoadableVerificationResultable.Settable,Serializable {
			@JsonbProperty(JSON_ACTIVITIES) List<String> activities;
			@JsonbProperty(JSON_ECONOMICS_NATURES) List<String> economicsNatures;
			@JsonbProperty(JSON_FUNDINGS_SOURCES) List<String> fundingsSources;
			@JsonbProperty(JSON_LESSORS) List<String> lessors;
			@JsonbProperty(JSON_ENTRIES_AUTHORIZATIONS_ADJUSTMENTS) List<String> entriesAuthorizationsAdjustments;
			@JsonbProperty(JSON_PAYMENTS_CREDITS_ADJUSTMENTS) List<String> paymentsCreditsAdjustments;
			
			public SetDto(LoadableVerificationResult.Set set) {
				if(CollectionHelper.isNotEmpty(set.getActivities()))
					activities = new ArrayList<String>(set.getActivities());
				
				if(CollectionHelper.isNotEmpty(set.getEconomicsNatures()))
					economicsNatures = new ArrayList<String>(set.getEconomicsNatures());
				
				if(CollectionHelper.isNotEmpty(set.getFundingsSources()))
					fundingsSources = new ArrayList<String>(set.getFundingsSources());
				
				if(CollectionHelper.isNotEmpty(set.getLessors()))
					lessors = new ArrayList<String>(set.getLessors());
				
				if(CollectionHelper.isNotEmpty(set.getEntriesAuthorizationsAdjustments()))
					entriesAuthorizationsAdjustments = new ArrayList<String>(set.getEntriesAuthorizationsAdjustments());
				
				if(CollectionHelper.isNotEmpty(set.getPaymentsCreditsAdjustments()))
					paymentsCreditsAdjustments = new ArrayList<String>(set.getPaymentsCreditsAdjustments());
				
				
			}
			
			@Override @JsonbTransient
			public Boolean isNotEmpty() {
				return Settable.super.isNotEmpty();
			}
		}
		
		public static final String JSON_ACTIVITIES = "activites";
		public static final String JSON_ECONOMICS_NATURES = "natures_economiques";
		public static final String JSON_FUNDINGS_SOURCES = "sources_financements";
		public static final String JSON_LESSORS = "bailleurs";
		public static final String JSON_ENTRIES_AUTHORIZATIONS_ADJUSTMENTS = "ajustements_autorisations_engagements";
		public static final String JSON_PAYMENTS_CREDITS_ADJUSTMENTS = "ajustements_credits_paiements";
	}
	
	/**/
	
	String HEADER_UNDEFINED_ACTIVITIES_CODES_IDENTIFIERS = "identifiants_codes_activites_non_defini";
	String HEADER_UNDEFINED_ECONOMICS_NATURES_CODES_IDENTIFIERS = "identifiants_codes_nature_economiques_non_defini";
	String HEADER_UNDEFINED_FUNDINGS_SOURCES_CODES_IDENTIFIERS = "identifiants_codes_sources_financement_non_defini";
	String HEADER_UNDEFINED_LESSORS_CODES_IDENTIFIERS = "identifiants_codes_bailleurs_non_defini";
	
	String HEADER_UNKNOWN_ACTIVITIES_CODES = "codes_activites_inconnus";
	String HEADER_UNKNOWN_ECONOMICS_NATURES_CODES = "codes_natures_economiques_inconnus";
	String HEADER_UNKNOWN_FUNDINGS_SOURCES_CODES = "codes_sources_financements_inconnus";
	String HEADER_UNKNOWN_LESSORS_CODES = "codes_bailleurs_inconnus";
	String HEADER_DUPLICATES_IDENTIFIERS = "identifiants_doublons";
}