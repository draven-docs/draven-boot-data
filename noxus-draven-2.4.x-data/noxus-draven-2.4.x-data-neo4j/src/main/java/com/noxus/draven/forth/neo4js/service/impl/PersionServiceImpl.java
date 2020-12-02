package com.noxus.draven.forth.neo4js.service.impl;

import com.noxus.draven.forth.neo4js.entity.Person;
import com.noxus.draven.forth.neo4js.repository.PersonRepository;
import com.noxus.draven.forth.neo4js.service.PersionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈功能概述〉<br>
 *
 * @className: PersionServiceImpl
 * @package: com.noxus.draven.neo4js.service.impl
 * @author: draven
 * @date: 2020/12/1 16:24
 */
@Service
public class PersionServiceImpl implements PersionService {

    private final PersonRepository personRepository;

    public PersionServiceImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    @Override
    public List<Person> findByLastname(String lastname) {
        //lastname = "";
        List<Person> personList = personRepository.findByLastname(lastname);
        return personList;
    }
}
