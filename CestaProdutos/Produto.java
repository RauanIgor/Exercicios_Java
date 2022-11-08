
package CestaProdutos;

        
public class Produto {
    
   private String nome;
   private double valor;
   private double qtd;

    public Produto(String nome, double valor, double qtd) {
        this.nome = nome;
        this.valor = valor;
        this.qtd = qtd;
        
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public double getQtd() {
        return qtd;
        
    }
    
    
    }
    
    


