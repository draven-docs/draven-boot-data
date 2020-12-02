package com.noxus.draven.neo4js;

import com.noxus.draven.neo4js.entity.Person;
import com.noxus.draven.neo4js.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 〈功能概述〉<br>
 *
 * @className: Neo4jsTestApplication
 * @package: com.noxus.draven.neo4js
 * @author: draven
 * @date: 2020/12/1 16:47
 */
@SpringBootTest
@RunWith(SpringRunner.class)
@Slf4j
public class Neo4jsTestApplication {

    @Autowired
    private PersonRepository personRepository;


    @Before
    public void before() {
        log.info("{}", "开始测试");
    }

    @Test
    public void tests() {
        log.info("{}", "开始测试demo");
    }


    @Test
    public void findByLastname() {
        String lastname = "Lokesh";
        List<Person> personList = personRepository.findByLastname(lastname);
        personList.stream().forEach((Person s) -> {
            System.out.println(s);
            log.info("{}",s);
        });
    }
}
