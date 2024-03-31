package academy.devdojo.EstruturasCondicionais.ifelse;

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Cadastre o nome de usuario: ");
        String Login = input.nextLine();

        if (Login.equals("") || Login.equalsIgnoreCase("admin") || Login.equalsIgnoreCase("administrador")){
            System.out.println("Usuário inválido");
        }else
            System.out.println(Login + "Cadastrado com sucesso");

    }
}
