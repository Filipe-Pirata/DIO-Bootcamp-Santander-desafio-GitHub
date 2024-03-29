import java.util.*;

public class ExemploOrdenacaoSet {

    //Serie 1 = nome: got, genero: fantasia, tempoEpisodio: 60
    //Serie 2 = nome: Datk, genero: drama, tempoEpisodio: 60
    //Serie 3 = nome: that701s show, genero: comédia, tempoEpisodio: 25


    public static void main(String[] args) {
        System.out.println("Ordem Aleatoria");
        Set<Serie> minhasSeries = new HashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));

        }};
        for (Serie serie: minhasSeries) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
                serie.getTempoEpisodio());


        System.out.println("Ordem Inserção");
        Set<Serie> minhasSeries1 = new LinkedHashSet<>(){{
            add(new Serie("got", "fantasia", 60));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("that '70s show", "comédia", 25));

        }};
        for (Serie serie: minhasSeries1) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
                serie.getTempoEpisodio());


        System.out.println("Ordem Natural(TempoEpisodio)");
        Set<Serie> minhasSeries2 = new TreeSet<>(minhasSeries1);
        for (Serie serie: minhasSeries2) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
                serie.getTempoEpisodio());
        System.out.println(minhasSeries2);


        System.out.println("Ordem Nome/Genero/Tempo");
        Set<Serie> minhasSeries3 = new TreeSet<>(new ComparatorSerie());
        for (Serie serie: minhasSeries3) System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " +
                serie.getTempoEpisodio());

        System.out.println(minhasSeries3);





    }
}

class Serie  implements Comparable<Serie> {
    private String nome;
    private String genero;
    private Integer tempoEpisodio;

    public Serie(String nome, String genero, Integer tempoEpisodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpisodio = tempoEpisodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpisodio() {
        return tempoEpisodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpisodio=" + tempoEpisodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Serie Serie = (Serie) o;
        return nome.equals(Serie.nome) && genero.equals(Serie.genero) && tempoEpisodio.equals(Serie.tempoEpisodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpisodio);
    }

    @Override
    public int compareTo(Serie serie) {
        int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
        if (tempoEpisodio != 0) return tempoEpisodio;
        return this.getGenero().compareTo(serie.getGenero());

    }
}
//static class ComparatorNgt implements Comparator<Serie> {
//
//
//    @Override
//    public int compare(Serie s1, Serie s2) {
//        int nome = s1.getNome().compareTo(s2.getNome());
//        if (nome != 0 ) return nome;
//
//        int genero = s1.getGenero().compareTo(s2.getGenero());
//        if (genero != 0 ) return genero;
//
//        return  Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
//    }
//}
//
//}

  class ComparatorSerie implements Comparator<Serie> {


    @Override
    public int compare(Serie s1, Serie s2) {
        int nome = s1.getNome().compareTo(s2.getNome());
        if (nome != 0 ) return nome;

        int genero = s1.getGenero().compareTo(s2.getGenero());
        if (genero != 0 ) return genero;

        return  Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
    }
}
