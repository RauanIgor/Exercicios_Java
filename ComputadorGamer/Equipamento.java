package ComputadorGamer;

import java.util.Date;

public abstract class Equipamento {
    private Date dataCompra;
    private boolean manutencao; 
    private boolean ativo; 
    private int patrimonio; 

    public Equipamento(Date dataCompra, int patrimonio) {
        this.dataCompra = dataCompra;
        this.patrimonio = patrimonio;
        manutencao = false; 
        ativo = true; 
    }
    
    public abstract void exibirDetalhes();
    
    public void exibirDados(){
        System.out.println("-------------------");
        System.out.println("| Patrimonio: "
                + patrimonio + ". Data Compra: "
                + dataCompra + ". Manutenção: "
                + ((manutencao) ? "SIM " : "NÃO"));
        System.out.println("-------------------");
        System.out.println("Detalhes");
        System.out.println("-------------------");
        exibirDetalhes();
        System.out.println("-------------------");
    }
    
    public void ativar(boolean ativo){
        this.ativo = ativo; 
    }
    
    public void colocarEmManutencao(){
        this.manutencao = manutencao; 
    }

    public Date getDataCompra() {
        return dataCompra;
    }

    public boolean isManutecao() {
        return manutencao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public int getPatrimonio() {
        return patrimonio;
    }
    
    
    
}
