public class OperacionInvalidaException extends Exception {
    private final String operacion;

    public OperacionInvalidaException(String operacion) {
        super("Operación no válida: '" + operacion + "'. Use +, -, * o /");
        this.operacion = operacion;
    }

    public String getOperacion() {
        return operacion;
    }
}
