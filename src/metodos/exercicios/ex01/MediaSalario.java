package metodos.exercicios.ex01;

public class MediaSalario {
    protected double calcularMediaSalarial(double sal1, double sal2, double sal3){
        return  (sal1 + sal2 + sal3)/3;
    }

    protected void calcularMediaSalarial2(double salario){
        System.out.println("o Valor da média salarial é: " + (salario)/3);
    }
}