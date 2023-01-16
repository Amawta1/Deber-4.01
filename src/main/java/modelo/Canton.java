/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;

/**
 *
 * @author USUARIO
 */
public class Canton {

    private String nombre;
    private int expancionTerritorial;
    private LocalDate fundacion;
    private int nroHabitantes;
    private Provincia provincia;
    private int codigo;

    public Canton(String nombre, int expancionTerritorial, LocalDate fundacion, int nroHabitantes, Provincia provincia, int codigo) {
        this.nombre = nombre;
        this.expancionTerritorial = expancionTerritorial;
        this.fundacion = fundacion;
        this.nroHabitantes = nroHabitantes;
        this.provincia = provincia;
        this.codigo = codigo;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExpancionTerritorial() {
        return expancionTerritorial;
    }

    public void setExpancionTerritorial(int expancionTerritorial) {
        this.expancionTerritorial = expancionTerritorial;
    }

    public LocalDate getFundacion() {
        return fundacion;
    }

    public void setFundacion(LocalDate fundacion) {
        this.fundacion = fundacion;
    }

    public int getNroHabitantes() {
        return nroHabitantes;
    }

    public void setNroHabitantes(int nroHabitantes) {
        this.nroHabitantes = nroHabitantes;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Canton{" + "nombre=" + nombre + ", expancionTerritorial=" 
                + expancionTerritorial + ", yearFundacion=" + fundacion 
                + ", nroHabitantes=" + nroHabitantes + ", provincia=" + provincia 
                + ", codigo=" + codigo + '}';
    }
    
    public int fundacion() {
        var years = LocalDate.now().getYear() - this.fundacion.getYear();
        if (this.fundacion.getMonthValue() < LocalDate.now().getMonthValue()) {
            years -= 1;
        }
        if (this.fundacion.getMonthValue() == LocalDate.now().getMonthValue()) {
            if (this.fundacion.getDayOfMonth() < LocalDate.now().getDayOfMonth()) {
                years -= 1;
            }

        }
        return years;
    }

}
