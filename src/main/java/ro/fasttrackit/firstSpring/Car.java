package ro.fasttrackit.firstSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private Engine engine;

    public Car(@Qualifier("customEngine") Engine engine) {
        System.out.println("Building car");
        System.out.println("Received engine: " + engine);
        this.engine = engine;
    }
}
