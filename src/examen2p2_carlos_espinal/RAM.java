
package examen2p2_carlos_espinal;

/**
 *
 * @author cespi
 */
public class RAM extends Parte{

    private String Size;
    private String Marca;

    public RAM() {
        super();
        
    }

    public RAM(String Size, String Marca, int TEnsamblaje) {
        super(TEnsamblaje);
        this.Size = Size;
        this.Marca = Marca;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String Size) {
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
        return "RAM: " + "Marca:"+Marca;
    }

    
    
    
    
    
    
}
