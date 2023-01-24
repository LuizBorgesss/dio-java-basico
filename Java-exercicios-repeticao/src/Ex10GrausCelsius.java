public class Ex10GrausCelsius {
    public static void main(String[] args) {
        double C, K, F, Re, Ra;

         C = 26.5;
         
         F = C * 1.8 + 32;
         K = C + 273.15;
         Re = C * 0.8;
         Ra = C * 1.8 + 32 + 459.67;

         System.out.println("A temperatura em Fahrenheit é: " + F);
         System.out.println("A temperatura em Kelvin é: " + K);
         System.out.println("A temperatura em Reaumur é: " + Re);
         System.out.println("A temperatura em Rankine é: " + Ra);
    }
}
