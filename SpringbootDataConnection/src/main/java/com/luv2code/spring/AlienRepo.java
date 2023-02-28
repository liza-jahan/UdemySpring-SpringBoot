package com.luv2code.spring;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.spring.model.Alien;

public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
                                            