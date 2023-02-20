import java.util.ArrayList;
import java.util.List;

public class ExemploOrdenacao {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("Pietro", 5, "preto"));
            add(new Gato("Jon", 8, "Tigrado"));
            add(new Gato("Mike", 10, "Amarelo"));
        }};
        System.out.println(meusGatos);
    }

     class Gato {
        public String nome;
        public int idade;
        public String cor;   
        
        public Gato(String nome, int idade, String cor){
            this.nome = nome;
            this.idade = idade;
            this.cor = cor;
        }

        public String getNome(){
            return nome;
        }

        public int getIdade(){
            return idade;
        }

        public String getCor(){
            return cor;
        }

        @Override
        public String toString(){
            return "{" +
            "nome=' " + nome + '\'' +
            ", idade=' " + idade +
            ", cor= '" + cor + '\'';
        }
}
}
