import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioProposto1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List <Double> temperaturaSemestral = new ArrayList<Double>();

        double soma = 0.0;
        for (int i = 1; i <= 6 ; i++) {
            System.out.println("Qual a temperatura do mês: " + i + ":");
            double temp = scan.nextDouble();
            temperaturaSemestral.add(temp);
            soma += temp;
        }
        double mediaTemperaturaSemestral = soma/temperaturaSemestral.size();
        System.out.println("Temperatura semestral: " + temperaturaSemestral);
        System.out.println("Media de temperatura semestral: " + mediaTemperaturaSemestral);
        System.out.println("----------------");

        for(double temp : temperaturaSemestral){
            if (temp > mediaTemperaturaSemestral){
                int index = temperaturaSemestral.indexOf(temp);
                switch (index){
                    case 0:
                        System.out.println((index + 1) + " - JANEIRO: " + temp + " oC");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp+ " oC");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + temp+ " oC");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp+ " oC");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp+ " oC");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp+ " oC");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
