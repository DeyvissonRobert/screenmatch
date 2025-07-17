package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDaKaylanny = new Filme("Acompanhante Perfeita", 2004);
        filmeDaKaylanny.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDaKaylanny);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtistas = new ArrayList<>();
        buscaPorArtistas.add("The Rock");
        buscaPorArtistas.add("Andrew Garfield");
        buscaPorArtistas.add("Tobey Maguire");
        System.out.println(buscaPorArtistas);

        Collections.sort(buscaPorArtistas);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtistas);
        System.out.println("Lista de titulos ordenados: ");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);

    }
}