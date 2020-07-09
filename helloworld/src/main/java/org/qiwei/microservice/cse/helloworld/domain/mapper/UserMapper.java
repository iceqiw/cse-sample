package org.qiwei.microservice.cse.helloworld.domain.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.qiwei.microservice.cse.helloworld.domain.entity.User;


@Mapper
public interface UserMapper {

    User findByName(String name);

    void insert(String name,int age);
}
