
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author 1059236799
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Atleta> atletas = new ArrayList<>();
        boolean x = true;
        while(x){
            
        
        String Menu=JOptionPane.showInputDialog("Competencia \n" 
                + "1. Registrar atleta \n"
                +"2. Datos del campeon \n"
                +"3. Atletas por pais. \n" 
                +"4. Tiempo promedio de todos los Atletas \n" 
                + "5. Salir");
        int MenuStr=Integer.parseInt(Menu);
        switch (MenuStr){
            case 1:
                    RegistrarAtleta(atletas);
                    break;

                case 2:
                    if (atletas.size() > 0) {
                        MostrarCampeon(atletas);
                    } else {
                        JOptionPane.showMessageDialog(null, "NO se encuentran atletas registrados.");
                    }
                    break;

                case 3:
                    if (atletas.size() > 0) {
                        MostrarAtletasPorPais(atletas);
                    } else {
                        JOptionPane.showMessageDialog(null, "NO se encuentran atletas registrados.");
                    }
                    break;

                case 4:
                    if (atletas.size() > 0) {
                        MostrarTiempoPromedio(atletas);
                    } else {
                        JOptionPane.showMessageDialog(null, "NO se encuentran registrados.");
                    }
                    break;

                case 5:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                    x = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida. Inténtelo de nuevo.");
            }
        }
    }

   public static void RegistrarAtleta(ArrayList<Atleta> atletas) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del atleta:");
        String nacionalidad = JOptionPane.showInputDialog("Ingrese la nacionalidad del atleta:");
        double tiempo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo del atleta en segundos:"));

        Atleta nuevoAtleta = new Atleta(nombre, nacionalidad, (int) tiempo);
        atletas.add(nuevoAtleta);

        JOptionPane.showMessageDialog(null, "Atleta registrado exitosamente.");
    }

    public static void MostrarCampeon(ArrayList<Atleta> atletas) {
        Atleta campeon = atletas.get(0);
        for (Atleta atleta : atletas) {
            if (atleta.getTiempo() < campeon.getTiempo()) {
                campeon = atleta;
            }
        }

        JOptionPane.showMessageDialog(null, "Datos del campeón:\nNombre: " + campeon.getNombre() + "\nNacionalidad: " + campeon.getNacionalidad() + "\nTiempo: " + campeon.getTiempo() + " segundos");
    }

    public static void MostrarAtletasPorPais(ArrayList<Atleta> atletas) {
        Map<String, Integer> atletasPorPais = new HashMap<>();
        for (Atleta atleta : atletas) {
            String pais = atleta.getNacionalidad();
            atletasPorPais.put(pais, atletasPorPais.getOrDefault(pais, 0) + 1);
        }

        StringBuilder mensaje = new StringBuilder("Atletas por país:\n");
        for (String pais : atletasPorPais.keySet()) {
            mensaje.append(pais).append(": ").append(atletasPorPais.get(pais)).append("\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString());
    }

    public static void MostrarTiempoPromedio(ArrayList<Atleta> atletas) {
        double tiempoTotal = 0;
        for (Atleta atleta : atletas) {
            tiempoTotal += atleta.getTiempo();
        }

        double tiempoPromedio = tiempoTotal / atletas.size();

        JOptionPane.showMessageDialog(null, "Tiempo promedio de todos los atletas: " + tiempoPromedio + " segundos");
    }
}