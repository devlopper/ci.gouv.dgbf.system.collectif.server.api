package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(SectionService.PATH)
@Tag(name = "Section")
public interface SectionService extends org.cyk.utility.service.SpecificService<SectionDto> {
	String PATH = "sections";
}