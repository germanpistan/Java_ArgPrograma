package descuentos;

public abstract class descuento {
    private float valor;
    public float getValorDesc (){
        return valor;
    }
    public void setValorDesc (float valor) {
        this.valor = valor;
    }
    public abstract float valorFinal(
            float valorInicial);




}
