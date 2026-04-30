package Lista_for;

import java.util.Scanner;

public class maior_numero_de_5_valores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 5 números");
        int maior = Integer.MIN_VALUE;
        for (int x = 1; x <=5; x++ ) {
            int n = sc.nextInt();
            if (n > maior){
                maior = n;
        }
        }
        System.out.println("O maior numero é: " + maior);
        sc.close();
    }
}

