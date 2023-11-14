package ro.fasttrackit.firstSpring.person;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private final PersonInfo info;
    private final Address address;

    public Person(PersonInfo info, Address address) {
        System.out.println("Building person");
        this.info = info;
        this.address = address;

        System.out.println("Received info " + info);
        System.out.println("Received address " + address);
    }
}
