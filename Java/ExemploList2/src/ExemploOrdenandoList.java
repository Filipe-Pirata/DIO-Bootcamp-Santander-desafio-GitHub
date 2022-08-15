


//Dada as seguintes informações sobre os meus gatos, crie uma lista ordenando esta lista exibindo:
// (nome - idade - cor)

/*
Gato 1: nome: Jon idade: 18 cor: Preto
Gato 1: nome:Simba idade: 6 cor: Tigrado
Gato 1: nome: Jon idade: 12 cor: Amarelo
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploOrdenandoList {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{

        add(new Gato("Jon" , 18 , "Preto" ));
        add(new Gato("Simba" , 6 , "tigrado" ));
        add(new Gato("Jon" , 12 , "Amarelo" ));
        }};
        System.out.println("--\tOrdem de inserção\t---");
        System.out.println(meusGatos);
        System.out.println("Ordem Aleatoria:");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        System.out.println("Ordem natural (Nome)");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);
        System.out.println("Ordem natural (Idade)");
        Collections.sort(meusGatos, new comparatorIdade());
//        meusGatos.sort(new comparatorIdade());
        System.out.println(meusGatos);
        System.out.println("Ordem COR");
        Collections.sort(meusGatos, new comparatorCor());
        System.out.println(meusGatos);
        System.out.println("Ordem NOME/COR/IDADE");
        Collections.sort(meusGatos, new comparatorNomeCorIdade());
        System.out.println(meusGatos);

    }
}

class Gato implements Comparable<Gato> {
    private String nome;
    private Integer idade;
    private  String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class comparatorIdade implements Comparator<Gato> {
    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}


class comparatorCor implements Comparator<Gato> {

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor()) ;
    }
}

class comparatorNomeCorIdade implements Comparator<Gato>{


    @Override
    public int compare(Gato g1, Gato g2) {

        // ORDENANDO PELOS NOMES
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome != 0) return nome;

        // ORDENANDO PELAS CORES
        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if (cor != 0) return cor;

        // ORDENANDO PELA IDADE
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}