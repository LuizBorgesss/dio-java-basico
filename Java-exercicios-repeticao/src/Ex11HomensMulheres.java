import java.util.Scanner;

public class Ex11HomensMulheres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sexo;
        int qtdMulheres = 0;
        int qtdHomens = 0;
        float altura, somaH = 0, mediaHomens = 0, maior = 0, menor = 0; 

        for (int i = 0; i < 10; i++) {
            System.out.println("Escolha o sexo da pessoa(1 - Homem, 2 - Mulher)");
            sexo = scan.nextInt();
            System.out.println("Digite a altura: ");
            altura = scan.nextFloat();

            if(sexo == 1){
                qtdHomens++;
                somaH = somaH + altura;
            } else if(sexo == 2){
                qtdMulheres++;
            }else{
                System.out.println("Número inválido!!!");
            }
            if (altura > maior) {
                maior = altura;
            } else if(altura < menor){
                menor = altura;
            }
        }
            mediaHomens = somaH / qtdHomens;
            System.out.println("A maior altura do grupo é de " + maior + " m, e a menor é de " + menor + " m");
            System.out.println("A média de altura dos homens é " + mediaHomens + " m");
            System.out.println("O número de mulheres é " + qtdMulheres);
        scan.close();
    }
}
