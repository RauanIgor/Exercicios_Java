
package BoletimEscolar;

import java.util.ArrayList;
import java.util.List;

public class Relatorio {
    private List<Boletim>boletins;

    public Relatorio() {
        boletins = new ArrayList<>();
    }
    public void addBoletim(Boletim b){
        boletins.add(b);
    }
    @Override
    public String toString(){
        String msg = "########## Relatório ##########\n"+"Nomes e Notas bimestrais dos Alunos\n";
        for(Boletim b : boletins){
            msg += b;
        }
        return msg;
    }
    
}
