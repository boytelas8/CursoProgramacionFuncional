package referencia_a_metodos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //Referencia a metodos estaticos
        Function<Integer, String> convertidor = String::valueOf;
        String resultado = convertidor.apply(35);
        System.out.println("El resultado es: " + resultado);

        //Referencia a un método de instancia de un objeto
        Persona perso = new Persona();
        perso.nombre = "Suscribete";

        Runnable saludo = perso::saludar;
        saludo.run();

        //Referencia a un constructor
        BiFunction<String, Double, Persona> crearPersona = Persona::new;
        Persona perso2 = crearPersona.apply("Luisina", 1.67);

        System.out.println("La persona es: " + perso2);

        //Referencia a un método de instancia de un objeto arbitrario
        List<Persona> personas = new ArrayList<>();
        personas.add(new Empleado());
        personas.add(new Gerente());
        personas.add(new Empleado());
        personas.add(new Gerente());

        personas.forEach(Persona::saludar);





    }
}
