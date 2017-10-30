package pl.com.tokarzewski.springbootvelocity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.com.tokarzewski.springbootvelocity.dto.Person;

@Controller
public class HomeController {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    public String home() {
        return "index";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{name}")
    public String custom(@PathVariable(value = "name") String name) {
        return name;
    }

    @RequestMapping(method = RequestMethod.POST, value = "/person")
    public String person(@RequestBody Person person, Model model) {
        model.addAttribute(person);
        return "person";
    }
}
