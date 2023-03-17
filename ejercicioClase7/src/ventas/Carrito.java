package ventas;

import empresa.Persona;
import java.time.LocalDateTime;

public class Carrito {

    private Persona persona;
    private ItemCarrito item1;
    private ItemCarrito item2;
    private ItemCarrito item3;

    private LocalDateTime fechaCompra;

    public float precio(){
        float precioTotal=0;
        precioTotal= getItem1().precioTotal() + getItem2().precioTotal() + getItem3().precioTotal();
        System.out.println("precio total carrito= "+precioTotal);
        return precioTotal;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public ItemCarrito getItem1() {
        return item1;
    }

    public void setItem1(ItemCarrito item1) {
        this.item1 = item1;
    }

    public ItemCarrito getItem2() {
        return item2;
    }

    public void setItem2(ItemCarrito item2) {
        this.item2 = item2;
    }

    public ItemCarrito getItem3() {
        return item3;
    }

    public void setItem3(ItemCarrito item3) {
        this.item3 = item3;
    }

    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDateTime fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
}
