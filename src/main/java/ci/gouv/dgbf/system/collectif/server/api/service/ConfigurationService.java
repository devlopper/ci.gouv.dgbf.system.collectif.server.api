package ci.gouv.dgbf.system.collectif.server.api.service;

import java.io.Serializable;

import javax.json.bind.annotation.JsonbProperty;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Path(ConfigurationService.PATH)
@Tag(name = "Configuration Système",description = "Gestion de la configuration du système")
public interface ConfigurationService {
	String PATH = "configuration-systeme";

	@GET
	@Path("/")
	@Produces({MediaType.APPLICATION_JSON})
	@Operation(description = "Obtenir la configuration du système")
	@APIResponses(value = {
			@APIResponse(responseCode = "200", content = @Content(mediaType = MediaType.APPLICATION_JSON))
			,@APIResponse(description = "Erreur lors de l'obtention de la configuration du système",responseCode = "500", content = @Content(mediaType = MediaType.APPLICATION_JSON))
	})
	ConfigurationDto get();
	
	/**/

	@Getter @Setter @Accessors(chain=true)
	public static class ConfigurationDto implements Serializable {
		
		@JsonbProperty("visibilite-verifiable")
		private Boolean actorVisibilitiesEnabled;
		
		@Override
		public String toString() {
			return ToStringBuilder.reflectionToString(this, ToStringStyle.NO_CLASS_NAME_STYLE);
		}
	}
}