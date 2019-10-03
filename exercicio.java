import java.util.Scanner;

class papelaria
{
    // em uma papelaria  até 100 folhas, custa R$025, e acima de 100 folhas, custa R$0,20. Dado o total de copias, informe o total a ser pago.

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in)	;
        int copias;
        System.out.println("informe a quantidade de copias");
        copias = sc.nextInt();
        double totalpago;
        if(copias <=100) {  // (se = if) for menor ou igual a 100
            totalpago=copias*0.25;  // o total de copias sera multiplicado por 0,25
        } else {
            totalpago=copias*0.20; // ( se não = else) o total de copias sera multiplicado por 0,20
        }
        System.out.println ("o valor pago é R$ + totalpago  = " + totalpago);
    }



}


