package com.noxus.draven.cassandras.repositories;

import com.noxus.draven.cassandras.entity.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * 〈功能概述〉<br>
 *
 * @className: CrudRepository
 * @package: com.noxus.draven.cassandras.repositories
 * @author: draven
 * @date: 2020/12/2 15:30
 */
public interface PersonRepository extends CrudRepository<Person, String> {

    // additional custom finder methods go here
}
