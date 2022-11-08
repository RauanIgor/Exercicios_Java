package ComputadorGamer;

import java.util.Date;

public class Roteador extends Equipamento {
    
    private String ip; 
    private int portas; 
    private double sinal; 

    public Roteador(String ip, int portas, double sinal, Date dataCompra, int patrimonio) {
        super(dataCompra, patrimonio);
        this.ip = ip;
        this.portas = portas;
        this.sinal = sinal;
    }

    

    @Override
    public void exibirDetalhes() {
        System.out.println("IP: " + ip);
        System.out.println("Portas: " + portas);
        System.out.println("Alcance do Sinal: " + sinal + "db");
    }
    
}
