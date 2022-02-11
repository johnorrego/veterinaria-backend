package com.example.historialClinico.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "mascota")
@Getter
@Setter
@ToString
public class Mascota {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mascota_id_seq")
    @SequenceGenerator(name = "mascota_id_seq",
            sequenceName = "mascota_id_seq",
            allocationSize = 1)

    private int idmascota;
    @Column
    private String nombremascota;
    @Column
    private String raza;
    @Column
    private int usuario_id;
    @Column
    private char sexomascota;

}
