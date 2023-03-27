package descuentos;

public class DescuentoPorcentaje extends Descuento{
    private float porcentaje;
    public DescuentoPorcentaje(float porcentaje) {
        super();
        this.porcentaje = porcentaje;

    }

    public float descuento (float precio){
        return precio * (porcentaje / 100);
    }
}
