package com.noxus.draven.forth.neo4js.service;


import com.noxus.draven.forth.neo4js.entity.Person;

import java.util.List;

public interface PersionService {
    List<Person> findByLastname(String lastname);
}
