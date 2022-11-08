package Votacao;

import java.util.ArrayList;
import java.util.List;

public class PainelEletronico {

    private Materia materia;
    List<Deputado> deputados;
    private int qtdVotosAfavor;
    private int qtdvotosContra;

    public PainelEletronico(Materia materia) {
        this.materia = materia;
        this.qtdVotosAfavor = 0;
        this.qtdvotosContra = 0;
        deputados = new ArrayList<>();
    }

    public Materia getMateria() {
        return materia;
    }

    public List<Deputado> getDeputados() {
        return deputados;
    }

    public void addDeputados(Deputado d) {
        deputados.add(d);
    }

    public void checarVoto() {
        String vot = "A favor";
        for (Deputado d : deputados) {
            if (d.getVoto().equalsIgnoreCase(vot)) {
                this.qtdVotosAfavor++;
            } else {
                this.qtdvotosContra++;
            }

        }
    }

    public String toString() {
        return "########## VOTAÇÂO ##########\n---------------------------\n"
                + materia.getDescrição() + "\n---------------------------\n" + deputados + "\n"
                + "###### DADOS DA VOTAÇÃO ######\n--------------------------\n"
                + "Votos A favor: " + this.qtdVotosAfavor + "\n"
                + "Votos Contra: " + this.qtdvotosContra + "\n";
    }

    public static void main(String[] args) {
        Materia m = new Materia("Fernando ADIAR a entrega da LISTA e do PROJETO!!!");
        Deputado a = new Deputado("Riam Marcos", "A favor");
        Deputado b = new Deputado("Liliane Laleska", "A favor");
        Deputado c = new Deputado("Igor Rauan", "A favor");
        Deputado d = new Deputado("Saul Galileu", "A favor");
        Deputado e = new Deputado("Ninguém", "Contra");
        PainelEletronico p = new PainelEletronico(m);
        p.addDeputados(a);
        p.addDeputados(b);
        p.addDeputados(c);
        p.addDeputados(d);
        p.addDeputados(e);
        p.checarVoto();
        System.out.print(p);
    }
}
