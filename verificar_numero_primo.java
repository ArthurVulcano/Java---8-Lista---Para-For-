package Lista_for;

import java.util.Scanner;
public class verificar_numero_primo {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite seu numero:");
        int n = sm.nextInt();
        int cont = 0;
        for (int i = 1; i <= n; i++){

            if (n % i == 0){
                cont++;

            }

            }
        if (cont == 2){
            System.out.println("Seu numero é primo: " + n);

        }
        else{
            System.out.println("Não é primo");

        }
        sm.close();


    }
}
