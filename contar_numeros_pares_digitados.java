package Lista_for;

import java.util.Scanner;

public class contar_numeros_pares_digitados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 10 números");
        int n = 0;
        int par = 0;
        for (int x = 1; x<10; x++){
            n = sc.nextInt();
            if (n%2 ==0){
               par++;
            }
        }
        System.out.println("Números pares: " +par);
        sc.close();
    }
}
