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
public class Pais {

    private int nroProvincias;
    private String capital;
    private LocalDate descubrimiento;
    private String presidente;
    private String continente;
    private String nombre;
    private int codigo;

    public Pais(int nroProvincias, String capital,LocalDate descubrimiento, String presidente, String continente, String nombre, int codigo) {
        this.nroProvincias = nroProvincias;
        this.capital = capital;
        this.descubrimiento = descubrimiento;
        this.presidente = presidente;
        this.continente = continente;
        this.nroProvincias = nroProvincias;
        this.codigo = codigo;
    }

    public int getNroProvincias() {
        return nroProvincias;
    }

    public void setNroProvincias(int nroProvincias) {
        this.nroProvincias = nroProvincias;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public LocalDate getDescubrimiento() {
        return descubrimiento;
    }

    public void setDescubrimiento(LocalDate descubrimiento) {
        this.descubrimiento = descubrimiento;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Pais{" + "nroProvincias=" + nroProvincias + ", capital="
                + capital + ", yearDescubrimiento=" + descubrimiento + ", presidente="
                + presidente + ", continente=" + continente + ", nombre=" + nombre + ", codigo=" + codigo + '}';
    }



    public int descubrimiento() {
        var years = LocalDate.now().getYear() - this.descubrimiento.getYear();
        if (this.descubrimiento.getMonthValue() < LocalDate.now().getMonthValue()) {
            years -= 1;
        }
        if (this.descubrimiento.getMonthValue() == LocalDate.now().getMonthValue()) {
            if (this.descubrimiento.getDayOfMonth() < LocalDate.now().getDayOfMonth()) {
                years -= 1;
            }

        }
        return years;
    }
}
