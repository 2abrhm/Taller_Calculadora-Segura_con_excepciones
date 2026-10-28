import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número entero: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el segundo número entero: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el operador (+, -, *, /): ");
            String operador = scanner.nextLine();

            int resultado;
            switch (operador) {
                case "+":
                    resultado = num1 + num2;
                    break;
                case "-":
                    resultado = num1 - num2;
                    break;
                case "*":
                    resultado = num1 * num2;
                    break;
                case "/":
                    resultado = num1 / num2;
                    break;
                default:
                    throw new OperacionInvalidaException("Operador inválido. Use únicamente +, -, * o /.");
            }

            System.out.println("Resultado: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("Error: Entrada inválida. Debe ingresar números enteros válidos.");
        } catch (ArithmeticException e) {
            System.out.println("Error: No es posible dividir entre cero.");
        } catch (OperacionInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
