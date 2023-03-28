package com.example.NuevoProyecto2.Servicios;
import com.example.NuevoProyecto2.Estudiantes.Estudiante;

import java.util.ArrayList;

public class servicioEstudiante {

    ArrayList<Estudiante> lista=new ArrayList<>();

    public servicioEstudiante(){
        lista.add(new Estudiante(1,"Julian","Ospina",new String[] {"matematicas", "Español", "ciencias"} ,new Float[] {2.5f,3.8f,4.9f}));
        lista.add(new Estudiante(2,"Julia","unibio",new String[] {"matematicas", "Español", "ciencias"} ,new Float[] {2.5f,3.8f,4.9f}));
        lista.add(new Estudiante(3,"Julio","Uribe",new String[] {"matematicas", "Español", "ciencias"} ,new Float[] {2.5f,3.8f,4.9f}));
        lista.add(new Estudiante(4,"Juan","Escobar",new String[] {"matematicas", "Español", "ciencias"} ,new Float[] {2.5f,3.8f,4.9f}));
        lista.add(new Estudiante(5,"Juana","Guzman",new String[] {"matematicas", "Español", "ciencias"} ,new Float[] {2.5f,3.8f,4.9f}));
    }

    public ArrayList<Estudiante> listar(){ return lista;}

    public String eliminarEstudiante(int codigo){
        String valor = "No se encontro el estudiante.";

        for (Estudiante mas:lista){
            if (mas.getCodigo()== codigo){
                lista.remove(mas);
                valor ="Estudiante eliminado con exito";
            }
        }

        return valor;
    }

}
