import java.util.*;

public class ExercicioProposto1 {
    public static void main(String[] args) {
        System.out.println("Crie um conjunto contendo as cores do arco-íris: ");
        // Exiba todas as cores uma abaixo da outra.
        Set<String> coresArcoIris =  new HashSet<>(Arrays.asList("\nvermelho", "\nLaranja", "\nAmarelo", "\nverde", "\nAzul", "\nAzul-escuro", "\nvioleta"));
        System.out.println(coresArcoIris.toString());
        System.out.println("--------------");
        // Exiba a quantidade de cores que o arco-íris tem:
        System.out.println("Quantidade de cores do arco-íris: " + coresArcoIris.size());
        System.out.println("--------------");
        // Exiba as cores do arco Iris em ordem alfabética
        System.out.println("Cores do arco-íris em ordem alfabética: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);
        System.out.println("--------------");
        // Exiba as cores na ordem inversa
        System.out.println("Cores do arco-íris na ordem inversa: ");
        Set<String> coresArcoIris3 = new LinkedHashSet<>(Arrays.asList("\nVermelho", "\nLaranja", "\nAmarelo", "\nVerde", "\nAzul", "\nAzul-escuro", "\nVioleta"));
        System.out.println(coresArcoIris3);
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris3);
        Collections.reverse(coresArcoIrisList);
        System.out.println(coresArcoIrisList);
        System.out.println("--------------");
        // Exiba todas as cores que comecem com a letra V
        System.out.println("Exiba todas as cores que começam com a letra ”v”: ");
        for (String cor: coresArcoIris) {
            if (cor.startsWith("v")) System.out.println(cor);
        }
        System.out.println("Remova todas as cores que começam com a letra v");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while(iterator2.hasNext()){
            if (iterator2.next().startsWith("v")) iterator2.remove();
        }
        System.out.println(coresArcoIris);

        System.out.println("Limpe o conjunto: ");
        coresArcoIris.clear();
        System.out.println("Verifique se o conjunto está vazio: " + coresArcoIris.isEmpty());
    }
}
