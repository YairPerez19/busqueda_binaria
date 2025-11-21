import java.io.*;

public class BusquedaBinaria {

    static int buscar(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (arr[m] == x) return m;
            if (arr[m] < x) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("entrada_busquedabinaria.txt"));
            String lineaLista = br.readLine();
            String lineaObjetivo = br.readLine();
            br.close();

            if (lineaLista != null && lineaObjetivo != null) {
                String[] partes = lineaLista.split(",");
                int[] numeros = new int[partes.length];
                for (int i = 0; i < partes.length; i++) {
                    numeros[i] = Integer.parseInt(partes[i].trim());
                }
                int objetivo = Integer.parseInt(lineaObjetivo.trim());

                int resultado = buscar(numeros, objetivo);

                BufferedWriter bw = new BufferedWriter(new FileWriter("salida_busquedabinaria.txt"));
                if (resultado != -1) 
                    bw.write("Búsqueda Binaria: El número " + objetivo + " está en la posición " + resultado);
                else 
                    bw.write("Búsqueda Binaria: El número " + objetivo + " NO se encontró.");
                
                bw.close();
                System.out.println("Proceso Busqueda Binaria terminado.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}