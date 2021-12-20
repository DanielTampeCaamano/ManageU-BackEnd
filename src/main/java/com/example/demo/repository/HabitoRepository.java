package com.example.demo.repository;

import com.example.demo.model.Habito;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Interfaz encargada de conectar modelo de Habito con MongoDB
 */
@Repository
public interface HabitoRepository extends MongoRepository<Habito,Integer> {

}
