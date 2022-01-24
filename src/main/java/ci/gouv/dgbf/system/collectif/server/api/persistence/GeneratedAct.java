package ci.gouv.dgbf.system.collectif.server.api.persistence;

import org.cyk.utility.persistence.entity.IdentifiableSystemScalarStringIdentifiableBusinessStringNamable;

import lombok.Getter;

public interface GeneratedAct extends IdentifiableSystemScalarStringIdentifiableBusinessStringNamable {

	String TYPE_VALUE_CANCELATION = "ANNULATION";
	String TYPE_VALUE_REPOSITIONING = "REPOSITIONNEMENT";
	String TYPE_VALUE_ADJUSTMENT = "AJUSTEMENT";
	
	String NAME = "Acte généré";
	String NAME_PLURAL = "Actes générés";
	
	/**/
	
	@Getter
	public static enum Type {
		/**
		 * This is an act to cancel a previously passed act
		 */
		CANCELATION(TYPE_VALUE_CANCELATION),
		/**This is an act to reposition a cancelled act
		 * 
		 */
		REPOSITIONING(TYPE_VALUE_REPOSITIONING),
		/**
		 * This is an act to consider made adjustments
		 */
		ADJUSTMENT(TYPE_VALUE_ADJUSTMENT)
		
		;
		
		private String value;
		
		private Type(String value) {
			this.value = value;
		}
		
		@Override
		public String toString() {
			return value;
		}
		
		/**/
		
		public static Type getFromValue(String value) {
	        switch (value) {
	        case TYPE_VALUE_CANCELATION: return Type.CANCELATION;
	        case TYPE_VALUE_REPOSITIONING: return Type.REPOSITIONING;
	        case TYPE_VALUE_ADJUSTMENT: return Type.ADJUSTMENT;
	        default: throw new IllegalArgumentException(String.format("value [%s] not supported.", value) );
	        }
	    }
		
		public static final Type[] CANCELATION_REPOSITIONING = new Type[] {CANCELATION,REPOSITIONING};
	}
}