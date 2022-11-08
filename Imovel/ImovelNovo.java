
package Imovel;

public class ImovelNovo extends Imovel{
    private double taxa;

    public ImovelNovo(double taxa, String endereco, double valor) {
        super(endereco, valor);
        this.taxa = taxa;
    }

    @Override
    public double CalcularValor() {
        double gasto = ((100+ taxa)/100)*valor;
        System.out.printf("O imovel novo custa: R$ %.2f \n" , gasto);
        return gasto;
}       
}