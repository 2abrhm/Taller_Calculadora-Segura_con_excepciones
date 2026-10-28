import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer numero entero: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el segundo numero entero: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese el operador (+, -, *, /): ");
            String operacion = scanner.nextLine();

            int resultado;
            switch (operacion) {
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
                    throw new OperacionInvalidaException(operacion);
            }

            System.out.println("Resultado: " + resultado);

        } catch (NumberFormatException e) {
            System.out.println("Error: La entrada debe ser un numero entero válido.");
        } catch (OperacionInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        } finally {
            scanner.close();
        }
    }
}
