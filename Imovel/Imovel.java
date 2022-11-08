
package Imovel;
public abstract class  Imovel {
    private String endereco;
    double valor;
    private ImovelNovo imovelNovo;
    private ImovelVelho imovelVelho;

    public Imovel(String endereco, double valor) {
        this.endereco = endereco;
        this.valor = valor;
    }

    public ImovelNovo getImovelNovo() {
        return imovelNovo;
    }

    public ImovelVelho getImovelVelho() {
        return imovelVelho;
    }
   
    public abstract double  CalcularValor();
    
        public static void main(String[] args) {
            Imovel n = new ImovelNovo(2.25, "222", 100);
            n.CalcularValor();
            Imovel v = new ImovelVelho(3.25, "333", 100);
            v.CalcularValor();
    }
  
}   
    
