package metodos.exercicios.ex04;
public class Services {
    protected void mediaAluno(double media) {
        if (media <= 10.0 && media >= 9.0) {
            System.out.println('A');
        } else if (media < 9.0 && media >= 8) {
            System.out.println('B');
        } else if (media < 8.0 && media >= 7) {
            System.out.println('C');
        } else if (media < 7.0 && media >= 6d) {
            System.out.println('D');
        } else if (media < 6 && media >= 0) {
            System.out.println('E');
        } else {
            System.out.println("Digite um nota válida");
        }
    }
}

