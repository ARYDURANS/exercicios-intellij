//O fatorial de um numero natural n é definido pelo produto 1*2*3*...*n. Codifique uma
//função que receba um numero natural e determine o seu fatorial.



public class exercicio3 {
    public static void main(String[] args) {
public Fatorial (int n){
            numero = n; }
        public void calculaFatorial (){
            int i = numero -1;
            while (i>0){
                numero =numero * i; i--;
            }
        }
        public void imprimeFatorial (){
            System.out.println ("O resultado da fatorial do numero e: "+ numero);
        }
        Fatorial f1 = new Fatorial (10);
        f1.calculaFatorial();
        f1.imprimeFatorial();
    }
}
