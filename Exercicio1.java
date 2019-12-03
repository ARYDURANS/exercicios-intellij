
//Codifique uma função que receba um número natural n como entrada e exiba uma
//contagem regressiva de n até 0:

public class Exercicio1 {
    import java.util.Scanner;

       {
        public static void main(String[] args)
        {
            int n;
            int num = 0;

            Scanner ler = new Scanner(System.in);

            System.out.printf("Digite um numero natural?: ");
            n = ler.nextInt();

            if (n<=0){

                System.out.printf("não tem contagem");

            }else{

                for (num <= n; mun++){

                    System.out.printf(num - n);

                }
            }

        }
    }
}
