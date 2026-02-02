package expresiones_lambda.logica;

@FunctionalInterface
public interface Mensajero {
    public void emitirMensaje(String nombre, int edad);
}
