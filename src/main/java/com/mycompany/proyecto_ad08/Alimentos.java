package com.mycompany.proyecto_ad08;

import javax.persistence.Entity;
import javax.persistence.Id;

/*En esta clase creamos los metodos de la BBDD BDObject donde incluimos los platos(en codigo alimentos)*/

@Entity //Anotación que indica que esta es una clase que debe almacenarse en la base de datos
class Alimentos {

    @Id //Anotación que indica que este atributo es la clave primaria 
    private String nombre;
    private int calorias;

    //Constructor
    public Alimentos(String nombre, int calorias) {
        this.calorias = calorias;
        this.nombre = nombre;
        
    }

    //métodos básicos para asignar y obtener valores de atributos
    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

     @Override
    //comportamiento del método toString heredado de la superclase Objet
    //Devuelve los atributos de un objeto Ponente
    public String toString() {
        return this.nombre;
    }
}