import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro:");
        int param1 = scanner.nextInt();

        System.out.println("Digite o segundo parâmetro:");
        int param2 = scanner.nextInt();

        scanner.close();

        try {
            count(param1, param2);
        } catch (ParametrosInvalidosException e) {
            System.out.println("Parâmetro 1 não pode ser maior que parâmetro 2!");
        }
    }
    public static void count(int param1, int param2) throws ParametrosInvalidosException {
        int counting = param2 - param1;

        if (param1 > param2)
            throw new ParametrosInvalidosException();

        for (int index = 0; index < counting; index++) {
            System.out.println("Imprimindo o número " + index);
        }
    }
}
