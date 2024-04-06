/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 1059236799
 */
public class Atleta {
    private String Nombre;
    private String Nacionalidad;
    private int tiempo;
    

    public Atleta() {
    }

    public Atleta(String Nombre, String Nacionalidad, int tiempo) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public int getTiempo() {
        return tiempo;
    }

    
    }

