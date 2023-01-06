package Luiz.edu.primeiraSemana;
public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 7;
        if (mediaFinal < 6)
            System.out.println("Aluno Reprovado");
        else if(mediaFinal == 6)
            System.out.println("Prova de Recuperação");
        else 
            System.out.println("Aluno Aprovado");
    }
}
