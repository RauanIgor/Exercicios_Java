package Conta;


public class Conta {
    
    private static int contador = 0;
    private double saldo;
    private String titular;
    private int numConta;
    
    public Conta (String titular){
        this.titular = titular;
        saldo = 0;
        numConta = ++contador; // ????
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double novosaldo) {
        double valor = novosaldo + saldo;
        if (valor >= -400){
            int q = (int) Math.floor (novosaldo / 100);
            novosaldo = novosaldo - (q * 100);
            q = (int) Math.floor (novosaldo / 50);
            novosaldo = novosaldo - (q * 50);
            q = (int) Math.floor (novosaldo / 20);
            novosaldo = novosaldo - (q * 20);
            q = (int) Math.floor (novosaldo / 10);
            novosaldo = novosaldo - (q * 10);
            q = (int) Math.floor (novosaldo / 5);
            novosaldo = novosaldo - (q * 5);
            q = (int) Math.floor (novosaldo / 2);
            novosaldo = novosaldo - (q * 2);
            if (novosaldo == 0){
                saldo = valor;
            }
        }
    }
    
    public static void main(String[] args) {
        Conta c = new Conta ("Rauan");
        c.setSaldo(200);
        System.out.println(c.getSaldo());
        System.out.println(c.getNumConta());
        

    }
   
}
