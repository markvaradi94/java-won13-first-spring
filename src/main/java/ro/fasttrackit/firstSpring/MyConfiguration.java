package ro.fasttrackit.firstSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class MyConfiguration {

    @Primary
    @Bean("customEngine")
    public Engine engine() {
        return new Engine(200);
    }
}
