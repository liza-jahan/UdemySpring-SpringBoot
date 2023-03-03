package com.luv2code.spring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.spring.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

	 

	 List<Alien> findByAnameOrderByAidDesc(String aname);//Query DSL


	// List<Alien> findByAname(String aname);//Query DSL

	// List<Alien> findByAnameOrderByAname(String aname);//Query DSL

	

}
                                            