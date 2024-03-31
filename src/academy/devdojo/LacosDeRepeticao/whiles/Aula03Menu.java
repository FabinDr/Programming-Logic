package academy.devdojo.LacosDeRepeticao.whiles;

import java.util.Scanner;

public class Aula03Menu {
    public static void main(String[] args) {
        int escolha = 0;
        Scanner input = new Scanner(System.in);
        while (escolha != 3) {
            System.out.println("1. Calcular imposto \n2. Depositar Salario \n3. Sair \nO que deseja realizar? ");
            escolha = input.nextInt();
            switch (escolha) {
                case 1 -> {
                    System.out.println("Calcular imposto");
                    escolha = input.nextInt();
                }
                case 2 -> {
                    System.out.println("Depositar Salario");
                    escolha = input.nextInt();
                }
                case 3 -> System.out.println("Sair");
            }
        }

    }
}

