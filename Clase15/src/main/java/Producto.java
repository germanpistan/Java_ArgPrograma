import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Map;

public class Producto {
    private String nombre;
    private int stock;
    private float precio;

    public Producto (){
        this.precio = precio;
    }

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectmapper = new ObjectMapper();
        Producto prod = new Producto("destornillador", 10, 1.4f);
        String jsontext = objectmapper.writeValueAsString(prod);
        System.out.println(jsontext);

        String json = "{\"nombre\":\"Destornillador\",\"stock\":10,\"precio\":1.4}";  //va con \ para que tome el simbolo
        Producto prod2 = objectmapper.readValue(json,Producto.class);
        prod2.getNombre();
        prod2.getStock();
        System.out.println(prod2);

        String json2 = "{\"nombre\":\"Destornillador\",\"stock\":10,\"precio\":1.4}";
        Map<String, Object> map
                = objectmapper.readValue(json2, new TypeReference<Map<String,Object>>(){});
        System.out.println(map);

    }

    public String getNombre() {
        return nombre;
    }
    public Producto (String nombre, int stock, float precio) {
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}

