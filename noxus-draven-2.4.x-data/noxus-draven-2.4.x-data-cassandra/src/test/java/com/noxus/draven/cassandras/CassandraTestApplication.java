package com.noxus.draven.cassandras;

import com.noxus.draven.cassandras.entity.Person;
import com.noxus.draven.cassandras.repositories.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
public class CassandraTestApplication {

    @Autowired
    PersonRepository personRepository;

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


    @Test
    public void readsPersonTableCorrectly() {
        Iterable<Person> all = personRepository.findAll();
        all.forEach((Person p) -> {
            log.info("{}", p);
        });
        //assertThat(persons.isEmpty()).isFalse();
    }


    /**
     * save方法测试
     */
    @Test
    public void saveAll() {
        String lastname = "Lokesh";
        Person person = new Person("1", "save1", "save1");
        Person save = personRepository.save(person);
        log.info("{}", save);
    }


    /*@Test
    public void readsPagesCorrectly() {

        Slice<Person> firstBatch = repository.findAll(CassandraPageRequest.first(10));

        //assertThat(firstBatch).hasSize(10);

        Page<Person> nextBatch = repository.findAll(firstBatch.nextPageable());

        // …
    }*/


    /**
     * 根据字段查询
     */
    @Test
    public void findByLastname() {
      /*  String lastname = "Lokesh";
        List<Person> personList = personRepository.findByLastname(lastname);
        personList.stream().forEach((Person s) -> {
            System.out.println(s);
            log.info("{}", s);
        });*/
    }

    /**
     * 查询全部
     */
    @Test
    public void findAll() {
        /*String lastname = "Lokesh";
        List<Person> personList = personRepository.findAll();
        personList.stream().forEach((Person s) -> {
            System.out.println(s);
            log.info("{}", s);
        });*/
    }


    /**
     * 不可用
     */
    @Test
    public void findOneByTitle() {
      /*  String title = "1";
        List<MovieEntity> oneByTitle = movieRepository.findOneByTitle(title);
        oneByTitle.stream().forEach((MovieEntity s) -> {
            System.out.println(s);
            log.info("{}", s);
        });*/

    }
}
