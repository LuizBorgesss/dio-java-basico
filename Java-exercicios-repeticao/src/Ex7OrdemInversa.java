public class Ex7OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {-5, -6, 15, 50, 8, 4};

        // length retorna o tamanho do array

        System.out.print("Vetor: ");
        int count = 0;
        while (count <= (vetor.length-1)) {
            System.out.print(vetor[count] + " ");
            count++;
        }

        System.out.print("\nVetor: ");
        for (int i = (vetor.length -1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
}
}