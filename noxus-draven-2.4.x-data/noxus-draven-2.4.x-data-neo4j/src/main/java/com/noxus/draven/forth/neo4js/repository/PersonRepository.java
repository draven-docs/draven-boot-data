package com.noxus.draven.forth.neo4js.repository;

import com.noxus.draven.forth.neo4js.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;
import java.util.stream.Stream;

//@Repository
public interface PersonRepository extends Neo4jRepository<Person, Long> {
    List<Person> findByLastname(String lastname);

    Page<Person> findByFirstname(String firstname, Pageable pageable);

    // Person findByShippingAddresses(Address address);

    Stream<Person> findAllBy();


    /*@Override
    <S extends Person> S save(S s);*/
}
