
package Lampada;

import java.util.ArrayList;
import java.util.List;

public class Residencia {
    private List<Lampada> lampadas;

    public Residencia() {
        lampadas = new ArrayList<>();
    }
    public void addLampada(Lampada l){
        lampadas.add(l);
    }
    public void demostrativo(){
        int qtd = 0;
        double watts = 0;
        for(Lampada l : lampadas){
            if(l.isLigada() == true){
                qtd += 1;
                watts += l.getPotencia();
            }
                
        }
        System.out.println("A quantidade de lampadas ligadas é: "+qtd+"\n"+"e o consumo é de: "+watts+"watts");
               
        
    }
    public static void main(String[] args) {
        Residencia a = new Residencia();
        a.addLampada(new Lampada(100, true));
        a.addLampada(new Lampada(100, true));
        a.addLampada(new Lampada(100, false));
        a.addLampada(new Lampada(100, true));
        a.addLampada(new Lampada(60, false));
        a.addLampada(new Lampada(80, true));
        a.demostrativo();
    }
}
