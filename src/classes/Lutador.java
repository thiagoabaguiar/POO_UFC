package classes;

/**
 * @author Thiago Aguiar
 */
public class Lutador {

    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {

        this.peso = peso;

        setCategoria(this.peso);

    }

    public String getCategoria() {
        return this.categoria;
    }

    private void setCategoria(float peso) {

        if (peso >= 52.2 && peso <= 70.3) {

            this.categoria = "Peso Leve";

        } else if (peso > 70.3 && peso <= 83.9) {

            this.categoria = "Peso Médio";

        } else if (peso > 83.9 && peso <= 120.2) {

            this.categoria = "Peso Pesado";

        } else {
            
            this.categoria = "Peso inválido. Sem categoria";
            
        }

    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        setNome(nome);
        setNacionalidade(nacionalidade);
        setIdade(idade);
        setAltura(altura);
        setPeso(peso);
        setVitorias(vitorias);
        setDerrotas(derrotas);
        setEmpates(empates);
    }

    public void apresentar() {
    }

    public void status() {
    }

    public void ganharLuta() {
    }

    public void perderLuta() {
    }

    public void empatarLuta() {
    }

}
