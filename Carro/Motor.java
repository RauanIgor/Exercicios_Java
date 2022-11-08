package Carro;

public class Motor {

    private double potencia;

    public Motor(double potencia) {
        this.potencia = potencia;
    }

    public double getPotencia() {
        return potencia;
    }
    
    public boolean ligar(){
        return true;
    }
    public boolean desligar(){
        return false;
    }
    
}
    

