package com.example.demo.repository;


import com.example.demo.model.Actividad;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Interfaz encargada de conectar modelo de Actividad con MongoDB
 */
@Repository
public interface ActividadRepository extends MongoRepository<Actividad,Integer> {

}
