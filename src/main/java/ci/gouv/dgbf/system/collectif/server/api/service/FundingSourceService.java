package ci.gouv.dgbf.system.collectif.server.api.service;

import javax.ws.rs.Path;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path(FundingSourceService.PATH)
@Tag(name = "Sources de financements")
public interface FundingSourceService extends org.cyk.utility.service.SpecificService<FundingSourceDto> {
	String PATH = "sources_financements";
}