package Lista_for;

import java.util.Scanner;
public class media_de_5_numeros {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        double soma = 0;
        System.out.println("Digite 5 numeros.");
        for (int x = 1; x <= 5; x++){
             double n = sm.nextDouble();
            soma+=n;
        }
        double media = soma/5;
        System.out.println("Sua media é: " + media);
        sm.close();
    }
}