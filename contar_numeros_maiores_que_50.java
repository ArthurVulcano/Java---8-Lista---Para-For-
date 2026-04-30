package Lista_for;

import java.util.Scanner;

public class contar_numeros_maiores_que_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 8 números");
        int maior = 0;
        for (int x=1; x<8; x++){
            int n = sc.nextInt();
            if (n>50){
                maior++;
            }
        }
        System.out.println("Números maiores que 50: "+maior);
        sc.close();
    }
}
