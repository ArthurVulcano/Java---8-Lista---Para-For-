package Lista_for;

import java.util.Scanner;

public class simulador_de_notas_da_turma {
    public static void main(String[] args) {
        Scanner sm = new Scanner(System.in);
        int aprovados = 0;
        int reprovados = 0;

        System.out.println("Olá! Gostaria de acessar o Programa? (Digite 'OK' para iniciar)");
        String l = sm.next();

        if (l.equalsIgnoreCase("OK")) {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Digite a nota do aluno " + i + ":");
                double nota = sm.nextDouble();

                if (nota >= 7.0) {
                    aprovados++;
                } else {
                    reprovados++;
                }
            }


            System.out.println("\n--- Resultado Final ---");
            System.out.println("Quantidade de alunos aprovados: " + aprovados);
            System.out.println("Quantidade de alunos reprovados: " + reprovados);

        } else {
            System.out.println("Programa não inicializado!");
        }

        sm.close();
    }
}