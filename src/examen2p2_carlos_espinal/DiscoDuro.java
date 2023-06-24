
package examen2p2_carlos_espinal;

import java.io.Serializable;

/**
 *
 * @author cespi
 */
public class DiscoDuro extends Parte implements Serializable{
    private int Size;
    private String Marca;

    public DiscoDuro() {
        super();
    }

    public DiscoDuro(int Size, String Marca, int TEnsamblaje) {
        super(TEnsamblaje);
        this.Size = Size;
        this.Marca = Marca;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int Size) {
        this.Size = Size;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    @Override
    public int getTEnsamblaje() {
        return TEnsamblaje;
    }

    @Override
    public void setTEnsamblaje(int TEnsamblaje) {
        this.TEnsamblaje = TEnsamblaje;
    }

    @Override
    public String toString() {
        return "DiscoDuro=" + "Marca: " + Marca;
    }
    
    
    
    
    
}
