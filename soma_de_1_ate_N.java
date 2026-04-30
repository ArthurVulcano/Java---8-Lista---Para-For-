package Lista_for;

import java.util.Scanner;

public class soma_de_1_ate_N {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        int soma = 0;
        System.out.println("Digite seu numero");
        int n = sm.nextInt();
        for (int x = 1; x <= n; x++){
            soma+=x;
            System.out.println("A soma é de : " + soma);
        }
        sm.close();
    }
}
