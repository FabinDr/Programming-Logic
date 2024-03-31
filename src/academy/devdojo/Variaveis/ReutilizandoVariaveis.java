package academy.devdojo.Variaveis;

public class ReutilizandoVariaveis {
    public static void main(String[] args){
        double salario = 5000.00F;
        double porcentagem = 30;
        double resultado = salario * (porcentagem/100);
        System.out.println("30% do salário é igual a: "+resultado);
        // academy.devdojo.Variaveis.Porcentagem com 15%
        porcentagem = 15;
        resultado = salario * (porcentagem/100);
        System.out.println("15%  do salário é igual a: "+resultado);
        // academy.devdojo.Variaveis.Porcentagem 5%
        porcentagem = 5F;
        resultado = salario * (porcentagem/100);
        System.out.println("5%  do salário é igual a: "+resultado);

    }
}
