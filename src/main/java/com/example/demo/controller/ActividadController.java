package com.example.demo.controller;

import com.example.demo.model.Actividad;
import com.example.demo.service.ActividadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/actividad")
@RequiredArgsConstructor
public class ActividadController {

    private final ActividadService actividadService;

    @PostMapping("/post")
    public void save(@RequestBody Actividad actividad) {
        actividadService.save(actividad);
    }

    @GetMapping("/get")
    public List<Actividad> findAll(){
        return actividadService.findAll();
    }

    @GetMapping("/get/{id}")
    public Actividad findById(@PathVariable Integer id){
        return actividadService.findById(id).get();
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Integer id){
        actividadService.deleteById(id);
    }
}
