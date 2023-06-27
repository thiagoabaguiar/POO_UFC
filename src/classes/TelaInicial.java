package classes;

import classes.Luta;
import classes.Lutador;

/**
 * @author Thiago Aguiar
 */

public class TelaInicial {

    public static void main(String[] args) {

        Lutador[] lutadores = new Lutador[6];

        lutadores[0] = new Lutador("Bad Boy", "França", 31, 1.75f,68.9f, 11, 2, 1);
        lutadores[1] = new Lutador("Putscript", "Brasil", 29, 1.68f,67.3f, 14, 2, 3);
        lutadores[2] = new Lutador("Snapshadow", "EUA", 35, 1.65f,80.9f, 13, 2, 1);
        lutadores[3] = new Lutador("Dead Code", "Austrália", 28, 1.93f,81.6f, 12, 0, 2);
        lutadores[4] = new Lutador("CobOld", "Rússia", 37, 1.70f,119.3f, 5, 4, 3);
        lutadores[5] = new Lutador("Web Kill", "Irlanda", 30, 1.81f,105.7f, 12, 2, 4);      
        
        Lutador desafiante = lutadores[4];
        Lutador desafiado = lutadores[5];   
        
        Luta lutaPeloCinturao = new Luta(5); 
        
        lutaPeloCinturao.aprovarLuta();
        
        lutaPeloCinturao.marcarLuta(desafiante, desafiado);
        
        boolean statusLuta = lutaPeloCinturao.getAprovada();
        
        System.out.println("Luta foi marcada? " + statusLuta);
        
        Lutador vencedor = lutaPeloCinturao.lutar(desafiante, desafiado);
        
        System.out.println("E o vencedor é: \n" + vencedor.getNome());
        
    }

}
