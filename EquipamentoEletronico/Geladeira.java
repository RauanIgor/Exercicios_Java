
package EquipamentoEletronico;

public class Geladeira extends EquipamentoEletrico {
    private boolean refrigerador;

    public Geladeira(boolean refrigerador, int potencia, int tempo) {
        super(potencia, tempo);
        this.refrigerador = refrigerador;
    }

    public boolean isRefrigerador() {
        return refrigerador;
    }

    @Override
    public double caulcularGasto(){
        
    double gastoMes = (getPotencia() * getTempo() * 30)/1000;
    double gastoReais = gastoMes * 0.48;
    System.out.printf("O custo para mater a geladeira é de: R$%.2f ao mês\n",gastoReais);
    return gastoReais;
    
    
    }
}
