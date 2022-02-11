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
import javax.persistence.Transient;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.Formula;

@Entity
@Table(name = "historia_clinica")
@Getter
@Setter
@ToString
public class Historia {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "historia_id_seq")
    @SequenceGenerator(name = "historia_id_seq",
            sequenceName = "historia_id_seq",
            allocationSize = 1)
    private int idhistoriaclinica;
    private int mascota_id;

    @Temporal(TemporalType.TIMESTAMP)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "America/Bogota")
    private Date fecha_creacion;

    @Formula("(select count(dhc.peso) from detalle_historia_clinica dhc where dhc.historia_clinica_id = idhistoriaclinica)")
    private int cantidaddetalles;

}
