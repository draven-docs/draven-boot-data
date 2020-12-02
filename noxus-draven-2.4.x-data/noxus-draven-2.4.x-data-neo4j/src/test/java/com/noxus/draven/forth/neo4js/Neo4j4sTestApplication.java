package com.noxus.draven.forth.neo4js;

import com.noxus.draven.forth.neo4js.entity.MovieEntity;
import com.noxus.draven.forth.neo4js.entity.Person;
import com.noxus.draven.forth.neo4js.repository.MovieRepository;
import com.noxus.draven.forth.neo4js.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
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
public class Neo4j4sTestApplication {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private MovieRepository movieRepository;

    @Before
    public void before() {
        log.info("{}", "开始测试");
    }


    @After
    public void afters() {
        log.info("{}", "结束测试");
    }

    @Test
    public void tests() {
        log.info("{}", "开始测试demo");
    }

    /**
     * 根据字段查询
     */
    @Test
    public void findByLastname() {
        String lastname = "Lokesh";
        List<Person> personList = personRepository.findByLastname(lastname);
        personList.stream().forEach((Person s) -> {
            System.out.println(s);
            log.info("{}", s);
        });
    }

    /**
     * 查询全部
     */
    @Test
    public void findAll() {
        String lastname = "Lokesh";
        List<Person> personList = personRepository.findAll();
        personList.stream().forEach((Person s) -> {
            System.out.println(s);
            log.info("{}", s);
        });
    }

    /**
     * save方法测试
     */
    @Test
    public void saveAll() {
        String lastname = "Lokesh";
        Person person = new Person(0L, "save1", "save1");
        Person person1 = new Person("saveNoId", "saveNoId");
        Person save = personRepository.save(person1);
        log.info("{}", save);
    }

    /**
     * 不可用
     */
    @Test
    public void findOneByTitle() {
        String title = "1";
        List<MovieEntity> oneByTitle = movieRepository.findOneByTitle(title);
        oneByTitle.stream().forEach((MovieEntity s) -> {
            System.out.println(s);
            log.info("{}", s);
        });

    }
}
