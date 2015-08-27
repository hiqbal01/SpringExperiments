package hello;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

/**
 * Created by hiqbal on 8/25/2015.
 */

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherValue {
    private String temp_f;
    private String precip_today_string;
    public String error;
}
