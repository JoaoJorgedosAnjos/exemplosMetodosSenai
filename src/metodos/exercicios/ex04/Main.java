package metodos.exercicios.ex04;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
        Services m = new Services();
        double nota;

        System.out.println("Digite a nota do aluno: ");
        nota = s.nextDouble();
        m.mediaAluno(nota);
    }
}