package com.noxus.draven.neo4js;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

/**
 * 〈功能概述〉<br>
 *
 * @className: Neo4jsApplication
 * @package: com.noxus.draven.neo4js
 * @author: draven
 * @date: 2020/12/1 14:48
 */
@SpringBootApplication
@EnableNeo4jRepositories("com.noxus.draven.neo4js.repository")
@EntityScan(basePackages = "com.noxus.draven.neo4js.entity")
public class Neo4jsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Neo4jsApplication.class, args);
    }
}
