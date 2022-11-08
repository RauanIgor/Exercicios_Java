
package BoletimEscolar;

public class Boletim {
    private Aluno aluno;
    private double nota1, nota2, nota3, nota4;

    public Boletim(Aluno aluno, double nota1, double nota2, double nota3, double nota4) {
        this.aluno = aluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }



    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getNota4() {
        return nota4;
    }


    @Override
    public String toString(){
        String msg = ("---------------------\n" 
                       + "Nome: "+aluno.getNome()+"\n" 
                       + "1° Bimestre: "+nota1+"\n"
                       + "2° Bimestre: "+nota2+"\n"
                       + "3° Bimestre: "+nota3+"\n"
                       + "4° Bimestre: "+nota4+"\n");
    return msg;
    }
    
    
}

