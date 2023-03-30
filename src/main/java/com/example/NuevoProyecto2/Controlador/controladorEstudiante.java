package com.example.NuevoProyecto2.Controlador;
import com.example.NuevoProyecto2.Estudiantes.Estudiante;
import org.springframework.web.bind.annotation.*;
import com.example.NuevoProyecto2.Servicios.servicioEstudiante;

import java.util.ArrayList;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class controladorEstudiante {

    servicioEstudiante servicio=new servicioEstudiante();

    @GetMapping("/listarEstudiantes")
    public ArrayList<Estudiante> listar(){servicio.nota_final(); return servicio.listar();}

    @DeleteMapping("/eliminarEstudiante")
    public ArrayList<Estudiante> eliminarEstudiante() {return servicio.eliminarEstudiante();}

    @PostMapping("/modificarEstudiante")
    public String modificarEstudiante(@RequestBody Estudiante estudiante){


        return servicio.ModificarMateria(estudiante);
    }


}
