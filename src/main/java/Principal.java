
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
                String NombreAtleta=JOptionPane.showInputDialog("Ingresar Nombre:");
                break;
                
            case 2:
                String NombreCampeon=JOptionPane.showInputDialog("Ingresar Nombre:");
                String Nacionalidad=JOptionPane.showInputDialog("Ingresar Nacionalidad:");
                String Tiempo=JOptionPane.showInputDialog("Ingresar Tiempo:");
               break;
               
            case 3:
                break;
                
            case 4:
                break;
                
            case 5:
                x=false ;
                break;
                
                default:
                    System.out.println("Opcion no valida. Intentelo de nuevo.");
                    break;
                
            
        }
        }
      
    }
    
}
