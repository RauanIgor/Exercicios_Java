package Zoologico;

public class Animal {
    
    private String tipoAnimal;
    private String apelido;
    private int nivelFome;
    private int consumo;
    private int variante;
    private int variacao;

    public Animal(String tipoAnimal, String apelido, int consumo, int variante) {
        this.tipoAnimal = tipoAnimal;
        this.apelido = apelido;
        this.consumo = consumo;
        this.variante = variante;
        nivelFome = 0;
        variacao = 0; 
    }
    
    public int comer(int estoque) {
        nivelFome = 0;
        return estoque - consumo; 
    }
    
    public void respirar() {
       
        variacao++; 
        if(variacao == variante){
            nivelFome++;
            variacao = 0; 
                    
        }
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public String getApelido() {
        return apelido;
    }

    public int getNivelFome() {
        return nivelFome;
    }

    public int getConsumo() {
        return consumo;
    }

    public int getVariante() {
        return variante;
    }

    public int getVariacao() {
        return variacao;
    }
        
    
    
}
