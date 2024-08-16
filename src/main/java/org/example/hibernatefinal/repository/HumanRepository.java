package org.example.hibernatefinal.repository;

import org.example.hibernatefinal.entity.House;
import org.example.hibernatefinal.entity.Human;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepository extends CrudRepository <Human, Integer> {

}



