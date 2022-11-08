
package Pagamento;

public class Crediario extends Pagamento{
    private double juros;

    public Crediario(double valor, double juros) {
        super(valor);
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    @Override
    public double calcularPagamento() {
        return super.calcularPagamento()*(1 + juros/100);
    }
    
    
    
}
