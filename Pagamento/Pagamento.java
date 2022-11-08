
package Pagamento;

public class Pagamento {
    private double valor;

    public Pagamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double calcularPagamento(){
        return valor;
        
    }
    public static void main(String[] args) {
        Avista a = new Avista(400, 0.05);
        Credito a1 = new Credito(400, 0.05);
        Crediario a2 = new Crediario(400, 0.05);
        System.out.println(a.calcularPagamento());
        System.out.println(a1.calcularPagamento());
        System.out.println(a2.calcularPagamento());
    }
}
