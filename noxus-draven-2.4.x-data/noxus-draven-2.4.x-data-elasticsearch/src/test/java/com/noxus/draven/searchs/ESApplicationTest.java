package com.noxus.draven.searchs;

import com.noxus.draven.searchs.es.pojo.Stu;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.mapping.IndexCoordinates;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.IndexQueryBuilder;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 〈功能概述〉<br>
 *
 * @className: ESApplicationTest
 * @package: com.noxus.draven.searchs
 * @author: draven
 * @date: 2020/11/23 18:44
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ESApplicationTest {


    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    //@Autowired
    //private ElasticsearchTemplate elasticsearchTemplate;

    @Before
    public void sty() {
        System.out.println("start");
    }

    @Test
    public void createIndexStu() {
        Stu stu = new Stu();
        stu.setAge(18);
        stu.setName("wahah");
        stu.setStuId(1l);
        IndexQuery iqb = new IndexQueryBuilder().withObject(stu).build();
        String[] indexNames = new String[]{"stu"};
        IndexCoordinates indexCoordinates = IndexCoordinates.of(indexNames);
        String index = elasticsearchRestTemplate.index(iqb, indexCoordinates);
        //String index = elasticsearchTemplate.index(iqb, indexCoordinates);
        System.out.println(index);

    }
}
