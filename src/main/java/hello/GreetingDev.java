package hello;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Profile("dev")
public class GreetingDev implements Greeting {

    private Logger log = Logger.getLogger(this.getClass().getName());

    public String greet(String name) {
        String s = String.format("[DEV] Greetings from %s", name);
        log.info(String.format("GreetingDev.greet(): %s", s));
        return s;
    }
}
