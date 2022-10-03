package pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Request{

	@JsonProperty("unit")
	private String unit;

	@JsonProperty("query")
	private String query;

	@JsonProperty("language")
	private String language;

	@JsonProperty("type")
	private String type;
}