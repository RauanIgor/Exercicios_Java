
package EquipamentoEletronico;

public class ArCondicionado extends EquipamentoEletrico{
    private double temperatura; 

    public ArCondicionado(int potencia, int tempo, double temperatura) {
        super(potencia, tempo);
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        System.out.println("a temperatura está em " +temperatura+ "graus");
        return temperatura;
    }

@Override
        public double caulcularGasto(){
        
        double gastoMes = (getPotencia() * getTempo() * 30)/1000;
        double gastoReais = gastoMes * 0.48;
        System.out.printf("O custo para mater o Ar-Condicionado é de: R$%.2f ao mês\n",gastoReais);
        return gastoReais;
    
    
        }    
}
