
package BoletimEscolar;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private String Nome;
    private String Endereço;
    private List<Aluno>alunos;

    public Escola(String Nome, String Endereço) {
        this.Nome = Nome;
        this.Endereço = Endereço;
        alunos = new ArrayList<>();
        
    }
    public void addAluno(Aluno a){
        alunos.add(a);
        
    }

    public String getNome() {
        return Nome;
    }

    public String getEndereço() {
        return Endereço;
    }
    public static void main(String[] args) {
        Aluno a = new Aluno("Igor Rauan","20161034010010","2333333", new Disciplina("POO","Fernando","Tarde","Informatica"));
        Aluno x = new Aluno("Louise Hellem","20171034010010","2333333", new Disciplina("POO","Fernando","Manha","Informatica"));
        Aluno y = new Aluno("Cellyane Fernanda","20171034010010","2333333", new Disciplina("POO","Fernando","Manhã","Informatica"));
        Escola e = new Escola("IFRN", "Rua Manoel Lopes Filho, 773");
        e.addAluno(a);
        Boletim b = new Boletim(a, 65, 54, 43, 100);
        Boletim z = new Boletim(x, 70, 80, 90, 100);
        Boletim w = new Boletim(y, 100, 90, 80, 70);
        
        Relatorio r = new Relatorio();
        r.addBoletim(b);
        r.addBoletim(w);
        r.addBoletim(z);
        System.out.println(r);
        
    }
    
}
