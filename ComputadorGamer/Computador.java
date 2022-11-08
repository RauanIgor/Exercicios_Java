package ComputadorGamer;

import java.util.Date;

public class Computador extends Equipamento {
    
    private int ram;
    private String processador; 

    public Computador(int ram, String processador, Date dataCompra, int patrimonio) {
        super(dataCompra, patrimonio);
        this.ram = ram;
        this.processador = processador;
    }

   

    @Override
    public void exibirDetalhes() {
        System.out.println("Memória RAM: " + ram + "gb");
        System.out.println("Processador: " + processador);
    }
    
}
