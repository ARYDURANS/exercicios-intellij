import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);

        System.out.println("digite a medida");
        double a = d.nextDouble();
        System.out.println(" digite a medida");
        double b = d.nextDouble();
        System.out.println("digite  a medida");
        double c = d.nextDouble();

        if (a == b && b == c) {
            System.out.println(" triangulo equilatero");
        }else {

            if ( (a == b  && b !=c) || (a == c  && b != c) || (b == c  && a != c)  ){
                System.out.println(" triangulo isoceles");

            }else if (a != b && b != c){
              System.out.println(" e escaleno");


                }
            }
          }
        }
