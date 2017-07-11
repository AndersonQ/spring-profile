package hello;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class GreetingProd implements Greeting {
    public String greet(String name) {
        return String.format("Greetings from %s", name);
    }
}
