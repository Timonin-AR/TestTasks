package pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class WeatherResponse{

	@JsonProperty("request")
	private Request request;

	@JsonProperty("current")
	private Current current;

	@JsonProperty("location")
	private Location location;
}