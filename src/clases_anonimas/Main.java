package clases_anonimas;

public class Main {
    public static void main(String[] args) {
        Animal perro = new Animal () {

            @Override
            public void hacerSonido() {
                System.out.println("Hola yo ladro guau");
            }
        };

        perro.hacerSonido();

        new Vehiculo () {
          private int num_pasajeros;
          public void manejar(){
              System.out.println("Estoy manejando");
          }
        }.manejar();
    }
}
