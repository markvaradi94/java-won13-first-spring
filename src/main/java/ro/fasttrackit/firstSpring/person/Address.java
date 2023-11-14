package ro.fasttrackit.firstSpring.person;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Address {
    @Value("${address.city}")
    private String city;

    @Value("${address.street}")
    private String street;

    public Address() {
    }
}
