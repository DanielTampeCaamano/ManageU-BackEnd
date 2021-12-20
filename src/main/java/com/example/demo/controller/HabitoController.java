package com.example.demo.controller;

import com.example.demo.model.Habito;
import com.example.demo.service.HabitoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Este es el Controlador de Habito, que es consumido por el frontend
 */
@RestController
@RequestMapping("/api/habito")
@RequiredArgsConstructor
public class HabitoController {
    /**
     * Instanciacion de HabitoService, para llamar los metodos que conectan con Repository
     */
    private final HabitoService habitoService;

    /**
     * El api guarda un Habito enviado por el frontend
     * @param habito esta es la entidad que la base de datos guardara
     */
    @PostMapping("/post")
    public void save(@RequestBody Habito habito) {
        habitoService.save(habito);
    }

    /**
     * El api envia todas los habitos almacenados
     * @return Envia una lista de Habitos para ser usada por el frontend
     */
    @GetMapping("/get")
    public List<Habito> findAll(){
        return habitoService.findAll();
    }

    /**
     * El api envia un Habito en particular que se encuenta mediante el Id
     * @param id Es el indicador que permite buscar el habito en cuestion
     * @return retorna el habito en caso de que sea encontrado
     */
    @GetMapping("/get/{id}")
    public Habito findById(@PathVariable Integer id){
        return habitoService.findById(id).get();
    }

    /**
     * El api elimina un habito en particular que se busca mediante el Id
     * @param id Es el indicador que permite buscar la habito en cuestion
     */
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Integer id){
        habitoService.deleteById(id);
    }

    /**
     * El api actualiza un habito guardado en la base de datos con la informacion recibida
     * @param habito Es la actividad que sera actualizada
     */
    @PutMapping("/update")
    public void update(@RequestBody Habito habito){
        habitoService.save(habito);
    }
}
