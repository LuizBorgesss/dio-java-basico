public class Ex13Azulejos {
    public static void main(String[] args) {
        double Hp, Lp, Ha, La, qtd;

        Hp = 2.16;
        Ha = 0.50;
        Lp = 2.0;
        La = 0.75;

        qtd  = (Hp * Lp) / (Ha * La);

        System.out.println("São necessários essa quantidade de azulejos para fechar a parede: " + qtd);
    }
}
