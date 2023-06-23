
package examen2p2_carlos_espinal;

public class Pantalla extends Parte{
    private boolean Tactil;

    public Pantalla() {
        super();
    }

    public Pantalla(boolean Tactil, int TEnsamblaje) {
        super(TEnsamblaje);
        this.Tactil = Tactil;
    }

    public boolean isTactil() {
        return Tactil;
    }

    public void setTactil(boolean Tactil) {
        this.Tactil = Tactil;
    }

    public int getTEnsamblaje() {
        return TEnsamblaje;
    }

    public void setTEnsamblaje(int TEnsamblaje) {
        this.TEnsamblaje = TEnsamblaje;
    }

    @Override
    public String toString() {
        if (Tactil) {
            return "Pantalla Tactil";
        } else{
            return "Pantalla no Tactil";
        }
        
    }
    
    
    
    
}
