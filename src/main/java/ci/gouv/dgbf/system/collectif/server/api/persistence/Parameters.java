package ci.gouv.dgbf.system.collectif.server.api.persistence;

public interface Parameters {

	String IDENTIFIERS = "ids";
	String USER_NAME = "nom_utilisateur";
	String SEARCH = "recherche";
	String __AUDIT_IDENTIFIER__ = "audit_id";
	String __AUDIT_WHO__ = "audit_qui";
	String __AUDIT_WHEN__ = "audit_quand";
	
	String EXERCISE_IDENTIFIER = "exercice_id";
	String EXERCISE_YEAR = "exercice_annee";
	String LEGISLATIVE_ACT_IDENTIFIER = "col_id";
	String LEGISLATIVE_ACT_IN_PROGRESS = "col_en_cours";
	String LATEST_LEGISLATIVE_ACT = "dc";
	String LEGISLATIVE_ACT_VERSION_IDENTIFIER = "vcol_id";
	String LATEST_LEGISLATIVE_ACT_VERSION = "vcol_dernier";
	String DEFAULT_LEGISLATIVE_ACT_VERSION_IN_LATEST_LEGISLATIVE_ACT = "vpd_"+LATEST_LEGISLATIVE_ACT;
	String DEFAULT_VALUE = "valeur_par_defaut";
	String SECTION_IDENTIFIER = "s_id";
	String ADMINISTRATIVE_UNIT_IDENTIFIER = "ua_id";
	String BUDGET_CATEGORY_IDENTIFIER = "cb_id";
	String BUDGET_SPECIALIZATION_UNIT_IDENTIFIER = "usb_id";
	String ACTION_IDENTIFIER = "a_id";
	String ACTIVITY_IDENTIFIER = "as_id";
	String ACTIVITIES_IDENTIFIERS = "as_ids";
	String RESOURCE_ACTIVITY_IDENTIFIER = "ar_id";
	String EXPENDITURE_NATURE_IDENTIFIER = "nd_id";
	String ACTIVITY_CATEGORY_IDENTIFIER = "ca_id";
	String ECONOMIC_NATURE_IDENTIFIER = "ne_id";
	String ECONOMIC_NATURES_IDENTIFIERS = "ne_ids";
	String FUNDING_SOURCE_IDENTIFIER = "sf_id";
	String FUNDING_SOURCES_IDENTIFIERS = "sf_ids";
	String LESSOR_IDENTIFIER = "b_id";
	String LESSORS_IDENTIFIERS = "b_ids";
	
	String EXPENDITURES_IDENTIFIERS = "d_ids";
	
	String REGULATORY_ACT_INCLUDED = "ar_inclus";
	String REGULATORY_ACT_IDENTIFIER = "ar_id";
	String REGULATORY_ACT_IDENTIFIERS = "ar_ids";
	String REGULATORY_ACT_DATE_GREATER_THAN_OR_EQUAL = "date_pge";
	String REGULATORY_ACT_DATE_LOWER_THAN_OR_EQUAL = "date_ppe";
	
	String ADJUSTMENTS_EQUAL_ZERO = "ae_et_cp_e_zero";
	String ADJUSTMENTS_NOT_EQUAL_ZERO = "ae_et_cp_ne_zero";
	String INCLUDED_MOVEMENT_NOT_EQUAL_ZERO = "mi_ne_zero";
	String ADJUSTMENTS_NOT_EQUAL_ZERO_OR_INCLUDED_MOVEMENT_NOT_EQUAL_ZERO = ADJUSTMENTS_NOT_EQUAL_ZERO+"_ou_"+INCLUDED_MOVEMENT_NOT_EQUAL_ZERO;
	String AVAILABLE_MINUS_INCLUDED_MOVEMENT_PLUS_ADJUSTMENT_LESS_THAN_ZERO = "disponible_moins_mi_plus_ajustement_inferieur_zero";
	String GENERATED_ACT_IDENTIFIER = "ag_id";
	String GENERATED_ACT_IDENTIFIERS = "ag_ids";
	String GENERATED_ACT_EXPENDITURE_EXISTS = "d_ag_existe";
	
	String AMOUNT_SUMABLE = "montant_sommable";
	//String AMOUNT_SUMABLE_ALL = "montant_sommable_tout";
	String AMOUNT_SUMABLE_WITHOUT_INCLUDED_MOVEMENT_AND_AVAILABLE = "montant_sommable_sans_mouvement_inclus_et_disponible";
	String AMOUNT_SUMABLE_WITH_INCLUDED_MOVEMENT_ONLY = "montant_sommable_avec_mouvement_inclus_seulement";
	String AMOUNT_SUMABLE_WITH_AVAILABLE_ONLY = "montant_sommable_avec_disponible_seulement";
	String AMOUNT_SUMABLE_WITH_INCLUDED_MOVEMENT_AND_AVAILABLE_ONLY = "montant_sommable_avec_mouvement_inclus_et_disponible_seulement";
	String EXPENDITURE_AMOUNT_SUMABLE = "montant_depense_sommable";
	String RESOURCE_AMOUNT_SUMABLE = "montant_ressource_sommable";
}