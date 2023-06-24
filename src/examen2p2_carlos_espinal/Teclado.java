
package examen2p2_carlos_espinal;

import java.awt.Color;
import java.io.Serializable;

public class Teclado extends Parte implements Serializable{
    private String material;
    private Color col;

    public Teclado() {
        super();
    }

    public Teclado(String material, Color col, int TEnsamblaje) {
        super(TEnsamblaje);
        this.material = material;
        this.col = col;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Color getCol() {
        return col;
    }

    public void setCol(Color col) {
        this.col = col;
    }

    public int getTEnsamblaje() {
        return TEnsamblaje;
    }

    public void setTEnsamblaje(int TEnsamblaje) {
        this.TEnsamblaje = TEnsamblaje;
    }

    @Override
    public String toString() {
        return "Teclado=" + "Material: " + material;
    }
    
    
    
    
    
    
}
