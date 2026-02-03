package ejercicio_integrador_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Auto> listaAutos = Arrays.asList(

                new Auto("Volkswagen", "Amarok", 25000),
                new Auto("Volkswagen", "Taos", 32000),
                new Auto("Chevrolet", "Onix", 22000),
                new Auto("Chevrolet", "Tracker", 32000),
                new Auto("Fiat", "Chronos", 21000),
                new Auto("Fiat", "Pulse", 24000),
                new Auto("Toyota", "Corolla", 28000),
                new Auto("Toyota", "Yaris", 23000),
                new Auto("Renault", "Stepway", 20000),
                new Auto("Toyota", "Duster", 27000),
                new Auto("Nissan", "Versa", 25000)
        );

        //1.- Ordenar por precio de menor a mayor mediante sort
        List<Auto> ordenPrecio = new ArrayList<Auto>(listaAutos);
        ordenPrecio.sort(Comparator.comparing(Auto::getCosto));
        ordenPrecio.forEach(System.out::println);

        System.out.println("\n");

        //2.- Ordenar por marca y luego por precio usando sorted() usando streams
        listaAutos.stream()
                .sorted(Comparator
                        .comparing(Auto::getMarca)
                        .thenComparing(Auto::getCosto))
                .forEach(System.out::println);

        System.out.println("\n");

        //3.- Autos cuyo precio no supere los 23000, usando streams y lambdas
        listaAutos.stream()
                .filter(auto -> auto.getCosto()<=23000)
                .forEach(System.out::println);

        System.out.println("\n");

        //4.- Autos de marca Chevrolet o Volkswagen
        listaAutos.stream()
                .filter(auto -> auto.getMarca().equals("Chevrolet") || auto.getMarca().equals("Volkswagen"))
                .forEach(System.out::println);

        System.out.println("\n");

        //5.- Autos cuyo modelo contiene al menos una "a"
        listaAutos.stream()
                .filter(auto -> auto.getModelo().toLowerCase().contains("a"))
                .forEach(System.out::println);

    }

}
