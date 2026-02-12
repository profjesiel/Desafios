package desafios;
/*
Crie um programa que represente três
ninjas da Vila da Folha (Konoha) de "Naruto"
e suas respectivas missões.
Cada ninja tem um nome, uma idade e uma
missão atribuída a ele, com o nome da
missão, nível de dificuldade e status de
conclusão.

*/
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ninjas = new String[3];
        int[] idade = new int[ninjas.length];
        int[] nivelDificuldade = new int[ninjas.length];
        boolean status = false;


        for (int i = 0; i < ninjas.length; i++) {
            System.out.println("Entre com o nome do " + (i + 1) + "º ninja: ");
            ninjas[i] = sc.nextLine();
            System.out.println("Qual Idade: ");
            idade[i] = sc.nextInt();
            System.out.println("Qual Nivel de Dificuldade: ");
            nivelDificuldade[i] = sc.nextInt();
            sc.nextLine();
        }


        for (int i = 0; i < ninjas.length; i++) {
            if (idade[i] >= 15) {
                System.out.println("Dados do " + (i + 1) + "º ninja: ");
                System.out.println("\n Nome: " + ninjas[i]
                        + "\nIdade: " + idade[i]
                        + "\nDificuldade: " + nivelDificuldade[i]);
                System.out.println("\nQualquer missão pode ser Concluída");
                status = true;
            } else {
                System.out.println("Dados do " + (i + 1) + "º ninja: ");
                System.out.println("\nNome: " + ninjas[i]
                        + "\nIdade: " + idade[i]
                        + "\nDificuldade: " + nivelDificuldade[i]);
                System.out.println("\nMissões Concluídas somente C e D");
            }
            System.out.println(" -----------------------------------");
        }

        sc.close();
    }

}
