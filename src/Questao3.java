import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        int num = 0;
        int n = 0;
        Scanner s = new Scanner(System.in);

        while (num >= 0) {
            System.out.println("Digite um número:");
            num = s.nextInt();
            System.out.println("Digite outro número: ");
            n = s.nextInt();
            int maximo = Math.max(num, n);
            int minimo = Math.min(num, n);
            if (num < 0 || n < 0) {
                System.out.println("O maior valor digitado foi" + maximo + " e o menor valor foi " + minimo);

            }
        }
    }
}

