package com.WSI08I.semTaskWSI08I.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.WSI08I.semTaskWSI08I.entity.games;
import com.WSI08I.semTaskWSI08I.repository.gamesRepository;

@Service
public class gamesService {
	
	@Autowired
    private gamesRepository gamesRepository;

    public List<games> findAll() {
        return (List<games>) gamesRepository.findAll();
    }

    public games findById(Integer id) {
        return gamesRepository.findById(id).get();
    }

    public void save(games g) {
    	gamesRepository.save(g);
    }

    public void delete(games g) {
    	gamesRepository.delete(g);
    }

}
