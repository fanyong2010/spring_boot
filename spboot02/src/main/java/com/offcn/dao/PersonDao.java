package com.offcn.dao;

import com.offcn.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

// 第一个泛型：是要操作的pojo的类
// 第二泛型：该pojo类id主键的类型
public interface PersonDao extends JpaRepository<Person, Integer> {


}