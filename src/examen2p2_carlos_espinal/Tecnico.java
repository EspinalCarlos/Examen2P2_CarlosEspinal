
package examen2p2_carlos_espinal;

import java.io.Serializable;


public class Tecnico implements Serializable{
    private String Nombre;
    private int Edad;
    private String Genero;
    private int cantPCs = 0;

    public Tecnico() {
    }

    public Tecnico(String Nombre, int Edad, String Genero)  {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Genero = Genero;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public int getCantPCs() {
        return cantPCs;
    }

    public void setCantPCs(int cantPCs) {
        this.cantPCs = cantPCs;
    }

    @Override
    public String toString() {
        return Nombre;
    }
    
    
}
