package descuentos;

public class DescuentoFijo extends Descuento{

    private float monto;
    public DescuentoFijo (float monto) {
        super();
        this.monto = monto;
    }

    public float descuento(float precio){
    return precio - monto;
    }
}