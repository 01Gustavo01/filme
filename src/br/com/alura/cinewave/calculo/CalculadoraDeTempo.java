package br.com.alura.cinewave.calculo;
import br.com.alura.cinewave.modelos.Title;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal(){
        return this.tempoTotal;
    }

//    public void inclui(Movie m){
//        this.tempoTotal += m.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Title title){
        System.out.println("Adicione duração em minutos de " + title);
        this.tempoTotal += title.getDuracaoEmMinutos();
    }
}
