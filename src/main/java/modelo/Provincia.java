/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author USUARIO
 */
public class Provincia {

    private String nombre;
    private int expancionTerritorial;
    private Pais pais;
    private int nroHabitantes;
    private int codigo;

    public Provincia(String nombre, int expancionTerritorial, Pais pais, int nroHabitantes, int codigo) {
        this.nombre = nombre;
        this.expancionTerritorial = expancionTerritorial;
        this.pais = pais;
        this.nroHabitantes = nroHabitantes;
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

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public int getNroHabitantes() {
        return nroHabitantes;
    }

    public void setNroHabitantes(int nroHabitantes) {
        this.nroHabitantes = nroHabitantes;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Provincia{" + "nombre=" + nombre + ", expancionTerritorial=" 
                + expancionTerritorial + ", pais=" + pais + ", nroHabitantes=" 
                + nroHabitantes + ", codigo=" + codigo + '}';
    }

}
