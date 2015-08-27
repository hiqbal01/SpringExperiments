package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hiqbal on 8/25/2015.
 */
@RestController
public class WeatherController {
    private static final Logger log = LoggerFactory.getLogger(WeatherController.class);

    @RequestMapping("/weather/{state}/{city}")
    public WeatherValue weather(@PathVariable String city,@PathVariable String state){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://api.wunderground.com/api/3f651b59a29eca3c/conditions/q/" + state +"/" + city + ".json";
        Weather test = restTemplate.getForObject(url, Weather.class);
        log.info(test.toString());
        return test.getWeather();
    }
}


