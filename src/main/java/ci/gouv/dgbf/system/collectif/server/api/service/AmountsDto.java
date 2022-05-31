package ci.gouv.dgbf.system.collectif.server.api.service;

import ci.gouv.dgbf.system.collectif.server.api.persistence.Amounts;

public interface AmountsDto extends Amounts {

	String JSON_ADJUSTMENT = "ajustement";
	String JSON_ADJUSTMENT_LESS_THAN_ZERO = "ajustement_inferieur_a_zero";
	String JSON_ADJUSTMENT_GREATER_THAN_ZERO = "ajustement_superieur_a_zero";
	String JSON_EXPECTED_ADJUSTMENT = "ajustement_attendu";
	String JSON_EXPECTED_ADJUSTMENT_MINUS_ADJUSTMENT = "ajustement_attendu_moins_ajustement";
	String JSON_INITIAL = "initial";
	String JSON_MOVEMENT = "mouvement";
	String JSON_MOVEMENT_INCLUDED = "mouvement_inclu";
	String JSON_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT = "mouvement_inclu_plus_ajustement";
	String JSON_ACTUAL = "actuel";
	String JSON_ACTUAL_AT_LEGISLATIVE_ACT_DATE = "actuel_a_date_collectif";
	String JSON_ACTUAL_AT_LEGISLATIVE_ACT_DATE_PLUS_ADJUSTMENT = "actuel_a_date_collectif_plus_ajustement";
	String JSON_ACTUAL_AT_LEGISLATIVE_ACT_DATE_MINUS_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT = "actuel_a_date_collectif_moins_mouvement_inclu_plus_ajustement";
	String JSON_ACTUAL_MINUS_MOVEMENT_INCLUDED = "actuel_moins_mouvement_inclu";
	String JSON_AVAILABLE = "disponible";
	String JSON_ACTUAL_MINUS_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT = "actuel_moins_mouvement_inclu_plus_ajustement";
	String JSON_AVAILABLE_MINUS_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT = "disponile_moins_mouvement_inclu_plus_ajustement";
	String JSON_ACTUAL_PLUS_ADJUSTMENT = "actuel_plus_ajustement";
	String JSON_INITIAL_PLUS_MOVEMENT_INCLUDED = "initial_plus_mouvement_inclu";
	String JSON_INITIAL_PLUS_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT = "initial_plus_mouvement_inclu_plus_ajustement";
}