import java.util.*;

public class ExemploSet {

    /*
     Dada uma lista com 7 notas de um aluno : [7, 8.5, 9.3, 5, 7, 0, 3.6] faça:

    * */



    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());


//      System.out.println("Exibindo nota da posição 5: "); NAO É POSSIVEL FAZER BUSCA EM SET
//      System.out.println("Adicione na lista no 8 na posição 4: "); NAO É POSSIVEL FAZER BUSCA EM SET
//      System.out.println("Substituia nota 5 pela nota 6: "); NAO É POSSIVEL FAZER BUSCA EM SET
        System.out.println("confira se a NOTA 5 esta no conjunto: " + notas.contains(5d));
//      System.out.println("Exiba a terceira nota adicionada: "); NAO É POSSIVEL FAZER BUSCA EM SET
        System.out.println("Exiba a menor nota: "+ Collections.min(notas));
        System.out.println("Exiba a maior nota: "+ Collections.max(notas));

        // LAÇO PARA SOMA DAS NOTAS
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        };
        System.out.println("Exiba a soma das nota: " + soma);

        System.out.println("Exiba a media das notas: " + (soma/notas.size()));
        System.out.println("Remova a nota 0");
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menoras que 7");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
//      System.out.println("Remova} nota na posição 0: "); NAO É POSSIVEL FAZER BUSCA EM SET

    }
        System.out.println(notas);
        System.out.println("Exiba todas as notas na ordem que foram informadas");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas em ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto");
        notas.clear();
        System.out.println(notas);
        System.out.println("Confira se o conjunto 1 esta vazio:" + notas.isEmpty());
        System.out.println("Confira se o conjunto 2 esta vazio:" + notas2.isEmpty());
}}
