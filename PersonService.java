package br.edu.infnet.rds.rdsmysqldb.service;

import br.edu.infnet.rds.rdsmysqldb.model.Person;
import br.edu.infnet.rds.rdsmysqldb.repository.PersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService implements IPersonService {

    @Autowired
    private PersonRepository repository;

    @Override
    public List<Person> findAll() {

        return (List<Person>) repository.findAll();
    }
    
    // acrescentar save e delete
}
