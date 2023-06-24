
package examen2p2_carlos_espinal;

import java.awt.Color;
import java.io.Serializable;
import java.util.Date;

public class Computadora implements Serializable{
    private int NumSerie;
    private Date Year = new Date();
    private Color col;
    private String Material;
    private RAM ram;
    private Bateria bateria;
    private DiscoDuro discoduro;
    private Procesador procesador;
    private Teclado teclado;
    private Pantalla pantalla;

    public Computadora() {
    }

    public Computadora(int NumSerie, Date Year, Color col, String Material, RAM ram,DiscoDuro discoduro, Bateria bateria,Teclado teclado,Pantalla pantalla, Procesador procesador) {
        this.NumSerie = NumSerie;
        this.Year = Year;
        this.col = col;
        this.Material = Material;
        this.ram = ram;
        this.bateria = bateria;
        this.discoduro = discoduro;
        this.procesador = procesador;
        this.teclado = teclado;
        this.pantalla = pantalla;
    }

    public Computadora(int NumSerie, Color col, String Material) {
        this.NumSerie = NumSerie;
        this.col = col;
        this.Material = Material;
    }

    public int getNumSerie() {
        return NumSerie;
    }

    public void setNumSerie(int NumSerie) {
        this.NumSerie = NumSerie;
    }

    public Date getYear() {
        return Year;
    }

    public void setYear(Date Year) {
        this.Year = Year;
    }

    public Color getCol() {
        return col;
    }

    public void setCol(Color col) {
        this.col = col;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Bateria getBateria() {
        return bateria;
    }

    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }

    public DiscoDuro getDiscoduro() {
        return discoduro;
    }

    public void setDiscoduro(DiscoDuro discoduro) {
        this.discoduro = discoduro;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }
    
    public int getsegundostotales(){
        return getRam().getTEnsamblaje() + getBateria().getTEnsamblaje() + getDiscoduro().getTEnsamblaje() + getPantalla().getTEnsamblaje() + getTeclado().getTEnsamblaje() + getProcesador().TEnsamblaje;
    }

    @Override
    public String toString() {
        return "Computadora=" + "NumSerie: " +NumSerie;
    }
    
    
    
    
    
}
