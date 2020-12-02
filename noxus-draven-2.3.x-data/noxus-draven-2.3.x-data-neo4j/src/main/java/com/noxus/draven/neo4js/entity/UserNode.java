package com.noxus.draven.neo4js.entity;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;

/**
 * 〈功能概述〉<br>
 *
 * @className: User
 * @package: com.noxus.draven.neo4js.entity
 * @author: draven
 * @date: 2020/12/1 16:10
 */
@NodeEntity(label = "User")
public class UserNode {

    //@GraphId
    private Long nodeId;
    @Property
    private String userId;
    @Property
    private String name;
    @Property
    private String age;

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
