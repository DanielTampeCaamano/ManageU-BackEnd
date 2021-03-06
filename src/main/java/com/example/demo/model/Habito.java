package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

/**
 * Modelo de Habito
 */
@Document(value = "Habito")
@Data
public class Habito {
    /**
     * El indicador que permite encontrar Habito dentro de la base de datos
     */
    @Id
    Long id;
    String titulo;
    String periodicidad; //Sera un texto que te entregue "mm/hh/dd/MM/aa" con la cantidad del salto de tiempo
    @JsonFormat(pattern = "yyyy/MM/dd")
    LocalDate ultimoCumplimiento;//La ultima vez que se cumplio, fecha generada automatica por click o por paso de proximoCumplimiento
    @JsonFormat(pattern = "yyyy/MM/dd")
    LocalDate proximoCumplimiento;//Se calcula haciendo el salto desde el ultimoCumplimiento + periodicidad
    Integer cumplido; // Numero de veces que se marco cumplido, inicia en 0
    Integer noCumplido; //Numero de veces que no se marco y finalizo el periodo, inicia en 0

}
