import java.sql.SQLOutput;
import java.util.*;

public class ExemploMap {

    public static <Interator> void main(String[] args) {
        /*
Dado oss modelos de carros e serus respectivos conumos na estrada, faça
Modelo: Gol  consumo = 14,4 km/l
Modelo: Uno  consumo = 15,6 km/l
Modelo: Mobi consumo = 16,1 km/l
Modelo: HB20 consumo = 14,5 km/l
Modelo: Kwid consumo = 15,6 km/l
        * */
        System.out.println("Crie um dicionario que relacione os modelos e seus respectivos consumos:");
        Map<String, Double> carrosPopulares = new HashMap<>(){{

            put("Gol",  14.4);
            put("Uno",  15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());
        System.out.println("Substitua o consumo do Gol por 15.2km/l");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);
        System.out.println("Confira se existe o modelo TUCSON: " + carrosPopulares.containsKey("tucson"));
        System.out.println("Confira o consumo do uno: " + carrosPopulares.get("Uno"));
//        System.out.println("Exiba o terceiro modelo adicionado: " ); NÃO EXISTE UM METODO PARA ISSO
        System.out.println("Exiba os modelos dos carros: " );
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);
        System.out.println("Exiba o consumo dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);


        System.out.println("Exiba qual o mais economico: ");
        Double consumoEficiente =  Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";
        for (Map.Entry<String, Double> entry: entries){
            if (entry.getValue().equals(consumoEficiente)) modeloMaisEficiente = entry.getKey();
        }
        System.out.println("Modelo mais Eficiente: " + modeloMaisEficiente + " - " + consumoEficiente);

        System.out.println("Exiba o modelo mais economico e seu consumo: ");
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for(Map.Entry<String, Double> entry: carrosPopulares.entrySet()){
            if (entry.getValue().equals(consumoMenosEficiente)) {modeloMenosEficiente = entry.getKey();
            System.out.println("Modelo menos Eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
        }} ;
        System.out.println("Exiba a soma dos consumos: ");

        Iterator<Double> iterator =  carrosPopulares.values().iterator();
        Double soma = 0d;
        while (iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Soma dos consumos: " + soma);

        System.out.println("Exiba a media do conumo desse dicionario de carros: " + (soma/carrosPopulares.size()));

        System.out.println("Remova os modelos com consumo igual a 15.6km/l: ");
        System.out.println(carrosPopulares);

        Iterator<Double> iterator1 =  carrosPopulares.values().iterator();

        while(iterator1.hasNext()){
            if (iterator1.next().equals(15.6)) iterator1.remove();

        }
        System.out.println(carrosPopulares);
        System.out.println("Exiba todos os carros na ordem em que foram informados: " );
        Map<String, Double> carrosPopulares1 = new LinkedHashMap<>(){{

            put("Gol",  14.4);
            put("Uno",  15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares1);
        System.out.println("Exiba o dicionario ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(){{

            put("Gol",  14.4);
            put("Uno",  15.6);
            put("Mobi", 16.1);
            put("HB20", 14.5);
            put("Kwid", 15.6);
        }};
        System.out.println(carrosPopulares2.toString());
        System.out.println("Apague o dicionario de carros:");
        carrosPopulares.clear();
        System.out.println("Confira se o dicionario esta vazio: "+ carrosPopulares.isEmpty());


    }
}
