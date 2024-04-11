import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class LectorProductos {
    // Una Lista (List) es un ArrayList
    private List<Producto> inventario = new ArrayList<>();

    // Este método lee el archivo "inventario.txt" y lo guarda en la lista
    public void leer() {
        try {
            File archivo = new File("./src/java/inventario.txt");
            FileReader conexion = new FileReader(archivo);
            BufferedReader lector = new BufferedReader(conexion);

            String linea = "";

            while ((linea = lector.readLine()) != null) {
                String [] pedacitos = linea.split(",");

                // En los arreglos empiezan por la posición 0
                String tipo = pedacitos[0];
                String nombre = pedacitos[1];
                double precio = Double.parseDouble(pedacitos[2]);

                switch (tipo) {
                    case "supermercado":
                        inventario.add(new SuperMercado(nombre, precio));
                        break;

                    case "jugueteria":
                        inventario.add(new Juguete(nombre, precio));
                        break;

                    case "electronica":
                        inventario.add(new Electronica(nombre, precio));
                        break;
                }
            }

            System.out.println("El sistema cargo " + inventario.size() + " productos");

        } catch (FileNotFoundException fnex) {
            System.out.println("El archivo no existe");
        } catch (IOException ex) {
            System.out.println("No se pudo leer el archivo");
        }
    }

    public static void main(String [] args) {
        LectorProductos lector = new LectorProductos();
        lector.leer();
    }
}

