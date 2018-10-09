package com.backpackaviation.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.backpackaviation.roles.Pilot;

public interface PilotRepository extends CrudRepository<Pilot, Integer> {

}
