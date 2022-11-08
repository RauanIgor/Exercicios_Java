
package EquipamentoEletronico;

public class Lampadas extends EquipamentoEletrico {
    private int lumens;

    public Lampadas(int lumens, int potencia, int tempo) {
        super(potencia, tempo);
        this.lumens = lumens;
    }

    public int getLumens() {
        return lumens;
    }
@Override
    public double caulcularGasto(){
        
    double gastoMes = (getPotencia() * getTempo() * 30)/1000;
    double gastoReais = gastoMes * 0.48;
    System.out.printf("O custo para mater as lampadas é de: R$%.2f ao mês\n",gastoReais);
    return gastoReais;
    
    
        }    
}
