import java.util.Scanner;

public class dolar {

    public static void main(String[] args) {

        Scanner d = new Scanner(System.in);

        System.out.println("Digite um valor");
        double numero = d.nextInt();

        double dolar =  numero * 4.15;

        System.out.println(" a conversão do valor digitado é " + dolar );


    }



}
