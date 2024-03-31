package academy.devdojo.LacosDeRepeticao.whiles;

import java.util.Scanner;

public class Aula05DoWhile {
    public static void main(String[] args) {
        String keepGoing = "Sim";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("============Adivinhe o numero==========");
            System.out.println("Player 1 digite um numero: ");
            int num1 = scanner.nextInt();
            System.out.println("Player 2 digite um numero: ");
            int num2 = scanner.nextInt();
            System.out.println("Acertou "+ (num1 == num2));
            System.out.println("----------------------------------------");
            System.out.println("Deseja continuar? \nSim \nNão");
            keepGoing = scanner.next().strip();
        }while (keepGoing.equalsIgnoreCase("Sim"));
    }
}
