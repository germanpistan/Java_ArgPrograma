import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LectorCSV<datos> {
    public ArrayList<datos> leerCSV () {
        ArrayList<ArrayList<String>> datos = new ArrayList<ArrayList<String>>();
        Path filePath = Paths.get("C:\\Users\\Carolina\\Desktop\\ARGENTINA PROGRAMA\\clase5\\lista_items.csv");
        try {
            BufferedReader br = Files.newBufferedReader(filePath);
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datosDeLinea = linea.split(",");
                ArrayList<String> datosTemporal = new ArrayList<String>();
                for (String dato : datosDeLinea) {
                    datosTemporal.add(dato);
                }
                datos.add(datosTemporal);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return (ArrayList<datos>) datos;

    }
}
