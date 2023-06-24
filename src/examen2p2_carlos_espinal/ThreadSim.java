
package examen2p2_carlos_espinal;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;


public class ThreadSim extends Thread{
    private JProgressBar jpb;
    private int segundos;
    private Tecnico asig;
    
    public ThreadSim(JProgressBar jpb, int segundos) {
        this.jpb = jpb;
        this.segundos = segundos;
    }

    public JProgressBar getJpb() {
        return jpb;
    }

    public void setJpb(JProgressBar jpb) {
        this.jpb = jpb;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public Tecnico getAsig() {
        return asig;
    }

    public void setAsig(Tecnico asig) {
        this.asig = asig;
    }
    
    
    @Override
    public void run(){
        int cont = 0;
        jpb.setMaximum(segundos*1000);
        while (cont != segundos*1000) {            
            jpb.setValue(jpb.getValue()+1);
            cont++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadSim.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        asig.setCantPCs(asig.getCantPCs()+1);
        JOptionPane.showMessageDialog(null, "Se ha completado la construccion!");
        
        
        
    }
    
    
}
