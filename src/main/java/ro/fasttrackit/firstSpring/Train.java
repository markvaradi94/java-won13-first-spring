package ro.fasttrackit.firstSpring;

import org.springframework.stereotype.Component;

@Component
public class Train {
    private final Engine engine;

    public Train(Engine engine) {
        System.out.println("Building train");
        System.out.println("Received engine: " + engine);
        this.engine = engine;
    }
}
