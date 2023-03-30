package com.example.NuevoProyecto2.Servicios;
import com.example.NuevoProyecto2.Estudiantes.Estudiante;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class servicioEstudiante {

    ArrayList<Estudiante> lista=new ArrayList<>();

    public servicioEstudiante(){
        lista.add(new Estudiante(1,"Julian","Ospina", new String[]{"Español, matematicas, ciencias"}, new float[]{1.5f, 3.0f, 1.5f},""));
        lista.add(new Estudiante(2,"Julia","unibio",new String[] {"matematicas", "Español", "ciencias"} ,new float[] {2.5f,3.8f,4.9f},""));
        lista.add(new Estudiante(3,"Julio","Uribe",new String[] {"matematicas", "Español", "ciencias"} ,new float[] {2.5f,3.8f,4.9f},""));
        lista.add(new Estudiante(4,"Juan","Escobar",new String[] {"matematicas", "Español", "ciencias"} ,new float[] {2.5f,3.8f,4.9f},""));
        lista.add(new Estudiante(5,"Juana","Guzman",new String[] {"matematicas", "Español", "ciencias"} ,new float[] {2.5f,3.8f,4.9f},""));
    }

    public ArrayList<Estudiante> listar(){
        return lista;
    }



    public ArrayList nota_final(){

        double nota = 0;
        double not_final = 0;


        for (int i = 0; i < lista.size(); i++){
            nota = lista.get(i).getNotas()[0]+lista.get(i).getNotas()[1]+lista.get(i).getNotas()[2];

            not_final=nota/3;

            if (not_final >= 3.0){

                lista.get(i).setJuicio("Aprobado");
                lista.set(i,lista.get(i));

            }else {
                lista.get(i).setJuicio("Reprobado");
            }
        }

        return lista;
    }

    public ArrayList<Estudiante> eliminarEstudiante(){
        for (int i = 0; i<lista.size(); i++){
            if (lista.get(i).getJuicio().equals("Reprobado")){
                lista.remove(lista.get(i));
            }
        }

        return lista;
    }



    public String ModificarMateria(Estudiante E){

        boolean resp = false;

        for (Estudiante Es : lista){

            if (Es.getCodigo() == E.getCodigo()){

                Es.setMaterias(E.getMaterias());

                resp = true;
            }
        }

        String respuesta = "";

        if(resp == true){
            respuesta = "Se han actualizado los datos";

        }else{
            respuesta = "No se han actualizado los datos";
        }

        return respuesta;
    }





    }





