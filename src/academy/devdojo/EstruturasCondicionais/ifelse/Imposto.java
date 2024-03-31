package academy.devdojo.EstruturasCondicionais.ifelse;

public class Imposto {
    public static void main(String[] args) {
        double salario = 3000.00;
        if(salario > 4500){
            double porcentagem = 30;
            double resultado = salario * (porcentagem/100);
            System.out.println("30% do Salário é: " + resultado);
        }
        else{
            double Porcentagem2 = 15;
            double Resultado2 = salario * (Porcentagem2/100);
            System.out.println("15% do salário é: " + Resultado2);


        }

    }
}

