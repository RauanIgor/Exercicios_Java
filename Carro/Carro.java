
package Carro;

public class Carro {
    private String modelo;
    private String marca;
    private int ano;
    private Roda rodas [] = new Roda[4];
    private Motor motor;
    

    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }
    public void acelerar(){
        
    }
    public void frear(){
        
    }
}
