package com.auspiciadores.asuspiciadores.serviciorest;

import com.auspiciadores.asuspiciadores.entidades.Auspiciador;
import com.auspiciadores.asuspiciadores.servicio.ServicioAuspiciador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class RestAuspiciador {
    @Autowired
    private ServicioAuspiciador servicioAuspiciador;

    @GetMapping("/obtener")
    public List<Auspiciador> obtenerAuspiciadores(){
        return servicioAuspiciador.obtenerAuspiciadores();
    }

    @PostMapping("/registrar")
    public Auspiciador registrarAuspiciador(@RequestBody Auspiciador auspiciador) throws Exception{
        return servicioAuspiciador.registrarAuspiciador(auspiciador);
    }
}
