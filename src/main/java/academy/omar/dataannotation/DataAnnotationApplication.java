package academy.omar.dataannotation;

import academy.omar.dataannotation.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DataAnnotationApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataAnnotationApplication.class, args);

        Person person = new Person();

        person.setFirstName("Omar");
        person.setLastName("Morales");
        person.setAge(23);
        person.setHeight(172);
        person.setWeight(64.4);

        System.out.println(person);
    }

}
