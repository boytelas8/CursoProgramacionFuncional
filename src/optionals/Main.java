package optionals;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional<String> stringNull = Optional.ofNullable(null);

        if(!stringNull.isPresent()){
            System.out.println("El valor es vacío");
        }

        if(stringNull == null){
            System.out.println("El valor es null");
        }

        Optional<String> cadena = Optional.of("Suscribete");
        if(!cadena.isPresent()){
            System.out.println("El valor es vacío");
        }
        else{
            System.out.println("Tiene un valor");
        }

        Optional<String> cadena2 = Optional.empty();
        if(!cadena2.isPresent()){
            System.out.println("es vacía");
        }
        else{
            System.out.println("Tiene un valor");
        }

    }

}
