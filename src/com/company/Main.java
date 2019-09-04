package com.company;

import java.util.Scanner;

public class papelaria
{

    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in)	;
     int copias;
        System.out.println("informe a quantidade de copias");
        copias = sc.nextInt();
        double totalpago;
        if(copias <=100){
            totalpago=copias*0.25;
        }
        else {totalpago=copias*0.20;
        }
        System.out.println ("o valor pago é R$ + totalpago");
    }



}
