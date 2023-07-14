package metodos.exercicios.ex002;

import java.text.DecimalFormat;

public class MediaSalario {
    protected void calcularMediaSalarial(double salario, int count){
        DecimalFormat decimalFormat = new DecimalFormat("##,####.00");//ou "##,###.##"

        System.out.println("o Valor da média salarial é:R$ " + decimalFormat.format(salario/count));
    }
}
