package Lista_for;

import java.util.Scanner;

public class fatorial_simples {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite seu numero para saber seu fatorial");
        int n = sm.nextInt();
        long fat = 1;
        for (int i = 1; i <= n; i++){
            fat *= i;
            System.out.println("Seu fatorial é: "  + fat);
        }
        sm.close();

        }
    }

