package ejercicio_integrador_final;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Producto> productos = Arrays.asList(
                new Producto("Manzana", "frutas", 1, 2.5),
                new Producto("Leche", "lacteos", 2, 1.2),
                new Producto("Pan", "panaderia", 5, 1.0),
                new Producto("Yogurt", "lacteos", 3, 1.8),
                new Producto("Pera", "frutas", 4, 3.0),
                new Producto("Naranja", "frutas", 6, 2.0),
                new Producto("Queso", "lacteos", 2, 3.5),
                new Producto("Manteca", "lacteos", 1, 2.2),
                new Producto("Harina", "panaderia", 3, 1.5),
                new Producto("Arroz", "alimentos", 4, 1.8),
                new Producto("Tomate", "frutas", 5, 1.2),
                new Producto("Lechuga", "verduras", 2, 0.9),
                new Producto("Pescado", "pescaderia", 1, 4.0),
                new Producto("Pollo", "carnes", 3, 5.0),
                new Producto("Carne", "carnes", 2, 6.5)
        );

        //1.- filtrar productos de la categoria frutas
        List<Producto> frutas = productos.stream()
                .filter(p -> p.getCategoria().equals("frutas"))
                .collect(Collectors.toList());

        System.out.printf("\n 1.- Productos que son frutas: " + frutas);

        //2.- Calcular el precio total de los productos en "lacteos"
        double totalLacteos = productos.stream()
                .filter(p -> p.getCategoria().equals("lacteos"))
                .mapToDouble(Producto::getPrecio)
                .sum();

        System.out.println("\n 2.- La suma total de los precios de los lacteos: " + totalLacteos);

        //3.- Obtener el producto con el precio mas bajo
        Producto prodMasBarato = productos.stream()
                .min(Comparator.comparingDouble(Producto::getPrecio))
                .orElse(null);

        System.out.println("\n 3.- El producto mas barato es: " + prodMasBarato);

        //4.- Agrupar productos por categoria
        Map<String, List<Producto>> prodPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(Producto::getCategoria));

        System.out.println("\n 4.- Productos agrupados por categoria: " + prodPorCategoria);

        //5.- Calcular el precio promedio de los productos por categoria
        Map<String, Double> promedioPorCategoria = productos.parallelStream()
                .collect(Collectors.groupingBy(Producto::getCategoria, Collectors.averagingDouble(p -> p.getPrecio())));

        System.out.println("\n 5.- El precio por cateogoria es: " + promedioPorCategoria);


        //6.- Obtener la categoria con el precio promedio mas alto
        String categoriaMasCara = promedioPorCategoria.entrySet().parallelStream()
                .max(Comparator.comparingDouble(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse("No disponible");

        System.out.println("\n 6.- Categoria con el precio promedio mas alto es: " + categoriaMasCara);
    }
}
