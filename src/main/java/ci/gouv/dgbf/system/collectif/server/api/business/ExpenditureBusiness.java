package ci.gouv.dgbf.system.collectif.server.api.business;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

import org.cyk.utility.__kernel__.collection.CollectionHelper;
import org.cyk.utility.business.Result;

import ci.gouv.dgbf.system.collectif.server.api.persistence.Expenditure;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

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
	
	LoadableVerificationResult verifyLoadable(String legislativeActVersionIdentifier,Collection<Expenditure> expenditures);
	
	public interface LoadableVerificationResultable {
		Settable getUndefined();
		Settable getUnknown();
		Collection<String> getDuplicates();
		
		default Boolean hasWarnings() {
			return hasUndefined() || hasUnknown() || hasDuplicates();
		}
		
		default Boolean hasUndefined() {
			return getUndefined() != null && getUndefined().isNotEmpty();
		}
		
		default Boolean hasUnknown() {
			return getUnknown() != null && getUnknown().isNotEmpty();
		}
		
		default Boolean hasDuplicates() {
			return CollectionHelper.isNotEmpty(getDuplicates());
		}
		
		default Boolean containsDuplicates(String identifier) {
			if(!hasDuplicates())
				return Boolean.FALSE;
			return getDuplicates().contains(identifier);
		}
		
		default Collection<String> getUndefinedActivities() {
			if(getUndefined() == null)
				return null;
			return getUndefined().getActivities();
		}
		
		default Collection<String> getUndefinedEconomicsNatures() {
			if(getUndefined() == null)
				return null;
			return getUndefined().getEconomicsNatures();
		}
		
		default Collection<String> getUndefinedFundingsSources() {
			if(getUndefined() == null)
				return null;
			return getUndefined().getFundingsSources();
		}
		
		default Collection<String> getUndefinedLessors() {
			if(getUndefined() == null)
				return null;
			return getUndefined().getLessors();
		}
		
		default Collection<String> getUndefinedEntriesAuthorizationsAdjustments() {
			if(getUndefined() == null)
				return null;
			return getUndefined().getEntriesAuthorizationsAdjustments();
		}
		
		default Collection<String> getUndefinedPaymentsCreditsAdjustments() {
			if(getUndefined() == null)
				return null;
			return getUndefined().getPaymentsCreditsAdjustments();
		}
		
		default Collection<String> getUnknownActivities() {
			if(getUnknown() == null)
				return null;
			return getUnknown().getActivities();
		}
		
		default Collection<String> getUnknownEconomicsNatures() {
			if(getUnknown() == null)
				return null;
			return getUnknown().getEconomicsNatures();
		}
		
		default Collection<String> getUnknownFundingsSources() {
			if(getUnknown() == null)
				return null;
			return getUnknown().getFundingsSources();
		}
		
		default Collection<String> getUnknownLessors() {
			if(getUnknown() == null)
				return null;
			return getUnknown().getLessors();
		}
		
		default Collection<String> getUnknownEntriesAuthorizationsAdjustments() {
			if(getUnknown() == null)
				return null;
			return getUnknown().getEntriesAuthorizationsAdjustments();
		}
		
		default Collection<String> getUnknownPaymentsCreditsAdjustments() {
			if(getUnknown() == null)
				return null;
			return getUnknown().getPaymentsCreditsAdjustments();
		}
		
		public interface Settable {
			Collection<String> getActivities();
			Collection<String> getEconomicsNatures();
			Collection<String> getFundingsSources();
			Collection<String> getLessors();
			Collection<String> getEntriesAuthorizationsAdjustments();
			Collection<String> getPaymentsCreditsAdjustments();
			
			default Boolean isNotEmpty() {
				return CollectionHelper.isNotEmpty(getActivities()) || CollectionHelper.isNotEmpty(getEconomicsNatures()) || CollectionHelper.isNotEmpty(getFundingsSources()) || CollectionHelper.isNotEmpty(getLessors())
						|| CollectionHelper.isNotEmpty(getEntriesAuthorizationsAdjustments()) || CollectionHelper.isNotEmpty(getPaymentsCreditsAdjustments());
			}
			
			default Boolean containsActivities(String identifier) {
				if(CollectionHelper.isEmpty(getActivities()))
					return Boolean.FALSE;
				return getActivities().contains(identifier);
			}
			
			default Boolean containsEconomicsNatures(String identifier) {
				if(CollectionHelper.isEmpty(getEconomicsNatures()))
					return Boolean.FALSE;
				return getEconomicsNatures().contains(identifier);
			}
			
			default Boolean containsFundingsSources(String identifier) {
				if(CollectionHelper.isEmpty(getFundingsSources()))
					return Boolean.FALSE;
				return getFundingsSources().contains(identifier);
			}
			
			default Boolean containsLessors(String identifier) {
				if(CollectionHelper.isEmpty(getLessors()))
					return Boolean.FALSE;
				return getLessors().contains(identifier);
			}
			
			default Boolean containsEntriesAuthorizationsAdjustments(String identifier) {
				if(CollectionHelper.isEmpty(getEntriesAuthorizationsAdjustments()))
					return Boolean.FALSE;
				return getEntriesAuthorizationsAdjustments().contains(identifier);
			}
			
			default Boolean containsPaymentsCreditsAdjustments(String identifier) {
				if(CollectionHelper.isEmpty(getPaymentsCreditsAdjustments()))
					return Boolean.FALSE;
				return getPaymentsCreditsAdjustments().contains(identifier);
			}
		}
	}
	
	@Getter @Setter @Accessors(chain=true)
	public static class LoadableVerificationResult extends Result implements LoadableVerificationResultable,Serializable {
		private Set undefined,unknown;
		private Collection<String> duplicates;
		
		@Override
		public LoadableVerificationResult open() {
			return (LoadableVerificationResult) super.open();
		}
		
		public Set getUndefined(Boolean instantiateIfNull) {
			if(undefined == null && Boolean.TRUE.equals(instantiateIfNull))
				undefined = new Set();
			return undefined;
		}
		
		public Set getUnknown(Boolean instantiateIfNull) {
			if(unknown == null && Boolean.TRUE.equals(instantiateIfNull))
				unknown = new Set();
			return unknown;
		}
		
		@Getter @Setter @Accessors(chain=true)
		public static class Set implements LoadableVerificationResultable.Settable,Serializable {
			Collection<String> activities,economicsNatures,fundingsSources,lessors,entriesAuthorizationsAdjustments,paymentsCreditsAdjustments;
		}
	}
	
	String RESULT_MAP_UNDEFINED_ACTIVITIES_CODES_IDENTIFIERS = "undefined_activities_codes_identifiers";
	String RESULT_MAP_UNDEFINED_ECONOMICS_NATURES_CODES_IDENTIFIERS = "undefined_economics_natures_codes_identifiers";
	String RESULT_MAP_UNDEFINED_FUNDING_SOURCES_CODES_IDENTIFIERS = "undefined_fundings_sources_codes_identifiers";
	String RESULT_MAP_UNDEFINED_LESSORS_CODES_IDENTIFIERS = "undefined_lessors_codes_identifiers";
	String RESULT_MAP_UNDEFINED_ENTRIES_AUTHORIZATIONS_ADJUSTMENTS_IDENTIFIERS = "undefined_entries_authorizations_adjustments_identifiers";
	String RESULT_MAP_UNDEFINED_PAYMENTS_CREDITS_ADJUSTMENTS_IDENTIFIERS = "undefined_payments_credits_adjustments_identifiers";
	
	String RESULT_MAP_UNKNOWN_ACTIVITIES_CODES = "unknwown_activities_codes";
	String RESULT_MAP_UNKNOWN_ECONOMICS_NATURES_CODES = "unknwown_economics_natures_codes";
	String RESULT_MAP_UNKNOWN_FUNDING_SOURCES_CODES = "unknwown_fundings_sources_codes";
	String RESULT_MAP_UNKNOWN_LESSORS_CODES = "unknwown_lessors_codes";
	
	String RESULT_MAP_UNFORMATTED_ENTRIES_AUTHORIZATIONS_ADJUSTMENTS_IDENTIFIERS = "unformatted_entries_authorizations_adjustments_identifiers";
	String RESULT_MAP_UNFORMATTED_PAYMENTS_CREDITS_ADJUSTMENTS_IDENTIFIERS = "unformatted_payments_credits_adjustments_identifiers";
	
	String RESULT_MAP_DUPLICATES_IDENTIFIERS = "duplicates_identifiers";
}