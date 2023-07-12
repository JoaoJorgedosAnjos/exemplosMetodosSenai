package metodos.exercicios.ex002;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MediaSalario mediaSalario = new MediaSalario();
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        int countEmployees;
        double sum = 0;

        System.out.println("Digite o número de funcionários: ");
        countEmployees = scanner.nextInt();

        for (int i = 1 ; i < countEmployees + 1  ; i++){
            System.out.println("Informe o salário " + i  + ":");
            sum += scanner.nextDouble();
        }
        mediaSalario.calcularMediaSalarial(sum, countEmployees);

    }

}
