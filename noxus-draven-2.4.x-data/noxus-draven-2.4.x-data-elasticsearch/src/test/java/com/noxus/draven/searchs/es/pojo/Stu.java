package com.noxus.draven.searchs.es.pojo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

/**
 * 〈功能概述〉<br>
 *
 * @className: Stu
 * @package: com.noxus.draven.searchs.es.pojo
 * @author: draven
 * @date: 2020/11/23 18:53
 */

@Setter
@Getter
@Document(indexName = "stu")
public class Stu {

    @Id
    private Long stuId;

    @Field(store = true)
    private String name;

    @Field(store = true)
    public Integer age;
}
