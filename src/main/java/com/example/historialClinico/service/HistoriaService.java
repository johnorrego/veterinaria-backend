package com.example.historialClinico.service;

import com.example.historialClinico.model.Historia;
import java.util.List;

public interface HistoriaService {

    List<Historia> listar();

    Historia listarId(int id);

    Historia add(Historia u);

    Historia edit(Historia u);

    Historia delete(int id);

}
