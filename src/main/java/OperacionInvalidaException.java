public class OperacionInvalidaException extends Exception {
    private final String operacion;

    public OperacionInvalidaException(String operacion) {
        super("Operacion no valida: '" + operacion + "'. Use +, -, * o /");
        this.operacion = operacion;
    }

    public String getOperacion() {
        return operacion;
    }
}
