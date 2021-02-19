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
public class ViajeFamiliar extends Viaje {
    
    /**
    * Cantidad de integrantes de la familia
    */
    private int familia;
    
    //Constructor getters and setters
    public ViajeFamiliar(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, int familia){
        this.origen = origen;
        this.destino = destino;
        this.costo = costo;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.familia = familia;
    }
    
    @Override
    public String descripcion() {
        return "Viaje para disfrutar con toda tu familia";
    }
    
    public int getFamilia(){
        return this.familia;
    }
    
    public void setFamilia(int familia){
        this.familia = familia;
    }
    
    @Override
    public String cualquierMetodo2() {
        return "Método implementado en la clase hija viaje familiar";
    }
}
