package com.WSI08I.semTaskWSI08I.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import com.WSI08I.semTaskWSI08I.entity.games;
import org.springframework.stereotype.Repository;

@Repository
public interface gamesRepository extends JpaRepository<games, Integer>{

}
