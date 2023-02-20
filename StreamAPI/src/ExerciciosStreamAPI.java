import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class ExerciciosStreamAPI {

    public static void main(String[] args) {
        List<String> numerosAleatorios =
                Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");
        System.out.println("Imprima todos os elementos dessa lista de string: ");
        // numerosAleatorios.stream().forEach(new Consumer<String>() {
           // @Override
            //public void accept(String s) {
               // System.out.println(s);
        numerosAleatorios.forEach(System.out::println);

        System.out.println("Pegue os 5 primeiros números e coloque dentro de um Set: ");
        numerosAleatorios.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        System.out.println("Transforme esta lista de string em uma lista de numeros inteiros.");
    //    List<Integer> numerosAleatorios1 = new numerosAleatorios.stream()
    //            .map(Integer::parseInt)
        //         .collect(Collectors.toList());

        List<Integer> numerosAleatoriosInteger = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        System.out.println("Pegue os número pares e maiores do que 2 e coloque em uma lista: ");
        List<Integer> listParesMaioresQ2 = numerosAleatorios.stream()
                .map(Integer::parseInt)
                .filter(i -> (i % 2 == 0 && i > 2))
                .collect(Collectors.toList());
        System.out.println(listParesMaioresQ2);

        System.out.println("Mostre a média dos números: ");
        numerosAleatorios.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::println);

        System.out.println("Remova os valores ímpares");
        numerosAleatoriosInteger.removeIf(integer -> integer % 2 != 0);
        System.out.println(numerosAleatoriosInteger);
        }

    }





