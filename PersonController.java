package br.edu.infnet.rds.rdsmysqldb.controller;

import br.edu.infnet.rds.rdsmysqldb.model.Person;
import br.edu.infnet.rds.rdsmysqldb.service.IPersonService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PersonController {
    
    @Autowired
    private IPersonService personService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }
    
    
    @GetMapping("/persons")
    public String findPersons(Model model) {

        var persons = (List<Person>) personService.findAll();

        model.addAttribute("persons", persons);

        return "showPersons";
    }
}
