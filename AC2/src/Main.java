import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuarCalculando = true;

        while (continuarCalculando) {
            double numero1 = lerNumero("Digite o primeiro número: ");
            char operacao = lerOperacao();
            double numero2 = lerNumero("Digite o segundo número: ");

            double resultado = executarOperacao(numero1, operacao, numero2);
            System.out.println("Resultado: " + resultado);

            System.out.print("Deseja continuar calculando? (S para sim, qualquer outra tecla para sair): ");
            String resposta = scanner.next();
            continuarCalculando = resposta.equalsIgnoreCase("S");
        }

        System.out.println("Calculadora encerrada.");
    }

    public static double lerNumero(String mensagem) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensagem);
        return scanner.nextDouble();
    }

    public static char lerOperacao() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Selecione a operação desejada (+, -, *, /): ");
        return scanner.next().charAt(0);
    }

    public static double executarOperacao(double num1, char operacao, double num2) {
        double resultado = 0;

        switch (operacao) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida.");
        }

        return resultado;
    }
}
