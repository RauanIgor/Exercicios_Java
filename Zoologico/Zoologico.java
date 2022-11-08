package Zoologico;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Zoologico {
    
    private List<Animal> animais; 
    private int comidaEstoque; 
    private double despesas; 
    
    private int tempo; 
    
    public Zoologico(){
        animais = new ArrayList<>(); 
        comidaEstoque = 0; 
        despesas = 0.0; 
        tempo = 0; 
    }
    
    public void receberAnimal(Animal a){
        animais.add(a);
    }
    
    public void abrirPortoes(){
        while (true){
            try {
                gerenciar();
                tempo++; 
                if (tempo == 5){
                    gerarRelatorio();
                }
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Zoologico.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void gerenciar(){
        for (Animal a: animais){
             a.respirar();
            if (a.getNivelFome() == 100){
                alimentar(a);
                
               
            }
        }
    }
    
    public void alimentar(Animal a){
        if (comidaEstoque <= 0 ){
            comidaEstoque += 1000; 
            despesas += ((1000 / 300) * 23.76) * 0.94;  
        }
        comidaEstoque = a.comer(comidaEstoque);
    }
    
    private void gerarRelatorio(){
        tempo = 0; 
        System.out.println("############");
        System.out.println("Data: "
                + new Date());
        System.out.println("############");
        System.out.println("Animais: ");
        System.out.println("------------");
        for (Animal a: animais){
            System.out.println(a.getApelido() + " - Fome: "
                    + a.getNivelFome());
        }
        System.out.println("############");
        System.out.println("Estoque: " + comidaEstoque + "g | " +
                "Valor Gasto: R$ " + despesas);
        System.out.println("############\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
    public static void main(String[] args) {
        
        Zoologico zoo = new Zoologico();
        zoo.receberAnimal(new Animal("Cabrito", "Lucy", 150, 3));
        zoo.receberAnimal(new Animal("Pato", "Patolino", 200, 1));
        zoo.receberAnimal(new Animal("Preá", "Pepa", 500, 2));
        zoo.abrirPortoes();
     
    }
    
}
