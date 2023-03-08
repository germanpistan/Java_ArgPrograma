public class Ordenador {
    public int[] ordenar(int a, int b, int c, boolean asc){
        int[] numerosOrdenados={a,b,c};
        for (int i=0; i<numerosOrdenados.length; i++){
            for (int j=i+1; j<numerosOrdenados.length; j++){
                if (asc) {
                    if (numerosOrdenados[i] > numerosOrdenados[j]) {
                        int aux = numerosOrdenados[i];
                        numerosOrdenados[i] = numerosOrdenados[j];
                        numerosOrdenados[j] = aux;
                    }
                }else{
                    if (numerosOrdenados[i] < numerosOrdenados[j]) {
                        int aux = numerosOrdenados[i];
                        numerosOrdenados[i] = numerosOrdenados[j];
                        numerosOrdenados[j] = aux;
                    }
                }
            }
        }
        return numerosOrdenados;
    }

}
