/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreriaanace;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author UCLAB826
 */
public class Trabajador {
    private String nombre;
    private double sueldo;
    private Trabajador jefe;
    private List<Trabajador> subordinados;
    private Empresa empresa;

    public Trabajador() {
    }

    public Trabajador(String nombre, double sueldo) {
        this.nombre = nombre;
        setSueldo(sueldo);
        this.subordinados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        if(sueldo <= 20000){
            this.sueldo = sueldo;
        }
        else{
            throw new IllegalArgumentException("El sueldo no puede exceder S/.20,000");
        }
    }

    public void agregarSubordinados(Trabajador t){
        this.subordinados.add(t);
        t.setJefe(this);
    }
    
    public Trabajador getJefe() {
        return jefe;
    }

    public void setJefe(Trabajador jefe) {
        this.jefe = jefe;
    }

    public List<Trabajador> getSubordinados() {
        return subordinados;
    }

   public void setSubordinados(List<Trabajador> subordinados) {
        this.subordinados = subordinados;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "nombre=" + nombre + ", sueldo=" + sueldo + ", empresa=" + empresa + '}';
    }
}
