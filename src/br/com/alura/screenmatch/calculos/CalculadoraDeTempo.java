package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempototal;

    public int getTempototal() {
        return this.tempototal;
    }

//    public void inclui(Filme f) {
//        this.tempototal += f.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        this.tempototal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo) {
        this.tempototal += titulo.getDuracaoEmMinutos();
    }
}
