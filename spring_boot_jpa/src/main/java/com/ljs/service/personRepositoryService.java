package com.ljs.service;

import com.ljs.pojo.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface personRepositoryService extends JpaRepository<Person,Integer> {

}
