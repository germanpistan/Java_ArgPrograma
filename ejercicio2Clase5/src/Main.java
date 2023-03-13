import empresa.Persona;
import empresa.Producto;
import ventas.Carrito;
import ventas.ItemCarrito;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


public class Main {

    public static void main(String[] args)  {

        String archivo = "C:\\Users\\Carolina\\Desktop\\ARGENTINA PROGRAMA\\clase5\\lista_items.csv";
        Object [] lineas = null;
        try{
            lineas = Files.readAllLines(  //armo un objeto y lo leo al archivo
                    Paths.get(archivo)).toArray();  //lo meto to array
            for (Object linea: lineas) {
                System.out.println(linea.toString());  //la linea es un objeto y lo convierto en String
            }

        }catch (IOException e){
            e.printStackTrace();
        }

        Persona persona = new Persona();
        persona.setNombre("German");
        persona.setApellido("Pistan");
        persona.setFechaDeNacimiento(LocalDate.of(1990,5,23));

        /*//FORMA DE ARMARLO SIN FOR
        String [] linea1 = lineas[1].toString().split(",");  //uso el registro de la linea 1 porque la fila uno no me sirve
        ItemCarrito item1 = new ItemCarrito();
        item1.setCantidad(Integer.parseInt(linea1[0]));  //asigno cantidad y paso a integer
        //crear el objeto producto 1
        Producto producto1 = new Producto();
        producto1.setNombre(linea1[2]);  //el nombre esta en el lugar 2
        producto1.setCodigo(linea1[1]);
        producto1.setPrecio(Float.parseFloat(linea1[3]));  //convierto el string en float
        //pasar el producto al item 1
        item1.setProducto(producto1);
        item1.setPrecioUnitario(producto1.getPrecio());*/

        //FORMA DE ARMARLO CON FOR
        Carrito carro = new Carrito();
        carro.setPersona(persona);
        carro.setFechaCompra(LocalDateTime.now());
        for (int i =1 ;i <lineas.length; i++) {
            String [] lineaI = lineas[i].toString().split(",");
            ItemCarrito itemI = new ItemCarrito();
            itemI.setCantidad(Integer.parseInt(lineaI[0]));
            //crear el objeto producto 1
            Producto productoI = new Producto();
            productoI.setCodigo(lineaI[1]);
            productoI.setNombre(lineaI[2]);  //el nombre esta en el lugar 2
            productoI.setPrecio(Float.parseFloat(lineaI[3]));  //convierto el string en float
            //pasar el producto al item 1
            itemI.setProducto(productoI);
            itemI.setPrecioUnitario(productoI.getPrecio());
            //aca con el switch agrego los item al carro
            switch (i){
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
        System.out.println("Costo total del carrito: " + carro.precio());


    }
}




