import empresa.Persona;
import empresa.Producto;
import ventas.Carrito;
import ventas.ItemCarrito;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        String archivo="C:\\Users\\Carolina\\Desktop\\ARGENTINA PROGRAMA\\clase5\\lista_items.csv";
        Object[] lineas=null;
        try {
            lineas=Files.readAllLines(Paths.get(archivo)).toArray();
            for (Object linea : lineas) {
                System.out.println(linea.toString());
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        Persona persona=new Persona();
        persona.setNombre("Daniel");
        persona.setApellido("Ibarra");
        persona.setFechaDeNacimiento(LocalDate.of(1980, 1, 15));

        Carrito carro=new Carrito();
        carro.setPersona(persona);
        carro.setFechaCompra(LocalDateTime.now());
        for (int i=1; i<lineas.length; i++){
            String[] lineaI= lineas[i].toString().split(";");
            ItemCarrito itemI=new ItemCarrito();
            itemI.setCantidad(Integer.parseInt(lineaI[0]));
            // Crear el objeto ProductoI:
            Producto productoI=new Producto();
            productoI.setCodigo(lineaI[1]);
            productoI.setNombre(lineaI[2]);
            productoI.setPrecio(Float.parseFloat(lineaI[3]));
            // Pasar el producto al item:
            itemI.setProducto(productoI);
            itemI.setPrecioUnitario(productoI.getPrecio());
            switch(i){
                case 1:{
                    carro.setItem1(itemI);
                    break;
                }
                case 2:{
                    carro.setItem2(itemI);
                    break;
                }
                case 3:{
                    carro.setItem3(itemI);
                    break;
                }
            }
        }
        System.out.println("Precio final del carrito= "+carro.precio());
    }
}