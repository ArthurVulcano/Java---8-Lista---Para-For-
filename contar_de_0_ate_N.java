package Lista_for;

import java.util.Scanner;

public class contar_de_0_ate_N {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite seu numero");
         int n = sm.nextInt();
        for (int x = 0; x <= n; x++){
            System.out.println("Os numeros são: " + x);
        }
    }
}
