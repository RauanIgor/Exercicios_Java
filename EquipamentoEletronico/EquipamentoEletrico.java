
package EquipamentoEletronico;

public class EquipamentoEletrico {
    private int potencia;
    private int tempo;

    public EquipamentoEletrico(int potencia, int tempo) {
        this.potencia = potencia;
        this.tempo = tempo;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getTempo() {
        return tempo;
    }
    public double caulcularGasto(){
        
        double gastoMes = (potencia * tempo * 30)/1000;
        double gastoReais = gastoMes * 0.48;
        System.out.printf("O custo para mater o equipamento é de: R$%.2f ao mês\n",gastoReais);
        return gastoReais;
    }
    public static void main(String[] args) {
        Lampadas l = new Lampadas(50, 80, 20);
        l.caulcularGasto();
        ArCondicionado a = new ArCondicionado(500, 14, 15);
        a.caulcularGasto();
        Televisao t = new Televisao(100, 20);
        t.caulcularGasto();
        Geladeira g = new Geladeira(true, 250, 24);
        g.caulcularGasto();
    }
}
