//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;


public class Questao1 {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Digite o raio: ");
        double num = S.nextInt();

        double area = Math.PI * (num*num);

        System.out.printf("A área do círculo é: %.1f%n",area);

    }
}
