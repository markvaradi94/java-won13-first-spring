package ro.fasttrackit.firstSpring.person;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class PersonInfo {

    @Value("${person.info.name}")
    private String name;

    @Value("${person.info.age}")
    private int age;

    public PersonInfo() {
        this.name = "Gyuri";
        this.age = 30;
    }
}
