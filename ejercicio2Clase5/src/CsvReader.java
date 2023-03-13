import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvReader {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\Carolina\\Desktop\\ARGENTINA PROGRAMA\\clase5\\lista_items.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(";");


                System.out.println("Dato 1: " + data[2]);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}