
package Lampada;

public class Lampada {
    private int potencia;
    private boolean ligada;

    public Lampada(int potencia, boolean ligada) {
        this.potencia = potencia;
        this.ligada = ligada;
    }

    public int getPotencia() {
        return potencia;
    }

    public boolean isLigada() {
        return ligada;
    }
    
}
