package ro.fasttrackit.firstSpring;

import lombok.ToString;
import org.springframework.stereotype.Component;

@Component("defaultEngine")
@ToString
public class Engine {
    private int horsePower;

    public Engine() {
        System.out.println("Building default engine");
        horsePower = 100;
    }

    public Engine(int horsePower) {
        System.out.println("Building engine");
        this.horsePower = horsePower;
    }
}
