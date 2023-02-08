import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalculadoraImpl calculadora = new CalculadoraImpl();

        System.out.println("Escolha uma operacao:");
        String operador = scanner.next();

        System.out.println("x:");
        int x = scanner.nextInt();
        System.out.println("y:");
        int y = scanner.nextInt();

        if(operador.equals("+")){
            System.out.println(calculadora.soma(x,y));
        }

        if(operador.equals("-")) {
            System.out.println(calculadora.subtracao(x, y));
        }

        if (operador.equals("*")){
            System.out.println(calculadora.multiplicacao(x,y));
        }

        if (operador.equals("/")){
            System.out.println(calculadora.divisao(x,y));
        }

    }
}