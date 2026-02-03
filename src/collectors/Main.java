package collectors;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        //Collectors.toList
        List<String> nombres = List.of("Luisina", "Ibra", "Suscribete", "TodoCode");
        List<String> nombresConA = nombres.stream()
                .filter(n -> n.contains("a"))
                .collect(Collectors.toList());

        System.out.println(nombresConA);
        System.out.println("\n");

        //Collectors.toSet
        List<String> lenguajes = List.of("java", "phyton", "java", "PHP", "javascript");
        Set<String> sinRepetidos = lenguajes.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());

        System.out.println(sinRepetidos);
        System.out.println("\n");

        //Collectors.joining
        List<String> sgbds = List.of("MySQL", "Oracle", "PostgreSQL");
        String listaTecnologias = sgbds.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(" | "));

        System.out.println(listaTecnologias);
        System.out.println("\n");


        //Collectors.counting
        List<String> paises = List.of("Lituania", "España", "Argentina", "Laos", "Perú", "México");
        Long cantidadConL = paises.stream()
                .filter(n -> n.startsWith("L"))
                .collect(Collectors.counting());

        System.out.println("Cantidad de paises con L: " + cantidadConL);
        System.out.println("\n");


        //Collectors.partitioningBy
        List<Integer> edades = List.of(13,15,20,21,35,33,32,48,57,12,10);
        Map<Boolean, List<Integer>> mayores = edades.stream()
                .collect(Collectors.partitioningBy(e -> e>=18));

        System.out.println(mayores);

    }

}
