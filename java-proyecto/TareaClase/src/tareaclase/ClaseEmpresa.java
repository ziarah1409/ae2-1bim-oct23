/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareaclase;

/**
 *
 * @author Ziara
 */
public class ClaseEmpresa {
public String nommbre;
public String ruc;
public String direccion;
public String telefono;
public String correo;

public ClaseEmpresa(){}
    public ClaseEmpresa(String nommbre, String ruc, String direccion, String telefono, String correo) {
        this.nommbre = nommbre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNommbre() {
        return nommbre;
    }

    public String getRuc() {
        return ruc;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setNommbre(String nommbre) {
        this.nommbre = nommbre;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

   public void mostrarEmpresa() 
    {
        System.out.println("Información de la Empresa:");
        System.out.println("Nombre: " + nommbre);
        System.out.println("Direccion: " + direccion);
        System.out.println("RUC: " + ruc);
        System.out.println("Telefono"+ telefono);
        System.out.println("correo"+ correo);
        
    }
}
