import java.util.Scanner;

    public class Questao2 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Digite um número:");
            int num = s.nextInt();

            if (num > 0){
                System.out.printf("O número %d é positivo.", num);
            }else {
                System.out.printf("O número %d é negativo.", num);
            }
        }
    }

