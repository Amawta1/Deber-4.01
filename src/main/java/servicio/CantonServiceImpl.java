/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Canton;

/**
 *
 * @author USUARIO
 */
public class CantonServiceImpl implements CantonService {
    
   private static List<Canton> cantonList;

    public CantonServiceImpl() {
        this.cantonList = new ArrayList<>();
    }

    @Override
    public void crear(Canton canton) {
        this.cantonList.add(canton);
    }


    @Override
    public List<Canton> listar() {
        return this.cantonList;
    }


    @Override
    public void modificar(Canton canton, int codigo) {
        var indice = -1;
        for (var cantones : this.cantonList) {
            indice++;
            if (codigo == cantones.getCodigo()) {
                this.cantonList.set(indice, canton);
            }
        }
    }

    @Override
    public void eliminar(int codigo) {
        var indice = -1;
        for (var cantones : this.cantonList) {
            indice++;
            if (codigo == cantones.getCodigo()) {
                this.cantonList.remove(indice);

            }

        }
    }
}
