package classes;

/**
 * @author Thiago Aguiar
 */
public class Lutador {
    
    // ATRIBUTOS
    private String nome, nacionalidade, categoria;
    private int idade, vitorias, derrotas, empates;
    private float altura, peso;    
    
    // CONSTRUTOR
    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.setNome(nome);
        this.setNacionalidade(nacionalidade);
        this.setIdade(idade);
        this.setAltura(altura);
        this.setPeso(peso);
        this.setVitorias(vitorias);
        this.setDerrotas(derrotas);
        this.setEmpates(empates);
    }
    
    // GETTERS E SETTERS
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
        
        this.setCategoria();
        
    }
    
    public String getCategoria() {
        return this.categoria;
    }
    
    private void setCategoria() {
     
        if (this.peso >= 52.2 && this.peso <= 70.3) {
            
            this.categoria = "Peso Leve";
            
        } else if (this.peso > 70.3 && this.peso <= 83.9) {
            
            this.categoria = "Peso Médio";
            
        } else if (this.peso > 83.9 && this.peso <= 120.2) {
            
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
    
    // MÉTODOS ADICIONAIS    
    public String apresentar() {
        String apresentacao;
        
        apresentacao = this.getNome() + " do(a) " +
                this.getNacionalidade() + " com " + this.getIdade() + " anos, " +
                this.getAltura() + " de altura e " + this.getPeso() + "kg, " + 
                "lutando pela categoria " + this.getCategoria() + " com " +
                this.getVitorias() + " vitórias, " +
                this.getDerrotas() + " derrotas e " +
                this.getEmpates() + " empates.";
        
        return apresentacao;
    }
    
    public String status() {
        String status;
        
        status = "Nome: " + this.getNome() + "\n" +
                "Vitórias: " + this.getVitorias() + "\n" +
                "Derrotas: " + this.getDerrotas() + "\n" +
                "Empates: " + this.getEmpates();
        
        return status;
    }
    
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }
    
    public void perderLuta() {
        this.setVitorias(this.getDerrotas() + 1);
    }
    
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
}