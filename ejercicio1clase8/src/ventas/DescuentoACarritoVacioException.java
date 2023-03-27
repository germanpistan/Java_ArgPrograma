package ventas;

public class DescuentoACarritoVacioException extends Exception {
    public DescuentoACarritoVacioException (){
        super ("No se puede aplicar descuento a carrito con precio cero");
    }

}
