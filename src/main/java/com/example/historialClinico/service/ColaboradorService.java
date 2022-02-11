package com.example.historialClinico.service;

import com.example.historialClinico.model.Colaborador;
import java.util.List;

public interface ColaboradorService {

    List<Colaborador> listar();

    Colaborador listarId(int id);

    Colaborador add(Colaborador c);

    Colaborador edit(Colaborador c);

    Colaborador delete(int id);

}
