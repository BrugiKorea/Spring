package grupa4.michal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping("/people")
    public String getPeople(Model model) {
        model.addAttribute("people", personService.getPeople());
        return "people";
    }

    @GetMapping("/people/{id}")
    public String getPerson(@PathVariable int id, Model model) {
        model.addAttribute("person", personService.getPerson(id));
        model.addAttribute("id", id);
        return "person";
    }

    @GetMapping("/people/add")
    public String showAddForm(Model model) {
        model.addAttribute("person", new Person("", ""));
        return "add-person";
    }

    @PostMapping("/people")
    public String addPerson(Person person) {
        personService.addPerson(person);
        return "redirect:/people";
    }



}
