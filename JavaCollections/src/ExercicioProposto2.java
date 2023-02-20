import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> respostas = new ArrayList<String>();

        // Perguntas para o investigado
        System.out.println("Perguntas: ");

        System.out.println("\n1. Telefonou para a vítima?");
        String resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("\n2. Esteve no local do crime?");
         resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("\n3. Mora perto da vítima?");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("\n4. Devia para a vítima?");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println("\n5. Já trabalhou com a vítima?");
        resposta = scan.next();
        respostas.add(resposta.toLowerCase());

        System.out.println(respostas);

        int count = 0;
        Iterator<String> contador = respostas.iterator();
        while(contador.hasNext()){
            String resp = contador.next();
            if(resp.contains("s")){
                count++;
            }
        }
        switch(count) {
            case 2:
                System.out.println(">> SUSPEITA <<"); break;
            case 3:
            case 4:
                System.out.println(">> CÚMPLICE <<"); break;
            case 5:
                System.out.println(">> ASSASSINO <<"); break;
            default:
                System.out.println(">> INOCENTE <<"); break;
        }
    }
}
