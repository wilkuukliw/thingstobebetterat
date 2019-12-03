package com.annamaria.thingstobebetteat;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

/**
 *
 * @author anna maria
 */

@Repository
public interface ThingRepository extends CrudRepository<Thing, Integer> {
  ArrayList<Thing> findAll();
}
