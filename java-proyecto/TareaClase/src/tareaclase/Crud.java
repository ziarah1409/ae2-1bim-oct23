/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaclase;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Ziara
 */
public class Crud {

    public Crud(int nextId1, String marca, String modelo, String placa) {
    }
private List<Crud> ClaseVehiculo = new ArrayList<>();
    private int nextId = 1;

    Crud() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void createVehiculo(String marca, String modelo, String placa) {
        ClaseVehiculo.add(new Crud(nextId,marca, modelo,placa));
        nextId++;
    }

    public List<Crud> readVehiculos() {
        return ClaseVehiculo;
    }
/*
    public void updateVehiculo(int id, String marca, String modelo,String placa) {
        for (Crud vehiculo : ClaseVehiculo) {
            if (vehiculo.getId() == id) {
                vehiculo.setMarca(marca);
                vehiculo.setModelo(modelo);
                vehiculo.setplaca(placa);
                return;
            }
        }
    }

    public void deleteVehiculo(int id) {
        ClaseVehiculo.removeIf(Crud -> Crud.getId() == id);
    }*/

    void mostrarVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
