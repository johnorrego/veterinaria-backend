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
@Table(name = "colaborador")
@Getter
@Setter
@ToString
public class Colaborador {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "colaborador_id_seq")
    @SequenceGenerator(name = "colaborador_id_seq",
            sequenceName = "colaborador_id_seq",
            allocationSize = 1)

    private int idcolaborador;
    @Column
    private String nombrecolaborador;
    @Column
    private String apellidocolaborador;
    @Column
    private String cargo;
    @Column
    private String especialidad;
    @Column
    private String tipo_documento;
    @Column
    private int documento_identificacion;

}
