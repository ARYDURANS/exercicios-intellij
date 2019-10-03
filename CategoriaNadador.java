import java.util.Scanner;

public class CategoriaNadador {
      //  Dada a idade de um nadador, informe a sua categoria
      //  infantil ( até 10 anos)
      //  juvenil  ( até 17 anos)
      //  senior   ( acima de 17 anos)
    public static void main(String[] args) {

        Scanner capturador = new Scanner(System.in);

        System.out.println("digite a sua idade");
        int idade = capturador.nextInt();

        if ( idade <= 10){
            System.out.println("Infantil");
        } else if ( idade <= 17){
            System.out.println("Juvenil");
        } else {
            System.out.println("Senior");
        }



    }

}






