package Lista_for;

public class sequencia_de_fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println("Sequencia de Fibonacci");
        for (int x=1; x<11; x++){
            System.out.println(a+"");
            int proximo = a+b;
            a=b;
            b = proximo;
        }
    }
}
