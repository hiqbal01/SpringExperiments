package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * Created by hiqbal on 8/25/2015.
 */

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    private WeatherValue current_observation;

    public WeatherValue getWeather(){
        return current_observation;
    }
}
