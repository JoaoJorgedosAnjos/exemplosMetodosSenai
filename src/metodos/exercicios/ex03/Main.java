package metodos.exercicios.ex03;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
        Services calc = new Services();

        double hp,lp,ha, la, sum = 0;

        System.out.println("Digite a altura da parede: ");
        hp = s.nextDouble();
        System.out.println("Digite a largura da parede");
        lp = s.nextDouble();
        System.out.println("Digite a altura do azulejo");
        ha = s.nextDouble();
        System.out.println("Digite a largura do azulejo");
        la = s.nextDouble();

        System.out.printf("São necessários %f azulejos\n", calc.calcularMedidas(hp,lp,ha,la));
        calc.calcularMedidas1(hp,lp,ha,la, sum);

    }
}
