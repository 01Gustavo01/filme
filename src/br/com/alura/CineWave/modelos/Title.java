package br.com.alura.CineWave.modelos;

public class Title {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvalicoes;
    private int duracaoEmMinutos;

    public Title(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalDeAvalicoes() {
        return totalDeAvalicoes;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {

        this.anoDeLancamento = anoDeLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {

        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {

        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Soma das Avaliações: " + somaDasAvaliacoes);
        System.out.println("Total Avaliações: " + totalDeAvalicoes);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvalicoes++;
    }

    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvalicoes;
    }
}
