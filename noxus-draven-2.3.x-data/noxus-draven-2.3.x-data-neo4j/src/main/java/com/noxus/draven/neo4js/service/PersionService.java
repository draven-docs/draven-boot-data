package com.noxus.draven.neo4js.service;

import com.noxus.draven.neo4js.entity.Person;

import java.util.List;

public interface PersionService {
    List<Person> findByLastname(String lastname);
}
