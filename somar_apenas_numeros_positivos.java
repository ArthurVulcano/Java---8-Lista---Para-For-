package Lista_for;

import java.util.Scanner;

public class somar_apenas_numeros_positivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 6 números");
        int soma = 0;
        for (int x=1; x<6; x++){
            int n = sc.nextInt();
            if (n>0){
                soma+=n;
            }
        }
        System.out.println("Resultado da soma: "+soma);
        sc.close();
    }
}
