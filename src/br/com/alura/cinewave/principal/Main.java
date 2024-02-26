package br.com.alura.cinewave.principal;

import br.com.alura.cinewave.calculo.CalculadoraDeTempo;
import br.com.alura.cinewave.calculo.FiltroRecomendacao;
import br.com.alura.cinewave.modelos.Episodio;
import br.com.alura.cinewave.modelos.Movie;
import br.com.alura.cinewave.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie meuMovie = new Movie("O poderoso chefinho",1970);
        meuMovie.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " +meuMovie.getDuracaoEmMinutos());

        meuMovie.exibeFichaTecnica();
        meuMovie.avalia(8);
        meuMovie.avalia(6);
        meuMovie.avalia(10);
        System.out.println(meuMovie.pegaMedia());
        System.out.println(meuMovie.getTotalDeAvalicoes());
        //meuMovie.somaDasAvaliacoes = 10;
        System.out.println(meuMovie.pegaMedia());

        Serie lost = new Serie("Lost",2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " +lost.getDuracaoEmMinutos() + " minutos");

        Movie otherMovie = new Movie("Avatar",2023);

        otherMovie.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuMovie);
        calculadora.inclui(otherMovie);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuMovie);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var movieDoGusta = new Movie("DogVille",200);
        movieDoGusta.setNome("DogVille");
        movieDoGusta.setAnoDeLancamento(2003);
        movieDoGusta.avalia(10);

        ArrayList<Movie> listadeMovies = new ArrayList<>();
        listadeMovies.add(movieDoGusta);
        listadeMovies.add(meuMovie);
        listadeMovies.add(otherMovie);
        System.out.println("tamanho da lista " + listadeMovies.size());
        System.out.println("Primeiro filme " + listadeMovies.get(0).getNome());
        System.out.println(listadeMovies);
        System.out.println("ToString do Filme " + listadeMovies.get(0).toString());


    }
}
