package grupa4.michal;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private List<Person> people;


    @PostConstruct
    public void init() {
        people = new ArrayList<>();
        people.add(new Person("Jan", "Kowalski"));
        people.add(new Person("Anna", "Nowak"));
    }


    public List<Person> getPeople() {
        return people;
    }


    public Person getPerson(int index) {
        return people.get(index);
    }


    public void addPerson(Person person) {
        people.add(person);
    }


    public void setPerson(int index, Person person) {
        people.set(index, person);
    }


    public void removePerson(int index) {
        people.remove(index);
    }
}
