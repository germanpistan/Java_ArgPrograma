package descuentos;

public class DescuentoFijo extends descuento{
    public DescuentoFijo(int i) {
        super();
    }

    public float valorFinal (float valorInicial){
        return valorInicial - this.getValorDesc();
    }
}
