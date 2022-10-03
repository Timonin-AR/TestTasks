import io.restassured.http.ContentType;
import pojos.WeatherResponse;

import static io.restassured.RestAssured.given;

public class WeatherUtils {

    private static final String KEY_ACCESS = "93cbb551b39cf6c455185b32f6ac46b5";
    private static final String BASE_URI = "http://api.weatherstack.com/";
    private static final String CURRENT_PATH = "current";
    private static final String PARAM_ACCESS_NAME = "access_key";
    private static final String QUERY_NAME = "query";

    public static void showWeather(String str) {
        given()
                .baseUri(BASE_URI)
                .basePath(CURRENT_PATH)
                .param(PARAM_ACCESS_NAME, KEY_ACCESS)
                .queryParam(QUERY_NAME, str)
                .contentType(ContentType.JSON)
                .when().get().print();

    }

    public static WeatherResponse getWeatherLikeObject(String cityName) {
        return given()
                .baseUri(BASE_URI)
                .basePath(CURRENT_PATH)
                .param(PARAM_ACCESS_NAME, KEY_ACCESS)
                .queryParam(QUERY_NAME, cityName)
                .contentType(ContentType.JSON)
                .when().get().getBody().as(WeatherResponse.class);
    }

    public static String getWeatherLikeString(String cityName, String query) {
        return given()
                .baseUri(BASE_URI)
                .basePath(CURRENT_PATH)
                .param(PARAM_ACCESS_NAME, KEY_ACCESS)
                .queryParam(query, cityName)
                .contentType(ContentType.JSON)
                .when().get().print();
    }

    public static String getWeatherLikeString(String keyAccess) {
        return given()
                .baseUri(BASE_URI)
                .basePath(CURRENT_PATH)
                .param(PARAM_ACCESS_NAME, keyAccess)
                .queryParam(QUERY_NAME, "Moscow")
                .contentType(ContentType.JSON)
                .when().get().print();
    }
}
