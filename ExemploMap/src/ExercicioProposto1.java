// Dada a população estimada de alguns estados do NE brasileiro, faça:

import java.awt.image.ImageProducer;
import java.util.*;

//Estado = PE - População = 9.616.621
//Estado = AL - População = 3.351.543
//Estado = CE - População = 9.187.103
//Estado = RN - População = 3.534.265
//Crie um dicionário e relacione os estados e suas populações;
//Substitua a população do estado do RN por 3.534.165;
//Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
//Exiba a população PE;
//Exiba todos os estados e suas populações na ordem que foi informado;
//Exiba os estados e suas populações em ordem alfabética;
//Exiba o estado com o menor população e sua quantidade;
//Exiba o estado com a maior população e sua quantidade;
//Exiba a soma da população desses estados;
//Exiba a média da população deste dicionário de estados;
//Remova os estados com a população menor que 4.000.000;
//Apague o dicionário de estados;
//Confira se o dicionário está vazio.
public class ExercicioProposto1 {

    public static void main(String[] args) {
        System.out.println("Crie um dicionário e relacione os estados e suas populações: ");
        Map<String, Integer> populacaoEstadosNE = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEstadosNE);

        System.out.println("Substitua a população do estado do RN por 3.534.165");
        populacaoEstadosNE.put("RN", 3534165);
        System.out.println(populacaoEstadosNE.toString());

        System.out.println("Confira se o estado PB está no dicionário, caso não adicione: " + populacaoEstadosNE.containsKey("PB"));
        populacaoEstadosNE.put("PB", 4039277);
        System.out.println(populacaoEstadosNE);

        System.out.println("Exiba a população do PE: " + populacaoEstadosNE.get("PE"));

        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado: ");
        Map<String, Integer> populacaoEstadosNE1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEstadosNE1);

        System.out.println("Exiba os estados e suas populações em ordem alfabética: ");
        Map<String, Integer> populacaoEstadosNE2 = new TreeMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEstadosNE2);

        Collection<Integer> populacao = populacaoEstadosNE.values();
        String estadoMaisPopuloso = "";
        String estadoMenosPopuloso = "";
        for (Map.Entry<String, Integer> entry : populacaoEstadosNE.entrySet()){
            if (entry.getValue().equals(Collections.max(populacao))) estadoMaisPopuloso = entry.getKey();
            if (entry.getValue().equals(Collections.min(populacao))) estadoMenosPopuloso = entry.getKey();
        }
        System.out.println("Exiba o estado com o menor população e sua quantidade: " + estadoMenosPopuloso + " - " + Collections.min(populacao));
        System.out.println("Exiba o estado com maior população e sua quantidade: " + estadoMaisPopuloso + " - " + Collections.max(populacao));

        Iterator<Integer> iterator = populacaoEstadosNE.values().iterator();
        Integer soma = 0;
        while (iterator.hasNext()){
           soma += iterator.next();
        }
        System.out.println("Exiba a soma da população desses estados: " + soma);
        System.out.println("Exiba a média da população deste dicionário de estados: " + soma/populacaoEstadosNE.size());

        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator1 = populacaoEstadosNE.values().iterator();
        while (iterator1.hasNext()){
            if (iterator1.next() <= 4000000) iterator1.remove();
        }
        System.out.println(populacaoEstadosNE);

        System.out.println("Apague o dicionário: ");
        populacaoEstadosNE.clear();

        System.out.println("Confira se o dicionário está vazio: " + populacaoEstadosNE.isEmpty() );
    }
}
