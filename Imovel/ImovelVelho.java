
package Imovel;
public class ImovelVelho extends Imovel{
    private double desconto;

    public ImovelVelho(double desconto, String endereco, double valor) {
        super(endereco, valor);
        this.desconto = desconto;
    }
    @Override
    public double CalcularValor() {
        double gasto = ((100 - desconto)/100)*valor;
        System.out.printf("O imovel velho custa: R$ %.2f \n" , gasto);
        return gasto;
}
}
