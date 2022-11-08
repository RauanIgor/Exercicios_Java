
package Calculadora;

public class CalculadoraCientifica extends Calculadora{

    public CalculadoraCientifica(double valor1, double valor2) {
        super(valor1, valor2);
    }
    
    public double radiciacao(){
        double resultado = Math.sqrt(getValor1());
        System.out.println(resultado);
        return resultado;
    }
    public double potenciacao(){
        double resultado = Math.pow(getValor1(), getValor2());
        System.out.println(resultado);
        return resultado;
        
    }
    public static void main(String[] args) {
        CalculadoraCientifica a = new CalculadoraCientifica(10,5);
        CalculadoraCientifica b = new CalculadoraCientifica(10,2);
        CalculadoraCientifica c = new CalculadoraCientifica(2,10);
        CalculadoraCientifica d = new CalculadoraCientifica(16,0);
        a.somar();
        a.dividir();
        b.subtrair();
        b.multiplicar();
        c.potenciacao();
        d.radiciacao();
    }
    
}
