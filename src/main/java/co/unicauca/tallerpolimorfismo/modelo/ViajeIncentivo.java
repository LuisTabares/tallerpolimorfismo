/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Luis Tabares
 */
public class ViajeIncentivo extends Viaje {
    
    /**
    * Empresa que patrocina el viaje al empleado
    */
    private String empresa;
    
    //Constructor, getters and setters
    public ViajeIncentivo(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, String empresa){
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.empresa = empresa;
    }
    
    @Override
    public String descripcion() {
        return "Viaje incentivo que te envia la empresa " + empresa;
    }
    
    public String getEmpresa(){
        return this.empresa;
    }
    
    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }

    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje de incentivo";
    }
}
