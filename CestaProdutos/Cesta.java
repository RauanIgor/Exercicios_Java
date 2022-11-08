
package CestaProdutos;

//import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;

public class Cesta {
    
    private List<Produto> produtos;

    public Cesta() {
        produtos = new ArrayList<>();
    }
    
    public void addProduto(Produto p){
        produtos.add(p);
    }
    
    public double calcularTotal(){
        double total = 0;
        for (Produto p : produtos){ // para cada produto p dentro de produtos, faça isso
            total += p.getValor() * p.getQtd();
        }
        
        return total;
    }
}
