package com.offcn.service;

import com.offcn.entity.Person;

import java.util.List;

public interface PersonService {

    void add(Person person);

    void delete(Integer id);

    void update(Person person);

    Person get(Integer id);

    List<Person> getAll();

}
