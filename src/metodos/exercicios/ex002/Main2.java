package metodos.exercicios.ex002;

import java.util.Locale;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        MediaSalario mediaSalario = new MediaSalario();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de salários: ");
        int qtSalario = scanner.nextInt();

        double qt[] = new double[qtSalario];

        double soma = 0;
        for (int i = 0; i < qt.length; i++){
            System.out.println("Informe o " + (i+1)+ " salario");
            qt[i] = scanner.nextDouble();
            soma += qt[i];
        }
        mediaSalario.calcularMediaSalarial(soma, qtSalario);
    }
}
