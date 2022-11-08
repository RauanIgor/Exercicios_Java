
package BoletimEscolar;


public class Aluno {
    private String nome;
    private String matricula;
    private String cpf;
    private Disciplina disciplina;
    

    public Aluno(String nome, String matricula, String cpf, Disciplina disciplina) {
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCpf() {
        return cpf;
    }

}
