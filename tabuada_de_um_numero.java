package Lista_for;

import java.util.Scanner;

public class tabuada_de_um_numero {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        System.out.println("Digite seu numero para saber sua tabuada: ");
        int n = sm.nextInt();
        for (int x = 1; x <= 10; x++){
            int mut = x * n;
            System.out.println("A sua multiplicação é: " + mut);
        }
    }
}
