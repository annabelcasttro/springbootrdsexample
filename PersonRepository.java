package br.edu.infnet.rds.rdsmysqldb.repository;

import br.edu.infnet.rds.rdsmysqldb.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}
