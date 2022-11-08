
package MsgCelular;
import java.util.Scanner;

public class Celular {
    public String enviar;
    public String checarMenssagem;

    public Celular(String enviar) {
        this.enviar = enviar;
    }

    public String getEnviar() {
        Scanner el = new Scanner(System.in);
        System.out.println("Escreva a menssagem a ser enviada: ");
        enviar = el.nextLine();
        return enviar;
    }
   
    public String getChecarMenssagem() {
        checarMenssagem = enviar;
        System.out.print("Menssagem: ");
        System.out.println(checarMenssagem);
        return checarMenssagem;
    }

     
    
}

