package com.example.demo.space;

import org.springframework.cloud.gcp.data.datastore.repository.DatastoreRepository;
import org.springframework.cloud.gcp.data.datastore.repository.query.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface SpaceShipRepository extends DatastoreRepository<SpaceShip, Long> {

    @Query("select * from |com.example.demo.space.SpaceShip| where model = @model")
    List<SpaceShip> findByModel(@Param("model") String model);

    @Query("select * from |com.example.demo.space.SpaceShip| where captain = @captain")
    List<SpaceShip> findByCaptain(String captain);

    List<SpaceShip> findByFuelGreaterThan(Integer fuel);
}
