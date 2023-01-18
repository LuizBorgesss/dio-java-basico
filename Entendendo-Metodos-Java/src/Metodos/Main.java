package Metodos;

public class Main {
    public static void main(String[] args) {

        // Método calculadora
        System.out.println("EXERCICIO CALCULADORA");
        Calculadora.soma(10, 30);
        Calculadora.subtracao(15, 10);
        Calculadora.divisao(20, 5);
        Calculadora.multiplicacao(50, 100);
        
        // Método Obter mensagem
        System.out.println("EXERCICIO MENSAGEM");
        Mensagem.obterMensagem(6);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(22);
    
        // Método Emprestimo
        System.out.println("EXERCICIO EMPRÉSTIMO");
        Emprestimo.calcular(10000, 3);
    }

}
