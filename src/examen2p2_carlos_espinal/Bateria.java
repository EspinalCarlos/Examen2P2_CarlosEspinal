
package examen2p2_carlos_espinal;

import java.io.Serializable;


public class Bateria extends Parte implements Serializable{
    private int CHoras;
    private String Material;

    public Bateria() {
        super();
    }

    public Bateria(int CHoras, String Material, int TEnsamblaje) {
        super(TEnsamblaje);
        this.CHoras = CHoras;
        this.Material = Material;
    }

    public int getCHoras() {
        return CHoras;
    }

    public void setCHoras(int CHoras) {
        this.CHoras = CHoras;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    @Override
    public int getTEnsamblaje() {
        return TEnsamblaje;
    }

    @Override
    public void setTEnsamblaje(int TEnsamblaje) {
        this.TEnsamblaje = TEnsamblaje;
    }
    
    
    
    
    
}
