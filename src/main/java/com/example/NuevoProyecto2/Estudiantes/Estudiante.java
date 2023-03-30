package com.example.NuevoProyecto2.Estudiantes;

public class Estudiante {

    private int codigo;
    private String nombre;
    private String apellido;
    private String[] materias = new String[3];
    private float[] notas = new float[3];
    private String juicio;


    public Estudiante(int codigo, String nombre, String apellido, String[] materias, float[] notas, String juicio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materias = materias;
        this.notas = notas;
        this.juicio = juicio;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }

    public String getJuicio() {
        return juicio;
    }

    public void setJuicio(String juicio) {
        this.juicio = juicio;
    }
}