package com.example.historialClinico.service.imp;

import com.example.historialClinico.model.Historia;
import com.example.historialClinico.service.HistoriaService;
import com.example.historialClinico.repository.HistoriaRepository;

import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class HistoriaServiceImpl implements HistoriaService {
    
    @Autowired
    private HistoriaRepository repositorio;
    
    @Override
    public List<Historia> listar() {
        List<Historia> obj = (List<Historia>) repositorio.findAll();
        log.info("{}", obj.toString());
        return obj;
    }
    
    @Override
    public Historia listarId(int id) {
        Optional<Historia> findById = repositorio.findById(id);
        if (findById.isPresent()) {
            return findById.get();
        }
        return null;
    }
    
    @Override
    public Historia add(Historia u) {
        return repositorio.save(u);
    }
    
    @Override
    public Historia edit(Historia u) {
        return repositorio.save(u);
    }
    
    @Override
    public Historia delete(int id) {
        Historia listarId = listarId(id);
        if (listarId == null) {
            return null;
        }
        repositorio.delete(listarId);
        return listarId;
    }
    
}
