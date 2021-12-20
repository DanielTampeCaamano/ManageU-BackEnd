package com.example.demo.service;


import com.example.demo.model.Habito;
import com.example.demo.repository.HabitoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HabitoService {
    private final HabitoRepository habitoRepository;

    public void save(Habito habito){
        habitoRepository.save(habito);
    }

    public List<Habito> findAll(){
        return habitoRepository.findAll();
    }

    public Optional<Habito> findById(Integer id) {
        return habitoRepository.findById(id);
    }

    public void deleteById(Integer id){
        habitoRepository.deleteById(id);
    }

}
