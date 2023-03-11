import empresa.Persona;
import empresa.Producto;
import ventas.Carrito;
import ventas.ItemCarrito;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)  {
        LectorCSV lectorCSV = new LectorCSV();
        lectorCSV.leerCSV();


        Persona persona = new Persona();
        persona.setNombre("German");
        persona.setApellido("Pistan");
        persona.setFechaDeNacimiento(LocalDate.of(1990,5,23));

        Producto producto = new Producto();
        producto.setNombre("Jabon en Polvo");
        producto.setCodigo("4512354");
        producto.setPrecio(250000.0f);

        Producto producto2 = new Producto();
        producto2.setNombre("Notebook");
        producto2.setCodigo("878785");
        producto2.setPrecio(150000.0f);

        Producto producto3 = new Producto();
        producto3.setNombre("Airpods");
        producto3.setCodigo("4712369");
        producto3.setPrecio(10000.0f);

        ItemCarrito item1 = new ItemCarrito();
        item1.setCantidad(2);
        item1.setProducto(producto);
        item1.setPrecioUnitario(producto.getPrecio());

        ItemCarrito item2 = new ItemCarrito();
        item2.setCantidad(4);
        item2.setProducto(producto2);
        item2.setPrecioUnitario(producto2.getPrecio());

        ItemCarrito item3 = new ItemCarrito();
        item3.setCantidad(1);
        item3.setProducto(producto3);
        item3.setPrecioUnitario(producto3.getPrecio());

        Carrito carro = new Carrito();
        carro.setPersona(persona);
        carro.setFechaCompra(LocalDateTime.now());
        carro.setItem1(item1);
        carro.setItem2(item2);
        carro.setItem3(item3);

        System.out.println("Costo total del carrito: " + carro.precio());



    }
}
