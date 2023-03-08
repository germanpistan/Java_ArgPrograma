public class ContLetras {
    int contLetras(String palabra, char letra) {
        int conteo = 0;
        //for (int i=0; i<palabra.length(); i++ ) {
        for (char i : palabra.toCharArray()) {
            if (i == letra) {
                conteo++;
            }
        }
        return conteo;

    }
}
