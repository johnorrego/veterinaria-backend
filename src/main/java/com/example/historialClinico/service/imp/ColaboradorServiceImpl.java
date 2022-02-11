package com.example.historialClinico.service.imp;

import com.example.historialClinico.model.Colaborador;
import com.example.historialClinico.service.ColaboradorService;
import com.example.historialClinico.repository.ColaboradorRepository;

import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ColaboradorServiceImpl implements ColaboradorService {

    @Autowired
    private ColaboradorRepository repositorio;

    @Override
    public List<Colaborador> listar() {
        List<Colaborador> obj = (List<Colaborador>) repositorio.findAll();
        return obj;
    }

    @Override
    public Colaborador listarId(int id) {
        Optional<Colaborador> findById = repositorio.findById(id);
        if (findById.isPresent()) {
            return findById.get();
        }
        return null;
    }

    @Override
    public Colaborador add(Colaborador c) {
        return repositorio.save(c);
    }

    @Override
    public Colaborador edit(Colaborador c) {
        return repositorio.save(c);
    }

    @Override
    public Colaborador delete(int id) {
        Colaborador listarId = listarId(id);
        if (listarId == null) {
            return null;
        }
        repositorio.delete(listarId);
        return listarId;
    }

}
