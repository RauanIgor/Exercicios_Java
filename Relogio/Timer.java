
package Relogio;

public class Timer {
    private int hora, minuto, segundo;

    public Timer(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }
    
    public void incrementar(){
        segundo++;
        if (segundo > 59){
            minuto++;
            segundo=0;
            if(minuto>59){
                hora++;
                minuto=0;
                if(hora>23);
                hora=0;
            }
        }
    }
    @Override
    public String toString(){
        return hora + ":" + minuto + ":" +segundo;
    }
    
}
