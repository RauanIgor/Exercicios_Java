
package Pagamento;

public class Avista extends Pagamento{
    private double desconto;

    public Avista(double valor, double desconto) {
        super(valor);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public double calcularPagamento() {
        return super.calcularPagamento()*(1 - desconto);
    }
    

        
    }
    
    
    


