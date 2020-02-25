package com.hackathongestamp2020.Backend;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface VentasRepository extends MongoRepository<Ventas, String> {
/*
    @Query("{'ventas.region': ?0}")
    public List<Ventas> findByregion(String region);

    public List<Ventas> findBycountry(String country);

 */
}
