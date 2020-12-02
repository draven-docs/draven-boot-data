package com.noxus.draven.forth.neo4js;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories("com.noxus.draven.forth.neo4js.repository")
@EntityScan(basePackages = "com.noxus.draven.forth.neo4js.entity")
public class Neo4j4sApplication {

    public static void main(String[] args) {
        SpringApplication.run(Neo4j4sApplication.class, args);
    }
}
