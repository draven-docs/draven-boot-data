package com.noxus.draven.cassandras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 〈功能概述〉<br>
 *
 * @className: Neo4jsTestApplication
 * @package: com.noxus.draven.neo4js
 * @author: draven
 * @date: 2020/12/1 16:47
 */
@SpringBootApplication
public class CassandraApplication {
    public static void main(String[] args) {
        SpringApplication.run(CassandraApplication.class, args);
    }
}
