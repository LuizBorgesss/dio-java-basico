package Metodos.Sobrecarga;

public class ExAreaPoligono {
    public static double areaPoligonos(double lado) {
        
        return lado * lado;
        // System.out.println("Área quadrado = " + lado * lado);
    }

    public static double areaPoligonos(double base, double altura) {
        
        return base * altura;
        // System.out.println("Área retângulo = " + base * altura);
    }

    public static double areaPoligonos(double baseMaior, double baseMenor, double altura) {
        
        return (baseMaior + baseMenor) * altura /2;
       // System.out.println("Área Trapézio = " + (baseMaior + baseMenor) * altura/2);
    }
}

