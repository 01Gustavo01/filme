package br.com.alura.cinewave.principal;

import br.com.alura.cinewave.modelos.Movie;
import br.com.alura.cinewave.modelos.Serie;
import br.com.alura.cinewave.modelos.Title;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jaqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois de ordenar:");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de Titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Title::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
