package com.example.historialClinico.service;

import com.example.historialClinico.model.Mascota;
import java.util.List;

public interface MascotaService {

    List<Mascota> listar();

    Mascota listarId(int id);

    Mascota add(Mascota m);

    Mascota edit(Mascota m);

    Mascota delete(int id);

}
