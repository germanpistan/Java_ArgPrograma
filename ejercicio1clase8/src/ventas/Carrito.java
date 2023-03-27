package ventas;

import descuentos.DescuentoFijo;
import descuentos.DescuentoPorcentaje;
import descuentos.Descuento;
import empresa.Persona;

import java.time.LocalDateTime;
import java.util.List;

public class Carrito {

    private Persona persona;

    private List<ItemCarrito> items;

    private LocalDateTime fechaCompra;


    public float precio( boolean fijo, float valorDescuento) throws DescuentoACarritoVacioException {
        float precioTotal=0;
        for (ItemCarrito item : items){
            precioTotal = precioTotal + item.precioTotal();
        }
        if (precioTotal ==0){
            throw new DescuentoACarritoVacioException();
        }

        Descuento desc;
        if (fijo) {
            desc = new DescuentoFijo(valorDescuento);
        } else {
            desc = new DescuentoPorcentaje(valorDescuento);
        }
        float precioConDescuento = desc.descuento(precioTotal);
        return precioConDescuento;
    }



    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }



    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDateTime fechaCompra) {
        this.fechaCompra = fechaCompra;
    }



    public List<ItemCarrito> getItems() {
        return items;
    }

    public void setItems(List<ItemCarrito> items) {
        this.items = items;
    }
}
