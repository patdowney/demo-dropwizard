package name.patdowney.demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;


/**
 * Created by pdowney on 23/03/2016.
 */
public class CurrentTime {
    public CurrentTime() {}

    @JsonProperty
    public String getCurrentTime() {
        return DateTime.now().toString(DateTimeFormat.fullDateTime());
    }
}
