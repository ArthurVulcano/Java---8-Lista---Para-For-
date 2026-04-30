package Lista_for;

import java.util.Scanner;

public class menor_numero_de_5_valores {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("digite seu valor");
        int menor = Integer.MAX_VALUE;
        for (int x = 1; x <=5; x++){
            int n = sm.nextInt();
            if (n < menor){
               menor = n;
            }

        }
        System.out.println("O menor numero é: " + menor);
        sm.close();
    }
}
