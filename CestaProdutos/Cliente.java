
package CestaProdutos;

public class Cliente {
    
 private Cesta cesta;
    private String nome;

    public Cliente (String nome) {
        this.nome = nome;
        cesta =  new Cesta();        
    }

    public String getNome() {
        return nome;
    }
    
    
    
   public double valorCompra(){
       return cesta.calcularTotal();
       
   }

    @Override
    public String toString() {
return "Nome: " +nome+ "\nValor Total: R$ " +valorCompra(); 
        }
   
   
   
    public static void main(String[] args) {
        
        Cliente c = new Cliente ("Rauan");
        
        c.getCesta().addProduto(new Produto("Qualquer coisa", 100, 2));
        c.getCesta().addProduto(new Produto("Outra coisa", 12, 3));
        
        System.out.println(c);
        
        
        
    }

    public Cesta getCesta() {
        return cesta;
    }
}
