package com.auspiciadores.asuspiciadores.servicio;

import com.auspiciadores.asuspiciadores.entidades.Auspiciador;
import com.auspiciadores.asuspiciadores.repositorio.RepositorioAuspiciador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioAuspiciador {
    @Autowired
    private RepositorioAuspiciador auspiciadorRepositorio;

    public Auspiciador registrarAuspiciador(Auspiciador auspiciador) throws Exception{
        Auspiciador a = null;
        a = auspiciador;
        if (a == null){
            throw new Exception("No se pudo registrar");
        }
        else {
            return auspiciadorRepositorio.save(a);
        }
    }

    public List<Auspiciador> obtenerAuspiciadores(){
        return auspiciadorRepositorio.findAll();
    }
}
