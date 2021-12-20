package com.example.demo.service;


import com.example.demo.model.Actividad;
import com.example.demo.repository.ActividadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ActividadService {
    private final ActividadRepository actividadRepository;

    public void save(Actividad actividad) {
        actividadRepository.save(actividad);
    }

    public List<Actividad> findAll(){
        return actividadRepository.findAll();
    }

    public Optional<Actividad> findById(Integer id) {
        return actividadRepository.findById(id);
    }

    public void deleteById(Integer id){
        actividadRepository.deleteById(id);
    }

}
