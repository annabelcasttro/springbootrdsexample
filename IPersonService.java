package br.edu.infnet.rds.rdsmysqldb.service;

import br.edu.infnet.rds.rdsmysqldb.model.Person;
import java.util.List;

public interface IPersonService {
    List<Person> findAll();
}
