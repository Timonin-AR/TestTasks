package pojos;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Current{

	@JsonProperty("weather_descriptions")
	private List<String> weatherDescriptions;

	@JsonProperty("observation_time")
	private String observationTime;

	@JsonProperty("wind_degree")
	private Integer windDegree;

	@JsonProperty("visibility")
	private Integer visibility;

	@JsonProperty("weather_icons")
	private List<String> weatherIcons;

	@JsonProperty("feelslike")
	private Integer feelslike;

	@JsonProperty("is_day")
	private String isDay;

	@JsonProperty("wind_dir")
	private String windDir;

	@JsonProperty("pressure")
	private Integer pressure;

	@JsonProperty("cloudcover")
	private Integer cloudcover;

	@JsonProperty("precip")
	private Double precip;

	@JsonProperty("uv_index")
	private Integer uvIndex;

	@JsonProperty("temperature")
	private Integer temperature;

	@JsonProperty("humidity")
	private Integer humidity;

	@JsonProperty("wind_speed")
	private Integer windSpeed;

	@JsonProperty("weather_code")
	private Integer weatherCode;
}