import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("CHAT");
        System.out.println("Bienvenido al Chat");
        System.out.println("Ingrese su nombre: ");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();

        System.out.println("Ingrese una opcion: [1: Redactar mensaje, 2: Leer mensaje] ");
        String opcion = sc.nextLine();
        String mensaje ="";
        String receptor ="";
        LocalDateTime fecha = LocalDateTime.now();
        switch (opcion) {
            case "1" :{
                System.out.println("Ingrese su mensaje: ");
                mensaje =sc.nextLine();
                System.out.println("Ingrese el destinatario: ");
                receptor =sc.nextLine();
                String ruta = "C:\\Users\\Carolina\\Desktop\\ARGENTINA PROGRAMA\\ejercicioClase11\\archivosMensajes.csv";
                String mensajesChat = "";
                try {
                    mensajesChat = Files.readString(Paths.get(ruta));
                    mensajesChat = mensajesChat + "\n" +
                            nombre + ";" +
                            receptor + ";" +
                            mensaje + ";" + 

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }


                break;
            }
            case "2" :{
                System.out.println("")
                break;
            }

        }


    }
}