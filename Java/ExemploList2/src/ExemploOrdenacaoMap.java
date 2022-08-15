import java.util.*;

public class ExemploOrdenacaoMap {
    public static void main(String[] args) {
        /*
        Dados as seguintes informaçãos sobre meus livros favoritos e seus autores  crie
        um dicionario e ordene este dicionario;
        Exibibindo (Nome Autor - Nome Livro)

        Autor: Hawking, Stephen - Livro - Uma breve Historia do tempo - Paginas: 256
        Autor: Duhigg, Chalers - Livro - O Poder do Habito - Paginas: 408
        Autor: Harari, Yuval Noan - Livro - Lições para o Seculo 21 - Paginas: 432
        */


        System.out.println("Ordem aleatoria");
        Map<String, Livro> meusLivros = new HashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve Historia do Tempo", 256));
            put("Duhigg, Chalers", new Livro("O Poder do Habito", 408));
            put("Harari, Yuval Noan", new Livro("21 Lições para o Seculo 21", 432));

        }};
        for (Map.Entry<String, Livro> livro: meusLivros.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());

        System.out.println("Ordem inserção");

        Map<String, Livro> meusLivros1 = new LinkedHashMap<>(){{
            put("Hawking, Stephen", new Livro("Uma breve Historia do Tempo", 256));
            put("Duhigg, Chalers", new Livro("O Poder do Habito", 408));
            put("Harari, Yuval Noan", new Livro("21 Lições para o Seculo 21", 432));
        }};
        for (Map.Entry<String, Livro> livro: meusLivros1.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        System.out.println("Ordem Alfabetica de Autores");
        Map<String, Livro> meusLivros2 = new TreeMap<>(meusLivros1);
        for (Map.Entry<String, Livro> livro: meusLivros2.entrySet())
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


        System.out.println("Ordem Alfabetica dos Livros");
        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro: meusLivros3)
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());


    }
}

class Livro {

    private String nome;
    private Integer paginas;

    public String getNome() {
        return nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}