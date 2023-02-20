import java.util.*;

public class ExercicioProposto2 {
    public static void main(String[] args) {
        System.out.println("--\tOrdem Aleatória:\t--");
        Set<LinguagemFavorita> linguagensProgramacao = new HashSet<>(){{
            add(new LinguagemFavorita("Java",1995, "IntelliJ"));
            add(new LinguagemFavorita("JavaScript",1996, "Visual Studio Code"));
            add(new LinguagemFavorita("C#",2000, "Visual Studio"));
        }};
        for (LinguagemFavorita linguagemFavorita : linguagensProgramacao) System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());

        System.out.println("--\tOrdem de inserção\t--");
        Set<LinguagemFavorita> linguagensProgramacao1 = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java",1995, "IntelliJ"));
            add(new LinguagemFavorita("JavaScript",1996, "Visual Studio Code"));
            add(new LinguagemFavorita("C#",2000, "Visual Studio"));
        }};
        for (LinguagemFavorita linguagemFavorita : linguagensProgramacao1) System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());

        System.out.println("--\tOrdem Natural(nome)\t--");
        Set<LinguagemFavorita> linguagensProgramacao2 = new TreeSet<>(linguagensProgramacao1);
        for (LinguagemFavorita linguagemFavorita : linguagensProgramacao2) System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());

        System.out.println("--\tOrdem Ide\t--");
        Set<LinguagemFavorita> linguagensProgramacao3 = new TreeSet<LinguagemFavorita>(new ComparatorIde());
        linguagensProgramacao3.addAll(linguagensProgramacao);
        for (LinguagemFavorita linguagemFavorita : linguagensProgramacao3) System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
    }
}
class LinguagemFavorita implements Comparable<LinguagemFavorita>{
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }
    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return nome.equals(that.nome) && anoDeCriacao.equals(that.anoDeCriacao) && ide.equals(that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.nome.compareTo(linguagemFavorita.nome);
    }
}
class ComparatorIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita I1, LinguagemFavorita I2) {
        int Ide = I1.getIde().compareTo(I2.getIde());
        if(Ide != 0) return Ide;
        return Integer.compare(I1.getAnoDeCriacao(), I2.getAnoDeCriacao());
    }
}

