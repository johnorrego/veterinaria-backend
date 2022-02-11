package com.example.historialClinico.service.imp;

import com.example.historialClinico.model.Mascota;
import com.example.historialClinico.service.MascotaService;
import com.example.historialClinico.repository.MascotaRepository;

import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MascotaServiceImpl implements MascotaService {

    @Autowired
    private MascotaRepository repositorio;

    @Override
    public List<Mascota> listar() {
        List<Mascota> obj = (List<Mascota>) repositorio.findAll();
        return obj;
    }

    @Override
    public Mascota listarId(int id) {
        Optional<Mascota> findById = repositorio.findById(id);
        if (findById.isPresent()) {
            return findById.get();
        }
        return null;
    }

    @Override
    public Mascota add(Mascota m) {
        return repositorio.save(m);
    }

    @Override
    public Mascota edit(Mascota m) {
        return repositorio.save(m);
    }

    @Override
    public Mascota delete(int id) {
        Mascota listarId = listarId(id);
        if (listarId == null) {
            return null;
        }
        repositorio.delete(listarId);
        return listarId;
    }

}
