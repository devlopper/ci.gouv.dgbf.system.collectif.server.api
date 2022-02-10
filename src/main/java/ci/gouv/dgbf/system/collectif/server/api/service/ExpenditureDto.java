package ci.gouv.dgbf.system.collectif.server.api.service;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.service.entity.IdentifiableSystemScalarString;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public interface ExpenditureDto extends IdentifiableSystemScalarString {

	String getActivityAsString();
	ExpenditureDto setActivityAsString(String activityAsString);
	
	String getEconomicNatureAsString();
	ExpenditureDto setEconomicNatureAsString(String economicNatureAsString);
	
	EntryAuthorizationDto getEntryAuthorization();
	ExpenditureDto setEntryAuthorization(EntryAuthorizationDto entryAuthorization);
	
	PaymentCreditDto getPaymentCredit();
	ExpenditureDto setPaymentCredit(PaymentCreditDto paymentCredit);
	
	String getActVersionAsString();
	ExpenditureDto setActVersionAsString(String actVersionAsString);
	
	/**/
	
	String JSON_EXPENDITURE = "depense";
	
	String JSON_IDENTIFIER = "identifiant";
	String JSON_LEGISLATIVE_ACT_VERSION_IDENTIFIER = "identifiant_version_collectif";
	String JSON_SECTION_AS_STRING = "section_string";
	String JSON_ADMINISTRATIVE_UNIT_AS_STRING = "unite_administrative_string";
	String JSON_BUDGET_SPECIALIZATION_UNIT_AS_STRING = "unite_specialisation_budget_string";
	String JSON_ACTION_AS_STRING = "action_string";
	String JSON_ACTIVITY_AS_STRING = "activite_string";
	String JSON_NATURE_AS_STRING = "nature_string";
	String JSON_ECONOMIC_NATURE_AS_STRING = "nature_economique_string";
	String JSON_ENTRY_AUTHORIZATION = CommonDto.JSON_ENTRY_AUTHORIZATION;
	String JSON_PAYMENT_CREDIT = CommonDto.JSON_PAYMENT_CREDIT;
	String JSON_BUDGETARY_ACT_AS_STRING = "acte_budgetaire_string";
	String JSON_BUDGETARY_ACT_VERSION_AS_STRING = "version_acte_budgetaire_string";
	String JSON_FUNDING_SOURCE_AS_STRING = "source_financement_string";
	String JSON_LESSOR_AS_STRING = "bailleur_string";
	String JSONS_AMOUTNS = "montants";
	String JSONS_AMOUTNS_WITHOUT_AVAILABLE = "montants_sans_disponible";
	String JSONS_STRINGS = "chaines";
	String JSONS_IDENTIFIERS = "identifiants";
	
	String JSONS_ADJUSTMENTS = "ajustements";
	
	String JSON___AUDIT__ = CommonDto.JSON___AUDIT__;
	String JSONS___AUDITS__ = CommonDto.JSONS___AUDITS__;
	String JSON___AUDIT_WHO__ = CommonDto.JSON___AUDIT_WHO__;
	String JSON___AUDIT_FUNCTIONALITY__ = CommonDto.JSON___AUDIT_FUNCTIONALITY__;
	String JSON___AUDIT_WHAT__ = CommonDto.JSON___AUDIT_WHAT__;
	String JSON___AUDIT_WHEN__ = CommonDto.JSON___AUDIT_WHEN__;
	
	@Getter @Setter @Accessors(chain=true)
	public static class AdjustmentDto implements Serializable {
		
		@JsonbProperty(value = "identifiant_depense")
		private String identifier;
		
		@JsonbProperty(value = "ajustement_"+EntryAuthorizationDto.JSON_ENTRY_AUTHORIZATION)
		private Long entryAuthorization;
		
		@JsonbProperty(value = "ajustement_"+PaymentCreditDto.JSON_PAYMENT_CREDIT)
		private Long paymentCredit;
	}
}