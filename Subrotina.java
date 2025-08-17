import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double percentualDesconto = 0;

        System.out.println("Digite o valor do seu sálario bruto: ");
        double salarioBruto = sc.nextDouble();

        percentualDesconto = ifpercentualDesconto(salarioBruto, percentualDesconto);

        calculoSalario(salarioBruto, percentualDesconto);

        sc.close();
    }

    private static double ifpercentualDesconto(double salarioBruto, double percentualDesconto) {

        if (salarioBruto <= 2000) {
            percentualDesconto = 0;
        } else if (salarioBruto < 4000) {
            percentualDesconto = 2;
        } else if (salarioBruto > 4000) {
            percentualDesconto = 4;
        }else {
            percentualDesconto = 400;
        }

        return percentualDesconto;
    }

    private static void calculoSalario(double salarioBruto, double percentualDesconto) {

        double valorDesconto = (salarioBruto * percentualDesconto / 100);
        double salarioLiquido = (salarioBruto - valorDesconto);

        System.out.println("Seu desconto é: R$ " + valorDesconto);
        System.out.println("O valor do sálario liquído é: R$ " + salarioLiquido);

        if (valorDesconto < 400 && percentualDesconto == 0) {
            System.out.println("Tipo desconto: Isento!");
        } else if (valorDesconto < 400 && percentualDesconto == 2) {
            System.out.println("Tipo desconto: Mínimo!");
        } else if (valorDesconto < 400 && percentualDesconto == 4) {
            System.out.println("Tipo desconto: Médio!");
        } else  {
            System.out.println("Tipo desconto: Máximo!");
        }

    }
}
