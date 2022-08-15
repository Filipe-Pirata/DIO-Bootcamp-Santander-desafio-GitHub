import java.util.*;

public class exemploListEx {
    public static void main (String[] args) {

        System.out.println("Crie uma lista e adicione as sete notas: ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(7.2);
        notas.add(9.0);
        notas.add(5.8);
        notas.add(4.5);
        System.out.println(notas);
        System.out.println("Exiba a posição da nota 7.2: " +  notas.indexOf(7.2));
        System.out.println("Adicione na lista a nota 8 na posição 4: ");
        notas.add(4, 8d);
        System.out.println(notas);
        notas.set(notas.indexOf(7.2), 6.0);
        System.out.println("Substituindo 7.2 pot 6.0: ");
        System.out.println(notas);
        System.out.println("Confira se a nota 7.2 esta na lista: "+ notas.contains(7.2) );
//        System.out.println("Exiba todas as notas na ordem em que foram informadas: ");
//        for(double nota: notas) System.out.println(nota);

        System.out.println("Exiba a terceita nota adicionada: "+ notas.get(2));
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;

        }
        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("Exiba a media das notas: "  + (soma/notas.size()));
        notas.remove(4.5);
        System.out.println("Nota 4.5 removida: " + notas);
        notas.remove(0);
        System.out.println("Remove a nota da posição 0(zero): " + notas);
        System.out.println("Remove as notas menores que 7: ");
        Iterator<Double> iterator1 =  notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();

        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);
        System.out.println("Confira se a lista esta vazia: " + notas.isEmpty());
    }

}
