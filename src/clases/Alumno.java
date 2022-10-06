/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author Marcela Najera
 */
public class Alumno extends Persona{
    private int carnet;
    private double cum;
    private String escuela;
    private String carrera;
    private ArrayList<String> hobbies;

    public Alumno(int carnet, double cum, String escuela, String carrera, ArrayList<String> hobbies, String nombre, String telefono, String genero) {
        super(nombre, telefono, genero);
        this.carnet = carnet;
        this.cum = cum;
        this.escuela = escuela;
        this.carrera = carrera;
        this.hobbies = hobbies;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public double getCum() {
        return cum;
    }

    public void setCum(double cum) {
        this.cum = cum;
    }

    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(ArrayList<String> hobbies) {
        this.hobbies = hobbies;
    }

    

    
}
