//Codifique uma função que receba um número natural como entrada e determine se ele
//é par ou não:
import java.util.Scanner;
public class exercicio2 Num{
    public static void main(String args[]){
        System.out.printf("Digite um numro natural? ");
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        if(n % 2 == 0){
            System.out.printf("O numero é par");
        }else{
            System.out.printf("O numero é impa");
        }}