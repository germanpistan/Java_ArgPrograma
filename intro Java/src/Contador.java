public class Contador {

    int contador(String palabra, char letra){
        int conteo=0;
        //for (int i=0; i<palabra.length(); i++) {
        for (char c : palabra.toCharArray()){
            if (c==letra){
                conteo++;
            }
        }
        return conteo;
    }

}