
package Votacao;


public class Deputado {
    private String nome;
    private String voto;

    public Deputado(String nome, String voto) {
        this.nome = nome;
        this.voto = voto;
    }

    public String getNome() {
        return nome;
    }

    public String getVoto() {
        return voto;
    }
    @Override
    public String toString(){
        return "Deputado: "+nome+"\n"+"Voto: "+voto+"\n-----------------------------\n";
    }
    
}
