package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Modelo de Actividad
 */
@Document(value = "Actividad")
@Data
public class Actividad {
    /**
     * El indicador que permite encontar Actividad dentro de la base de datos
     */
    @Id
    Long id;
    String titulo;
    Integer importancia; //3 grados de importancia
    Integer cargaTrabajo; //3 grados de carga
    String fechaLimite; //Una fecha validada en la interfaz(datepicker)
    String descripcion;
}
