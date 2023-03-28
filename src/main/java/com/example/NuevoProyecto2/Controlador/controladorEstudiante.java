package com.example.NuevoProyecto2.Controlador;
import com.example.NuevoProyecto2.Estudiantes.Estudiante;
import org.springframework.web.bind.annotation.*;
import com.example.NuevoProyecto2.Servicios.servicioEstudiante;

import java.util.ArrayList;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController


public class controladorEstudiante {

    servicioEstudiante servicio=new servicioEstudiante();

    @GetMapping("/ListarEstudiantes")
    public ArrayList<Estudiante> listar() {return servicio.listar();}

    @DeleteMapping("eliminarCliente/{cod}")
    public String eliminarEstudiante(@PathVariable("cod") int codigo) {return servicio.eliminarEstudiante(codigo);}

}
