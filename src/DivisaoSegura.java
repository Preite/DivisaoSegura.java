import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoSegura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean divisaoRealizada = false;

        while (!divisaoRealizada) {
            try {
                System.out.print("Digite o numerador (inteiro): ");
                int numerador = sc.nextInt();

                System.out.print("Digite o denominador (inteiro e diferente de zero): ");
                int denominador = sc.nextInt();

                if (denominador == 0) {
                    throw new ArithmeticException("O denominador não pode ser zero.");
                }

                int resultado = numerador / denominador;
                System.out.println("Resultado da divisão: " + resultado);

                divisaoRealizada = true;

            } catch (InputMismatchException e) {
                System.out.println("Erro: Insira apenas valores inteiros.");
                sc.nextLine(); // limpa o buffer
            } catch (ArithmeticException e) {
                System.out.println("Erro aritmético: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
            }

            System.out.println("Tentando novamente...\n");
        }

        System.out.println("Programa finalizado com sucesso!");
        sc.close();
    }
}
