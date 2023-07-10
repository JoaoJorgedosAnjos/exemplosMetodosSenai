package metodos;

public class Main {
    public static void main(String[] args) {
        Metodos metodo = new Metodos();

        metodo.somNumero();

        metodo.multiplicador(5,8);

        //duas formas de trabalhar com metodo com return
        double resultado = metodo.divisao(15.5,8);
        System.out.println( resultado);
        System.out.println( metodo.divisao(15,3));
    }
}
