package br.com.alura.CineWave.principal;

import br.com.alura.CineWave.modelos.Movie;
import br.com.alura.CineWave.modelos.Serie;
import br.com.alura.CineWave.modelos.Title;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Movie meuMovie = new Movie("O poderoso chefinho", 1970);
        meuMovie.avalia(9);
        Movie otherMovie = new Movie("Avatar", 2023);
        meuMovie.avalia(9);
        var movieDoGusta = new Movie("DogVille", 200);
        meuMovie.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Title> lista = new ArrayList<>();
        lista.add(movieDoGusta);
        lista.add(meuMovie);
        lista.add(otherMovie);
        lista.add(lost);
        for (Title item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Movie movie && movie.getClassificacao() > 2) {
                System.out.println("Classificação" + movie.getClassificacao());
            }
        }
    }
}
