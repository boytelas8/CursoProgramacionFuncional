package expresiones_lambda;

import expresiones_lambda.logica.Mensajero;
import expresiones_lambda.logica.Operador;

public class Main {

    public static void main(String[] args) {

       /*Mensajero lambdaMsje = (nombre, edad) -> {
           System.out.println("Hola desde lambda " + nombre);
           System.out.println("Su edad es: " + edad);
       };
       lambdaMsje.emitirMensaje("TodoCode", 33);*/

        //Operacion resuelta con clases anonimas
        Operador suma = new Operador() {
            @Override
            public int operar(int num1, int num2) {
                return num1 + num2;
            }
        };

        System.out.println("Suma anónima " + suma.operar(3,5));


        //Operacion resuelta con lambdas
        Operador suma2 = (num1, num2) -> (num1 + num2);
        System.out.println("Suma lambda " + suma2.operar(4,5));

    }

}
