
package examen2p2_carlos_espinal;


public class Procesador extends Parte{
    private int NumNucleos;
    private String Velocidad;

    public Procesador() {
        super();
    }

    public Procesador(int NumNucleos, String Velocidad, int TEnsamblaje) {
        super(TEnsamblaje);
        this.NumNucleos = NumNucleos;
        this.Velocidad = Velocidad;
    }

    public int getNumNucleos() {
        return NumNucleos;
    }

    public void setNumNucleos(int NumNucleos) {
        this.NumNucleos = NumNucleos;
    }

    public String getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(String Velocidad) {
        this.Velocidad = Velocidad;
    }

    public int getTEnsamblaje() {
        return TEnsamblaje;
    }

    public void setTEnsamblaje(int TEnsamblaje) {
        this.TEnsamblaje = TEnsamblaje;
    }

    @Override
    public String toString() {
        return "Procesador=" + "NumNucleos: " + NumNucleos;
    }
    
    
    
    
}
