package ci.gouv.dgbf.system.collectif.server.api.service;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;

import org.cyk.utility.service.entity.IdentifiableSystemScalarString;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

public interface ResourceDto extends IdentifiableSystemScalarString {

	String getActivityAsString();
	ResourceDto setActivityAsString(String activityAsString);
	
	String getEconomicNatureAsString();
	ResourceDto setEconomicNatureAsString(String economicNatureAsString);
	
	RevenueDto getRevenue();
	ResourceDto setRevenue(RevenueDto revenue);
	
	String getActVersionAsString();
	ResourceDto setActVersionAsString(String actVersionAsString);
	
	/**/
	
	String JSON_RESOURCE = "ressource";
	
	String JSON_IDENTIFIER = "identifiant";
	String JSON_SECTION_AS_STRING = "section_string";
	String JSON_BUDGET_SPECIALIZATION_UNIT_AS_STRING = "unite_specialisation_budget_string";
	String JSON_ACTIVITY_AS_STRING = "activite_string";
	String JSON_ECONOMIC_NATURE_AS_STRING = "nature_economique_string";
	String JSON_REVENUE = "revenue";
	String JSON_BUDGETARY_ACT_AS_STRING = "acte_budgetaire_string";
	String JSON_BUDGETARY_ACT_VERSION_AS_STRING = "version_acte_budgetaire_string";
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
		
		@JsonbProperty(value = "identifiant_ressource")
		private String identifier;
		
		@JsonbProperty(value = "ajustement")
		private Long revenue;
	}
}