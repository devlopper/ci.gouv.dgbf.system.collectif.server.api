package ci.gouv.dgbf.system.collectif.server.api.service;

import ci.gouv.dgbf.system.collectif.server.api.persistence.Amounts;

public interface AmountsDto extends Amounts {

	String JSON_ADJUSTMENT = "ajustement";
	String JSON_EXPECTED_ADJUSTMENT = "ajustement_attendu";
	String JSON_EXPECTED_ADJUSTMENT_MINUS_ADJUSTMENT = "ajustement_attendu_moins_ajustement";
	String JSON_INITIAL = "initial";
	String JSON_MOVEMENT = "mouvement";
	String JSON_MOVEMENT_INCLUDED = "mouvement_inclu";
	String JSON_ACTUAL = "actuel";
	String JSON_ACTUAL_MINUS_MOVEMENT_INCLUDED = "actuel_moins_mouvement_inclu";
	String JSON_AVAILABLE = "disponible";
	String JSON_ACTUAL_MINUS_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT = "actuel_moins_mouvement_inclu_plus_ajustement";
	String JSON_AVAILABLE_MINUS_MOVEMENT_INCLUDED_PLUS_ADJUSTMENT = "disponile_moins_mouvement_inclu_plus_ajustement";
	String JSON_ACTUAL_PLUS_ADJUSTMENT = "actuel_plus_ajustement";
}