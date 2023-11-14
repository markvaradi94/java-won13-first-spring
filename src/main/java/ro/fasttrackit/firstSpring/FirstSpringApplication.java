package ro.fasttrackit.firstSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class FirstSpringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(FirstSpringApplication.class, args);

//        Arrays.stream(context.getBeanDefinitionNames())
//                .forEach(System.out::println);
    }

}
