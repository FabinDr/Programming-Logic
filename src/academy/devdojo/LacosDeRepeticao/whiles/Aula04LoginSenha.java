package academy.devdojo.LacosDeRepeticao.whiles;

import java.util.Scanner;

public class Aula04LoginSenha {
    public static void main(String[] args) {
        final String login = "Fabio";
        final String senha = "201523";
        Scanner input = new Scanner(System.in);
        boolean exibeLogin = true;
        while (exibeLogin){
            System.out.println("Digite seu usuário: ");
            String loginDigitado = input.next();
            System.out.println("Digite sua senha: ");
            String senhaDigitado = input.next();
            if (login.equals(loginDigitado) && senha.equals(senhaDigitado)){
                System.out.println("ACESSO CONCEDIDO");
                exibeLogin = false;
                break;
            }
                System.out.println("ACESSO NEGADO");

        }
        System.out.println("Programa encerrado");
    }
}
