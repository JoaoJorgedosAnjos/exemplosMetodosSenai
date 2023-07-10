package metodos.exercicios.ex01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MediaSalario mediaSalario = new MediaSalario();
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3, soma = 0;

        System.out.println("Digite o valor do salário 1: ");
        num1 = scanner.nextDouble();
        System.out.println("Digite o valor do salário 3: ");
        num2 = scanner.nextDouble();
        System.out.println("Digite o valor do salário 2: ");
        num3 = scanner.nextDouble();

        System.out.println(mediaSalario.calcularMediaSalarial(num1, num2, num3));

        for (int i = 0; i < 3; i++){
            System.out.println("Informe o salário"+i);
            soma += scanner.nextByte();
        }
        mediaSalario.calcularMediaSalarial2(soma);
    }
}
