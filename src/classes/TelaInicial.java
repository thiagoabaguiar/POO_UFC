package classes;

/** 
 * @author Thiago Aguiar
 */

public class TelaInicial {        

    
    public static void main(String[] args) {

        Lutador lutador1 = new Lutador("thiago", "Brasil", 37, 1.80f, 50, 10, 2, 0);
                
        System.out.println("*** LUTADOR ***");
        System.out.println(lutador1.getCategoria());
        
        Lutador lutador2 = new Lutador("thiago", "Brasil", 37, 1.80f, 80, 10, 2, 0);
                
        System.out.println("*** LUTADOR ***");
        System.out.println(lutador2.getCategoria());
        
        Lutador lutador3 = new Lutador("thiago", "Brasil", 37, 1.80f, 81, 10, 2, 0);
                
        System.out.println("*** LUTADOR ***");
        System.out.println(lutador3.getCategoria());

    }   
                
}
