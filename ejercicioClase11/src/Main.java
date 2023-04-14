import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;
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
        String ruta = "C:\\Users\\Carolina\\Desktop\\ARGENTINA PROGRAMA\\ejercicioClase11\\archivoMensajes.csv";
        String mensajesChat = "Emisor;Receptor;Mensaje;FechaHora";
        switch (opcion) {
            case "1" :{
                System.out.println("Ingrese su mensaje: ");
                mensaje =sc.nextLine();
                System.out.println("Ingrese el destinatario: ");
                receptor =sc.nextLine();

                try {
                    mensajesChat = Files.readString(Paths.get(ruta));
                    mensajesChat = mensajesChat + "\n" +
                            nombre + ";" +
                            receptor + ";" +
                            mensaje + ";" +
                            fecha.toString();
                    Files.write(Paths.get(ruta), mensajesChat.getBytes());  //metodo write lo pide con getBytes

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                break;
            }
            case "2" :{
                List <String> lineas;
                try {
                    lineas= Files.readAllLines(Paths.get(ruta));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                for (int i=1; i<lineas.size(); i++) {
                    String[] linea = lineas.get(i).split(";");
                    System.out.println(linea[2]);
                }
                break;
            }

        }


    }
}