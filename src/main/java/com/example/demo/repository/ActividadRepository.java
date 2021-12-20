package com.example.demo.repository;


import com.example.demo.model.Actividad;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ActividadRepository extends MongoRepository<Actividad,Integer> {

}
