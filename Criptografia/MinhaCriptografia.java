
package Criptografia;

public class MinhaCriptografia {
    
    private String texto;
    private boolean criptografado;

    public MinhaCriptografia(String texto) {
        this.texto = texto;
        criptografado = false;
    }
        public String getTexto() {
        return texto;
    }
    public boolean criptografar() {
        if(!criptografado){
            texto = texto.replaceAll("a", "%");
            texto = texto.replaceAll("b", "@");
            return criptografado = (true);
            
        }
        return false;
        
    }
    public boolean descriptografar(){
        if(criptografado){
            texto = texto.replaceAll("%", "a");
            texto = texto.replaceAll("@", "b");
            criptografado = false;
            return true;
            
        }
        return false;
        
    }
    public static void main(String[] args) {
        MinhaCriptografia mc = new MinhaCriptografia("batata");
        mc.criptografar();
        System.out.println(mc.getTexto());
        mc.descriptografar();
        System.out.println(mc.getTexto());
    }

   
}
