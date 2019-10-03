import java.util.Scanner;

public class fabrica {

    // numa fabirca, uma maquina precisa de manutenção sempre que o numero de peças defeituosas supera 10%
    // da produção dados os totais de peças produzidas e o total de peças defeituosas, informe se a maquina precisa
    // de anutenção.

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        System.out.println("digite o numero de peças");
        double totalp = m.nextDouble();
        System.out.println("Digite numero de peças defeituosas ");
        double totald = m.nextDouble();
        if (totald / totalp > 0.1) {
            System.out.println("precisa de manutenção");
        } else {
            System.out.println("não precisa de manutenção");
        }
    }
}
