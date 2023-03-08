public class Main {
    public static void main(String[] args) {
        int conteoDeApariciones=0;
        Contador c=new Contador();
        conteoDeApariciones= c.contador("Estoy en casa", 'a');
        System.out.println("Conteo de apariciones de la letra a: "+
                conteoDeApariciones);

        int[] numeros;
        Ordenador ordenador=new Ordenador();
        numeros=ordenador.ordenar(8, 4, 7, false);
        for (int n : numeros){
            System.out.println(n);
        }
    }
}