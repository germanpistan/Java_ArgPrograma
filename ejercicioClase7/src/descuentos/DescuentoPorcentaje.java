package descuentos;

public class DescuentoPorcentaje extends descuento{
    public DescuentoPorcentaje(double v) {

    }

    public float valorFinal (float valorInicial){
        return valorInicial - (valorInicial * this.getValorDesc());
    }
}
