package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        nombres.add("Suscribete");
        nombres.add("A TodoCode");
        nombres.add("ahora");

        nombres.stream().forEach(System.out::println);

        List<String> paises = Arrays.asList(
                "España", "Mexico", "Argentina", "Francia", "Italia",
                "Alemania", "Portugal", "Chile", "Colombia", "Perú");

        System.out.println("\n");

        paises.stream()
                .filter(pais -> pais.toLowerCase().contains("a"))
                .forEach(System.out::println);
    }

}
