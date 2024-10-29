

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }

    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }

    public double compare(Pessoa p) {
        return Double.compare(altura, p.getAltura());
    }
}

