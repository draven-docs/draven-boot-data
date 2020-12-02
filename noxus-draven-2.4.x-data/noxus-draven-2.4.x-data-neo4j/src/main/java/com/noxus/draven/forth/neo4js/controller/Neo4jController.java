package com.noxus.draven.forth.neo4js.controller;

import com.noxus.draven.forth.neo4js.entity.Person;
import com.noxus.draven.forth.neo4js.service.PersionService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 〈功能概述〉<br>
 *
 * @className: Neo4jController
 * @package: com.noxus.draven.neo4js.controller
 * @author: draven
 * @date: 2020/12/1 16:29
 */
@RequestMapping("/neo4j")
@RestController
public class Neo4jController {

    private final PersionService persionServiceImpl;

    public Neo4jController(PersionService persionServiceImpl) {

        this.persionServiceImpl = persionServiceImpl;
    }

    @RequestMapping("findByLastname")
    public List<Person> findByLastname(String lastname) {
        List<Person> byLastname = persionServiceImpl.findByLastname(lastname);
        return byLastname;
    }
}
