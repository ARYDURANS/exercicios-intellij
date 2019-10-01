import javax.swing.*;
import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {

        Scanner l = new Scanner(System.in);

        System.out.print("Digite a sua idade:");
        String idade = l.next();


        System.out.print("Digite seu nome:");
        String nome = l.next();

        System.out.println("seu nome é:" +nome + "e sua idade é: " + idade);




    }
}
