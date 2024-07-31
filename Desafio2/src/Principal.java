import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws Exception {

        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        Calculadora calculo = new Calculadora();

        System.out.println("Informe o número que será multiplicado");
        calculo.numero = scan.nextDouble();

        System.out.println(calculo.multiplicaNumero());

    }
}
