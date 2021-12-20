package com.example.demo.service;


import com.example.demo.model.Actividad;
import com.example.demo.repository.ActividadRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Este es el servicio que envia al controlador los datos de Actividad
 */
@Service
@RequiredArgsConstructor
public class ActividadService {
    /**
     *Instanciacion de del repository de Actividad, que trabaja con los datos de MongoDB
     */
    private final ActividadRepository actividadRepository;

    /**
     *
     * @param actividad
     */
    public void save(Actividad actividad) {
        actividadRepository.save(actividad);
    }

    /**
     *
     * @return
     */
    public List<Actividad> findAll(){
        return actividadRepository.findAll();
    }

    /**
     *
     * @param id
     * @return
     */
    public Optional<Actividad> findById(Integer id) {
        return actividadRepository.findById(id);
    }

    /**
     *
     * @param id
     */
    public void deleteById(Integer id){
        actividadRepository.deleteById(id);
    }

}
