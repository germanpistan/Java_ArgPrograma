import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Clase 14");
        boolean valor = false;
        do {
            Scanner sc = new Scanner(System.in);
            String texto = sc.nextLine();


           /* Pattern pat = Pattern.compile(".*abc.*");  //le agrego .* para decir que cualquier caracter con punto y * es cero o muchos
            //seria cero o muchos caracteres antes de abc y despues, que la oracion que ingrese el usuario tenga abc en cualquier lado
            Matcher m = pat.matcher(texto);
            if (m.matches()) {
                System.out.println("Cumple con el patron");
            } else {
                System.out.println("No cumple");
            }*/

            //Pattern pat = Pattern.compile("^[aA]bc.*");  //le agrego que tenga abc al principio y luego lo que el usuario quiera
            //si le pongo corchetes es para que empiece con a minuscula o mayuscula y luego cualquier caracter
            //Pattern pat = Pattern.compile("^[a-zA-Z]{5,10}"); //de la a, hasta la z en minus y en mayus, con caracteres entre 5 y 10

            //comprobar si el string no empieza con un digito
            //Pattern pat = Pattern.compile("^[^\\d].*");  //aca estoy negando un digito

            //comprobar que no termine con un digito
            //Pattern pat = Pattern.compile(".*[^\\d]$");//comienza con cualquier caracter, y que no termine con digito


            //comprobar que el string solo tenga caracteres a o b
            //Pattern pat = Pattern.compile("(a|b)+");  //compruebo que a o b de uno a muchos


            //comprobar que el string contiene 1 y que ese 1 no esta seguido por un 2
            //Pattern pat = Pattern.compile(".*1 (?!2).*");  //no debe existir el 2 despues del 1


            //comprobar direccion de mail
            //direccion123@gmail.com.ar

            Pattern pat = Pattern.compile("([a-z] | [0-9] |_) +@ [a-z] + \\.[a-z] +(\\.[a-z]{2})?");  //con el * indico opcional
            //con el ? indica que es cero o una vez al final
            Matcher m = pat.matcher(texto);
            valor = m.matches();
            if (valor) {
                System.out.println("Cumple con el patron");
            } else {
                System.out.println("No cumple");
            }
        } while (!valor);
    }
}

//PARA VERLO GRAFICAMENTE PUEDO USAR LA PAGINA REGEXPER