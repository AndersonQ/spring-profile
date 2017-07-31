package hello;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Profile("default")
public class GreetingDefault implements Greeting {

    private Logger log = Logger.getLogger(this.getClass().getName());

    public String greet(String name) {

        String s = String.format("[Default] Greetings from %s", name);
        log.info(String.format("GreetingDev.greet(): %s", s));

        return s;
    }
}
