package hello;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by hiqbal on 8/25/2015.
 */
@ResponseStatus(value= HttpStatus.NOT_FOUND, reason="No such Order")  // 404
public class LocationNotFound extends RuntimeException {

}