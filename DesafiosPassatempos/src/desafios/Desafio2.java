/*
Você foi encarregado pelo Hokage para gerenciar o
cadastro de ninjas na Vila da Folha. Sua missão é criar
um sistema simples em Java para cadastrar novos
ninjas e listar todos os ninjas cadastrados.
Tópicos a serem utilizados:
Arrays: Para armazenar os nomes dos ninjas.
Switch Cases: Para implementar um menu
interativo.
Loops: Para navegar pelas opções do menu e
iterar sobre os ninjas cadastrados.
Condicionais: Para controlar a execução das
opções do menu e validar o número de ninjas
cadastrados.

* */
package desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int qtdNinjas = 0;
        int op = 0;
        boolean controle = false;

        System.out.println("Deseja cadastrar quantos ninjas?");
        qtdNinjas = sc.nextInt();
        sc.nextLine();

        String[] nomeNinjas = new String[qtdNinjas];

        while (true){
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    if (!controle) {
                        for (int i = 0; i < qtdNinjas; i++) {
                            System.out.println("Qual o nome do " + (i + 1) + "º Ninja?");
                            nomeNinjas[i] = sc.nextLine();
                            controle = true;
                        }
                    }else {
                        System.out.println("Já tem nomes cadastrados, deseja sobrescrever? [S / N]");
                        String resposta = sc.nextLine();
                        if(resposta.equalsIgnoreCase("S")){
                            for (int i = 0; i < qtdNinjas; i++) {
                                System.out.println("Qual o nome do " + (i + 1) + "º Ninja?");
                                nomeNinjas[i] = sc.nextLine();
                            }
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < nomeNinjas.length; i++) {
                        System.out.println("Nome do "+(i+1)+"º Ninja: " + nomeNinjas[i]);
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opção Inválida!");

            }
        }
    }
}
