package com.example.demo.controller;

import com.example.demo.model.Habito;
import com.example.demo.service.HabitoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/habito")
@RequiredArgsConstructor
public class HabitoController {

    private final HabitoService habitoService;

    @PostMapping("/post")
    public void save(@RequestBody Habito habito) {
        habitoService.save(habito);
    }

    @GetMapping("/get")
    public List<Habito> findAll(){
        return habitoService.findAll();
    }

    @GetMapping("/get/{id}")
    public Habito findById(@PathVariable Integer id){
        return habitoService.findById(id).get();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Integer id){
        habitoService.deleteById(id);
    }
}
