package Metodos;

import java.util.Scanner;

public class ExMesada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int entrada;
        entrada = scan.nextInt();
        System.out.println("Por quantos mesês você vai querer juntar seu dinheiro ? " + entrada);
        int mesada = 50;
        System.out.println("Se você juntar o seu dinheiro por " + entrada + " meses " + " Você terá = " + entrada * mesada + " reais");
        
        scan.close();
    }
    }

