/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareaclase;
import java.util.Scanner;
/**
 *
 * @author Ziara
 */
public class TareaClase {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in); 
        CrudEmpresa mEmpresa=new CrudEmpresa();
        Crud mVehiculo=new Crud();
        
        Boolean status=true;
        
        while (status)
        {
            System.out.println("");
            System.out.println("Menu de Opciones");
            System.out.println("1. Agregar Vehiculo");
            System.out.println("2. Mostrar Lista Vehiculos");
            System.out.println("3. Agregar Empresa");
            System.out.println("4. Mostrar Lista Empresas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una Opcion: ");
            
            int opcion=scanner.nextInt();
            
            switch(opcion)
            {
                case 1:
                    System.out.println("");
                    System.out.println("Ingrese Info de vehiculo");
                    System.out.println("");
                    System.out.print("Ingresa la marca del vehiculo: ");                   
                    String marca=scanner.next();
                    System.out.print("Ingresa el modelo del vehiculo: ");                   
                    String modelo=scanner.next();
                    System.out.print("Ingresa el placa del vehiculo: ");                   
                    String placa=scanner.next();
                    ClaseVehiculo nvoVehiculo =new ClaseVehiculo(placa,marca,modelo);
                    mVehiculo.createVehiculo(marca, modelo, placa);
                    break;
                case 2:
                    mVehiculo.mostrarVehiculo();
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Ingrese Info de la Empresa");
                    System.out.println("");
                    System.out.print("Ingresa el nombre: ");                   
                    String nommbre=scanner.next();
                    System.out.print("Ingresa la direccion: ");                   
                    String direccion=scanner.next();
                    System.out.print("Ingresa el RUC: ");                   
                    String ruc=scanner.next();
                    System.out.print("Ingresa el telefono: ");                   
                    String telefono=scanner.next();
                    System.out.print("Ingresa el correo: ");                   
                    String correo =scanner.next();
                    ClaseEmpresa nvaEmpresa=new ClaseEmpresa(nommbre,direccion,ruc,telefono,correo);
                    mEmpresa.AgregarEmpresa(nvaEmpresa);
                    break;
                case 4:
                    mEmpresa.mostrarEmpresa();
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;                    
            }
        }
    }
    
}