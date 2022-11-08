
package BoletimEscolar;


public class Disciplina {
    private String nome;
    private String professor;
    private String turno;
    private String curso;

    public Disciplina(String nome, String professor, String turno, String curso) {
        this.nome = nome;
        this.professor = professor;
        this.turno = turno;
        this.curso = curso;
    }

    public String getNome() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }

    public String getTurno() {
        return turno;
    }

    public String getCurso() {
        return curso;
    }
    
}
