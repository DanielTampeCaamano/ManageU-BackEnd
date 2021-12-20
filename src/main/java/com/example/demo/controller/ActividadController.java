package com.example.demo.controller;

import com.example.demo.model.Actividad;
import com.example.demo.service.ActividadService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Este es el controlador de Actividad, que es consumido por el frontend
 */
@RestController
@RequestMapping("/api/actividad")
@RequiredArgsConstructor
public class ActividadController {

    private final ActividadService actividadService;

    /**
     * El api guarda una Actividad enviada por el frontend para ser guardada en la base de datos
     * @param actividad esta es la entidad que la base de datos guarda
     */
    @PostMapping("/post")
    public void save(@RequestBody Actividad actividad) {
        actividadService.save(actividad);
    }

    /**
     * El api envia todas las actividades almacenadas
     * @return Envia una lista de Actividades para ser usada por el frontend
     */
    @GetMapping("/get")
    public List<Actividad> findAll(){
        return actividadService.findAll();
    }

    /**
     * El api envia una actividad en particular que se busca mediante el Id
     * @param id Es el indicador que permite buscar la actividad en cuestion
     * @return retorna la actividad en caso de que sea encontrada
     */
    @GetMapping("/get/{id}")
    public Actividad findById(@PathVariable Integer id){
        return actividadService.findById(id).get();
    }

    /**
     * El api elimina una actividad en particular que se busca mediante el Id
     * @param id Es el indicador que permite buscar la actividad en cuestion
     */
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Integer id){
        actividadService.deleteById(id);
    }

    /**
     * El api actualiza una actividad guardada en la base de datos con la informacion recibida
     * @param actividad Es la actividad que sera actualizada
     */
    @PutMapping("/update")
    public void update(@RequestBody Actividad actividad){
        actividadService.save(actividad);
    }
}
