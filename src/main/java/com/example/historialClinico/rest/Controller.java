package com.example.historialClinico.rest;

import com.example.historialClinico.model.Colaborador;
import com.example.historialClinico.model.DetalleHistoria;
import com.example.historialClinico.model.Historia;
import com.example.historialClinico.model.Mascota;
import com.example.historialClinico.service.ColaboradorService;
import com.example.historialClinico.service.DetalleHistoriaService;
import com.example.historialClinico.service.HistoriaService;
import com.example.historialClinico.service.MascotaService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("controller")
public class Controller {

    @Autowired
    HistoriaService service;

    @Autowired
    MascotaService serviceMascota;

    @Autowired
    ColaboradorService serviceColaborador;

    @Autowired
    DetalleHistoriaService serviceDetalle;

    @GetMapping("historias")
    public List<Historia> listar() {
        return service.listar();
    }

    @DeleteMapping("historias/{id}")
    public Object delete(@PathVariable("id") int id) {
        Historia delete = service.delete(id);

        return delete;
    }

    @PostMapping("agregarHistoria")
    public Historia add(@RequestBody Historia u) {
        return service.add(u);
    }

    @PutMapping("historias/{id}")
    public Historia edit(@RequestBody Historia u, @PathVariable("id") int id) {
        if (u.getIdhistoriaclinica() == id) {
            return service.edit(u);
        }
        return null;
    }

    @GetMapping("mascotas")
    public List<Mascota> listarMascotas() {
        return serviceMascota.listar();
    }

    @GetMapping("colaboradores")
    public List<Colaborador> listarColaboradores() {
        return serviceColaborador.listar();
    }

    @PostMapping("detallehistoria")
    public DetalleHistoria addDetalle(@RequestBody DetalleHistoria u) {
        return serviceDetalle.add(u);
    }

    @GetMapping("detalles")
    public List<DetalleHistoria> listarDetalle() {
        DetalleHistoria u = new DetalleHistoria();
        return serviceDetalle.listar();
    }

    @DeleteMapping("detalles/{id}")
    public Object deleteDetalle(@PathVariable("id") int id) {
        DetalleHistoria delete = serviceDetalle.delete(id);

        return delete;
    }

}
