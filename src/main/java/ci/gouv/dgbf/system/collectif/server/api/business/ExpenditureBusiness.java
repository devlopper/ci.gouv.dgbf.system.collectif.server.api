package ci.gouv.dgbf.system.collectif.server.api.business;

import java.util.Collection;
import java.util.Map;

import org.cyk.utility.business.Result;

import ci.gouv.dgbf.system.collectif.server.api.persistence.Expenditure;

public interface ExpenditureBusiness extends ExpenditureResourceBusiness<Expenditure> {
	
	String ADJUST_AUDIT_IDENTIFIER = "AJUSTEMENT_DEPENSES";
	/**
	 * Ajuster les autorisations d'engagements et les crédits de paiements des dépenses.
	 * @param adjustments : autorisations d'engagements et crédits de paiements
	 * @return
	 */
	Result adjust(Map<String,Long[]> adjustments,String auditWho);
	
	String ADJUST_BY_ENTRY_AUTHORIZATIONS_AUDIT_IDENTIFIER = "AJUSTEMENT_DEPENSES_PAR_AE";
	/**
	 * {@link #adjust(Map)}.<br/>
	 * Les crédits de paiements sont initialisés avec les autorisations d'engagements.
	 * @param entryAuthorizations : Autorisations d'engagements
	 * @return
	 */
	Result adjustByEntryAuthorizations(Map<String,Long> entryAuthorizations,String auditWho);

	String IMPORT_AUDIT_IDENTIFIER = "IMPORTATION_DEPENSES";
	
	String COPY_ADJUSTMENTS_AUDIT_IDENTIFIER = "COPIE_AJUSTEMENTS_DEPENSES";
	
	String LOAD_ADJUSTMENTS_AUDIT_IDENTIFIER = "CHARGEMENT_AJUSTEMENTS_DEPENSES";
	
	//Result loadFromExcelFile(String legislativeActVersionIdentifier,byte[] bytes,Integer activityCodeColumnIndex,Integer economicNatureCodeColumnIndex,Integer fundingSourceCodeColumnIndex,Integer lessorCodeColumnIndex,String auditWho);
	
	//Result loadFromExcelFile(String legislativeActVersionIdentifier,byte[] bytes,Integer activityCodeColumnIndex,Integer economicNatureCodeColumnIndex,Integer fundingSourceCodeColumnIndex,Integer lessorCodeColumnIndex,String auditWho);
	
	Result load(String legislativeActVersionIdentifier,Collection<Expenditure> expenditures,String auditWho);
	
	Result verifyLoadable(String legislativeActVersionIdentifier,Collection<Expenditure> expenditures);
	
	String RESULT_MAP_UNDEFINED_ACTIVITIES_CODES_IDENTIFIERS = "undefined_activities_codes_identifiers";
	String RESULT_MAP_UNDEFINED_ECONOMICS_NATURES_CODES_IDENTIFIERS = "undefined_economics_natures_codes_identifiers";
	String RESULT_MAP_UNDEFINED_FUNDING_SOURCES_CODES_IDENTIFIERS = "undefined_fundings_sources_codes_identifiers";
	String RESULT_MAP_UNDEFINED_LESSORS_CODES_IDENTIFIERS = "undefined_lessors_codes_identifiers";
	
	String RESULT_MAP_UNKNOWN_ACTIVITIES_CODES = "unknwown_activities_codes";
	String RESULT_MAP_UNKNOWN_ECONOMICS_NATURES_CODES = "unknwown_economics_natures_codes";
	String RESULT_MAP_UNKNOWN_FUNDING_SOURCES_CODES = "unknwown_fundings_sources_codes";
	String RESULT_MAP_UNKNOWN_LESSORS_CODES = "unknwown_lessors_codes";
	
	String RESULT_MAP_DUPLICATES_IDENTIFIERS = "duplicates_identifiers";
}