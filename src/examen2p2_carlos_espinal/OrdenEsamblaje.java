
package examen2p2_carlos_espinal;

import java.io.Serializable;


public class OrdenEsamblaje implements Serializable{
    private Tecnico tecnico;
    private Computadora pc;

    public OrdenEsamblaje() {
    }

    public OrdenEsamblaje(Tecnico tecnico, Computadora pc) {
        this.tecnico = tecnico;
        this.pc = pc;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Computadora getPc() {
        return pc;
    }

    public void setPc(Computadora pc) {
        this.pc = pc;
    }

    @Override
    public String toString() {
        return "OrdenEsamblaje{" + "tecnico=" + tecnico + ", pc=" + pc + '}';
    }
    
    
    
}
