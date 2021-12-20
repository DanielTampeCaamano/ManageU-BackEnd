package com.example.demo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "Actividad")
@Data
public class Actividad {
    @Id
    Long id;
    String titulo;
    Integer importancia; //3 grados de importancia
    Integer cargaTrabajo; //3 grados de carga
    String fechaLimite; //Una fecha validada en la interfaz(datepicker)
    String descripcion;
}
