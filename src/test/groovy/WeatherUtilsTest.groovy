
import spock.lang.Specification

class WeatherUtilsTest extends Specification {

    def "GetWeatherLikeObject"() {
        when:
        def weather = WeatherUtils.getWeatherLikeObject(City)
        then:
        weather.location.country == Country
        where:
        City       | Country
        "New York" | "United States of America"
        "Moscow"   | "Russia"
        "Paris"    | "France"
        "Cairo"    | "Egypt1"

    }

    def "Check error of request_failed"(){
        when:
        def weather = WeatherUtils.getWeatherLikeString("AAAA","query")
        then:
        weather.contains("request_failed")

    }

    def "Check error of missing_query"(){
        when:
        def weather = WeatherUtils.getWeatherLikeString("Москва","quer")
        then:
        weather.contains("missing_query")

    }
    def "Check error of bulk_queries_not_supported_on_plan"(){
        when:
        def weather = WeatherUtils.getWeatherLikeString(";;№","query")
        then:
        weather.contains("bulk_queries_not_supported_on_plan")

    }

    def "Check error of invalid_access_key"(){
        when:
        def weather = WeatherUtils.getWeatherLikeString("dd")
        then:
        weather.contains("invalid_access_key")

    }
}