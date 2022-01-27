package ci.gouv.dgbf.system.collectif.server.api.persistence;

public interface Parameters {

	String EXERCISE_IDENTIFIER = "exercice_id";
	String EXERCISE_YEAR = "exercice_annee";
	String LEGISLATIVE_ACT_IDENTIFIER = "col_id";
	String LEGISLATIVE_ACT_VERSION_IDENTIFIER = "vcol_id";
	String LATEST_LEGISLATIVE_ACT_VERSION = "vcol_dernier";
	String SECTION_IDENTIFIER = "s_id";
	String ADMINISTRATIVE_UNIT_IDENTIFIER = "ua_id";
	String BUDGET_SPECIALIZATION_UNIT_IDENTIFIER = "usb_id";
	String ACTION_IDENTIFIER = "a_id";
	String ACTIVITY_IDENTIFIER = "as_id";
	String RESOURCE_ACTIVITY_IDENTIFIER = "ar_id";
	String EXPENDITURE_NATURE_IDENTIFIER = "nd_id";
	String ACTIVITY_CATEGORY_IDENTIFIER = "ca_id";
	String ECONOMIC_NATURE_IDENTIFIER = "ne_id";	
	String FUNDING_SOURCE_IDENTIFIER = "sf_id";
	String LESSOR_IDENTIFIER = "b_id";
	String REGULATORY_ACT_INCLUDED = "ar_inclus";
	String REGULATORY_ACT_IDENTIFIER = "ar_id";
	String REGULATORY_ACT_IDENTIFIERS = "ar_ids";
	String ADJUSTMENTS_EQUAL_ZERO = "ae_et_cp_eq_zero";
	String GENERATED_ACT_IDENTIFIER = "ag_id";
	String GENERATED_ACT_IDENTIFIERS = "ag_ids";
	String GENERATED_ACT_EXPENDITURE_EXISTS = "d_ag_existe";
}