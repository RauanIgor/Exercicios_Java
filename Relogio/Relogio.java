
package Relogio;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Relogio {
    private Timer tempo;
    private Timer alarme;

    public Relogio(Timer tempo, Timer alarme) {
        this.tempo = tempo;
        this.alarme = alarme;
    }
    public void ligar(){
        while(true){
            tempo.incrementar();
            System.out.println(""+tempo);
            if (tempo.getHora() == alarme.getHora() 
                && tempo.getMinuto() == alarme.getMinuto() 
                && tempo.getSegundo()== alarme.getSegundo())
            dispararAlarme();
        
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Relogio.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
    }
    public void dispararAlarme(){
        System.out.println("BIP BIP BIP");
    }
    public static void main(String[] args) {
        Relogio r = new Relogio(new Timer(15,36,0), new Timer(15,37,0));
        r.ligar();
    }
   
}
