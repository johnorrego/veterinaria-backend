package com.example.historialClinico.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "detalle_historia_clinica")
@Getter
@Setter
@ToString
public class DetalleHistoria {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "detalle_historia_id_seq")
    @SequenceGenerator(name = "detalle_historia_id_seq",
            sequenceName = "detalle_historia_id_seq",
            allocationSize = 1)

    private int iddetallehistoriaclinica;
    @Column
    private String temperatura;
    @Column
    private int peso;
    @Column
    private int frecuencia_cardiaca;
    @Column
    private int frecuencia_respiratoria;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "America/Bogota")
    private Date fecha_hora;

    @Column
    private String alimentacion;
    @Column
    private String habitad;
    @Column
    private String observacion;
    @Column
    private int colaborador_id;
    @Column
    private int historia_clinica_id;

}
