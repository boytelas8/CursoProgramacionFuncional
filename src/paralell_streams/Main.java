package paralell_streams;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] numeros = {1,2,3,4,5,6,7,8,9,10};

        //Stream secuencial
        Long tiempoInicio = System.nanoTime();
        Arrays.stream(numeros).forEach(n -> System.out.println("Secuencial " + n));
        Long tiempoFin = System.nanoTime();
        System.out.println("Tiempo secuencial: " + (tiempoFin - tiempoInicio) + " nanosegundos");

        System.out.println("\n");

        //Paralell stream
        tiempoInicio = System.nanoTime();
        Arrays.stream(numeros).parallel().forEach(n -> System.out.println("Secuencial " + n));
        tiempoFin = System.nanoTime();
        System.out.println("Tiempo secuencial: " + (tiempoFin - tiempoInicio) + " nanosegundos");
    }
}
