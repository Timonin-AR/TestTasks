package pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class Location{

	@JsonProperty("localtime")
	private String localtime;

	@JsonProperty("utc_offset")
	private String utcOffset;

	@JsonProperty("country")
	private String country;

	@JsonProperty("localtime_epoch")
	private Integer localtimeEpoch;

	@JsonProperty("name")
	private String name;

	@JsonProperty("timezone_id")
	private String timezoneId;

	@JsonProperty("lon")
	private String lon;

	@JsonProperty("region")
	private String region;

	@JsonProperty("lat")
	private String lat;
}