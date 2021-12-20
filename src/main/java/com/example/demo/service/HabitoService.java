package com.example.demo.service;


import com.example.demo.model.Habito;
import com.example.demo.repository.HabitoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * Esta es el servicio que conecta los datos con el controlador de Habito
 */
@Service
@RequiredArgsConstructor
public class HabitoService {
    /**
     * Instanciacion del repository de Habito, que trabaja con los datos de MongoDB
     */
    private final HabitoRepository habitoRepository;

    /**
     *
     * @param habito
     */
    public void save(Habito habito){
        habitoRepository.save(habito);
    }

    /**
     *
     * @return
     */
    public List<Habito> findAll(){
        return habitoRepository.findAll();
    }

    /**
     *
     * @param id
     * @return
     */
    public Optional<Habito> findById(Integer id) {
        return habitoRepository.findById(id);
    }

    /**
     *
     * @param id
     */
    public void deleteById(Integer id){
        habitoRepository.deleteById(id);
    }

}
