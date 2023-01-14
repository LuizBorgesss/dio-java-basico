import java.util.Scanner;

public class Ex1NomeEIdade {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        String nome; 
        

        while(true){
            System.out.println("Nome: ");
            nome = scan.next();
            if(nome.equals("0")) break;
            
        }
        
        System.out.println("Continua aqui...");

        scan.close();
    }
}
