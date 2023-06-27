package classes;

import java.util.Random;

/**
 * @author Thiago Aguiar
 */
public class Luta {

    // ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    // CONSTRUTOR
    public Luta(int rounds) {
        this.rounds = rounds;
        this.aprovada = false;
    }

    // GETTERS E SETTERS
    private Lutador getDesafiado() {
        return this.desafiado;
    }

    private void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    private Lutador getDesafiante() {
        return this.desafiante;
    }

    private void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    private int getRounds() {
        return this.rounds;
    }

    private void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }

    private void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    // MÉTODOS PÚBLICOS
    public void aprovarLuta() {

        this.setAprovada(true);

    }

    public void reprovarLuta() {

        this.aprovada = false;

    }

    public boolean marcarLuta(Lutador desafiante, Lutador desafiado) {

        boolean lutaMarcada = false;

        if (this.getAprovada() == true && desafiante.getCategoria().equals(desafiado.getCategoria())
                && !desafiante.getNome().equals(desafiado.getNome())) {

            lutaMarcada = true;

        }

        return lutaMarcada;

    }

    public Lutador lutar(Lutador desafiante, Lutador desafiado) {

        Lutador vencedor = new Lutador("Empate", "-", 0, 0, 0, 0, 0, 0);

        System.out.println(desafiante.apresentar());
        System.out.println(desafiado.apresentar());

        Random random = new Random();

        int resultadoDaLuta = random.nextInt(3);

        switch (resultadoDaLuta) {
            
            case 1:
                vencedor = desafiante;
                desafiante.setVitorias(desafiante.getVitorias() + 1);
                desafiado.setDerrotas(desafiado.getDerrotas() + 1);
                break;
            case 2:
                vencedor = desafiado;
                desafiado.setVitorias(desafiado.getDerrotas() + 1);
                desafiante.setVitorias(desafiado.getDerrotas() + 1);
                break;
            default:
                vencedor.setNome("Empate");
                break;
                
        }

        return vencedor;

    }

}
