package com.noxus.draven.forth.neo4js.repository;

import com.noxus.draven.forth.neo4js.entity.MovieEntity;
import org.springframework.data.neo4j.repository.Neo4jRepository;

import java.util.List;

public interface MovieRepository extends Neo4jRepository<MovieEntity, String> {

    List<MovieEntity> findOneByTitle(String title);
}
