package ComputadorGamer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class Laboratorio {
    
    private int numSala; 
    private String descricao; 
    private List <Equipamento> equipamento; 

    public Laboratorio(int numSala, String descricao) {
        this.numSala = numSala;
        this.descricao = descricao;
        equipamento = new ArrayList<>();
    }
    
    public void addEquipamento(Equipamento e){
        equipamento.add(e);
    }
    
    public void Listar(){
        int contador = 0; 
        System.out.println("Equipamentos do Laboratório " + numSala);
        System.out.println("-------------------");
        for (Equipamento e : equipamento){
            if (e.isAtivo()){
                System.out.println("| Equipamento Nº" + (++contador));
                e.exibirDados();
            }
        }
    } 
    
    public static void main(String[] args) {
        
        Laboratorio lab_305 = new Laboratorio(305, "Laboratório TOP!!!");
        
        Calendar c = new GregorianCalendar(); 
        c.set(Calendar.YEAR, 2022);
        c.set(Calendar.MONTH, Calendar.AUGUST);
        c.set(Calendar.DAY_OF_MONTH, 18);
        
        lab_305.addEquipamento(new Computador(16, "Intel Core i7", c.getTime(), 2010001));
        lab_305.addEquipamento(new Roteador("192.168.0.6", 6, 6, c.getTime(), 2010666));
        lab_305.Listar();
        
        
    }
}
