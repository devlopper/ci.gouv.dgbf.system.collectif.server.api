package ci.gouv.dgbf.system.collectif.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

import lombok.Getter;

public interface LegislativeAct extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	String NAME = "Collectif budgétaire";
	String NAME_PLURAL = "Collectifs budgétaires";
	
	/**/
	
	String ACT_GENERATION_TYPE_VALUE_CANCELATION_REPOSITIONING_ADJUSTMENT = "ANNULATION_REPOSITIONNEMENT_AJUSTEMENT";
	String ACT_GENERATION_TYPE_VALUE_CANCELATION_ADJUSTMENT = "ANNULATION_AJUSTEMENT";
	String ACT_GENERATION_TYPE_VALUE_ADJUSTMENT = "AJUSTEMENT";
	
	/**/
	
	@Getter
	public static enum ActGenerationMode {
		/**
		 * This is an act to cancel a previously passed act
		 */
		CANCELATION_REPOSITIONING_ADJUSTMENT(ACT_GENERATION_TYPE_VALUE_CANCELATION_REPOSITIONING_ADJUSTMENT),
		/**This is an act to reposition a cancelled act
		 * 
		 */
		CANCELATION_ADJUSTMENT(ACT_GENERATION_TYPE_VALUE_CANCELATION_ADJUSTMENT),
		/**
		 * This is an act to consider made adjustments
		 */
		ADJUSTMENT(ACT_GENERATION_TYPE_VALUE_ADJUSTMENT)
		
		;
		
		private String value;
		
		private ActGenerationMode(String value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			return value;
		}
		
		/**/
		
		public static ActGenerationMode getFromValue(String value) {
	        switch (value) {
	        case ACT_GENERATION_TYPE_VALUE_CANCELATION_REPOSITIONING_ADJUSTMENT: return ActGenerationMode.CANCELATION_REPOSITIONING_ADJUSTMENT;
	        case ACT_GENERATION_TYPE_VALUE_CANCELATION_ADJUSTMENT: return ActGenerationMode.CANCELATION_ADJUSTMENT;
	        case ACT_GENERATION_TYPE_VALUE_ADJUSTMENT: return ActGenerationMode.ADJUSTMENT;
	        default: throw new IllegalArgumentException(String.format("value [%s] not supported.", value) );
	        }
	    }
		
		/**/
		
		public static final ActGenerationMode DEFAULT = ActGenerationMode.CANCELATION_ADJUSTMENT;
	}
}