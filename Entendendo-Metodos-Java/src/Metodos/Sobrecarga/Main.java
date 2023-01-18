package Metodos.Sobrecarga;

public class Main {
    public static void main(String[] args) {
        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = ExAreaPoligono.areaPoligonos(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = ExAreaPoligono.areaPoligonos(5,5);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = ExAreaPoligono.areaPoligonos(7,8,9);
        System.out.println("Área do trapézio:" + areaTrapezio);
    }
}
