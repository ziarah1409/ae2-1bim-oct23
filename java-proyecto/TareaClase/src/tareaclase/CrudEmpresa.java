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
public class CrudEmpresa {
private List<ClaseEmpresa> empresas;

public CrudEmpresa()
    {
        empresas=new ArrayList<>();
    }

public void AgregarEmpresa(ClaseEmpresa empresa)
    {
        empresas.add(empresa);
    }

public void mostrarEmpresa() {
        for (int i = 0; i < empresas.size(); i++) {
            System.out.println("Empresa " + (i + 1));
            empresas.get(i).mostrarEmpresa();
            System.out.println();
        }
    }    


/*
    public void updateEmpresa(int id, String ruc ,String nombre,String direccion, String telefono, String correo) {
        for (Crud Empresa : ClaseEmpresa) {
            if (Empresa.getId() == id) {
                Empresa.setruc(ruc);
                Empresa.setnombre(nombre);
                Empresa.setdireccion(direccion);
                Empresa.settelefono(telefono);
                Empresa.setcorreo(correo);
                return;
            }
        }
    }

    public void deleteEmpresa(int id) {
        ClaseEmpresa.removeIf(CrudEmpresa -> CrudEmpresa.getId() == id);
    }*/    
}
