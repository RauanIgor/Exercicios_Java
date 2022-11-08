
package Carro;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String cpf;
    private List<Carro> carros;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void addCarro(Carro carro){
        
    }
    public void removerCarro(Carro carro){
        
    }
}
