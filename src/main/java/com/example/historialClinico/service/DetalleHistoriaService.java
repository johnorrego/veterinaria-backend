package com.example.historialClinico.service;

import com.example.historialClinico.model.DetalleHistoria;
import java.util.List;

public interface DetalleHistoriaService {

    List<DetalleHistoria> listar();

    DetalleHistoria listarId(int id);

    DetalleHistoria add(DetalleHistoria u);

    DetalleHistoria edit(DetalleHistoria u);

    DetalleHistoria delete(int id);
}
