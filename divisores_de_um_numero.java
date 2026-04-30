package Lista_for;

import java.util.Scanner;

public class divisores_de_um_numero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int n = sc.nextInt();
        System.out.println("Divisores de " + n + ":");
        for (int x =1;x<n;x++){
            if (n%x==0){
                System.out.println(x+"");

            }
        }
        sc.close();
    }
}
