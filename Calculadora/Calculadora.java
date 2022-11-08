
package Calculadora;

public class Calculadora {
    private double valor1;
    private double valor2;

    public Calculadora(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double getValor1() {
        return valor1;
    }

    public double getValor2() {
        return valor2;
    }
    
    
    public double somar(){
        double resultado = valor1+valor2;
        System.out.println(resultado);
        return resultado;
    }
 
    public double subtrair(){
        double resultado = valor1-valor2;
        System.out.println(resultado);
        return resultado;
    
    }
  
    public double multiplicar(){
        double resultado = valor1*valor2;
        System.out.println(resultado);
        return resultado;
    
    }
  
    public double dividir(){
        double resultado = valor1/valor2;
        System.out.println(resultado);
        return resultado;
       
        
    
    }
      
}

