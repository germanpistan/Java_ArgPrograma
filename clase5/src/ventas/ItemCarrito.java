package ventas;

import empresa.Producto;

public class ItemCarrito {
    private Integer carrito;
    private float precioUnitario;
    private Integer cantidad;
    private Producto producto;



    public float precioTotal() {
        float precio =0;
        precio = this.cantidad * this.producto.costoFinal(1);
        return precio;
    }

    public Integer getCarrito() {
        return carrito;
    }

    public void setCarrito(Integer carrito) {
        this.carrito = carrito;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
