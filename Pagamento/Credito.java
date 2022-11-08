
package Pagamento;

public class Credito extends Pagamento{
    private double taxa;

    public Credito(double valor, double taxa) {
        super(valor);
        this.taxa = taxa;
    }

    public double getTaxa() {
        return taxa;
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    @Override
    public double calcularPagamento() {
        return super.calcularPagamento()+ taxa;
    }
    
    
    }
    
    

