package com.example.historialClinico.service.imp;

import com.example.historialClinico.model.DetalleHistoria;
import com.example.historialClinico.service.DetalleHistoriaService;
import com.example.historialClinico.repository.DetalleHistoriaRepository;

import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DetalleHistoriaServiceImpl implements DetalleHistoriaService {

    @Autowired
    private DetalleHistoriaRepository repositorio;

    @Override
    public List<DetalleHistoria> listar() {
        List<DetalleHistoria> obj = (List<DetalleHistoria>) repositorio.findAll();
        log.info("{}", obj.toString());
        return obj;
    }

    @Override
    public DetalleHistoria listarId(int id) {
        Optional<DetalleHistoria> findById = repositorio.findById(id);
        if (findById.isPresent()) {
            return findById.get();
        }
        return null;
    }

    @Override
    public DetalleHistoria add(DetalleHistoria u) {
        return repositorio.save(u);
    }

    @Override
    public DetalleHistoria edit(DetalleHistoria u) {
        return repositorio.save(u);
    }

    @Override
    public DetalleHistoria delete(int id) {
        DetalleHistoria listarId = listarId(id);
        if (listarId == null) {
            return null;
        }
        repositorio.delete(listarId);
        return listarId;
    }
}
