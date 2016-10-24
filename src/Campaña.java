/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author freddy
 */

import java.util.ArrayList;

public class Campaña {
    private String titulo;
    private String fechaInicio;
    private String fechaFinalizacion;
    private double costoEstimado;
    private double presupuesto;
    private double costoReal;
    
    Director director;
    ArrayList<Personal> Equipo;

    
    public Campaña(String titulo, String fechaInicio, String fechaFinalizacion, double costoEstimado, double presupuesto, double costoReal) {
        this.titulo = titulo;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.costoEstimado = costoEstimado;
        this.presupuesto = presupuesto;
        this.costoReal = costoReal;
        
        }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public double getCostoEstimado() {
        return costoEstimado;
    }

    public void setCostoEstimado(double costoEstimado) {
        this.costoEstimado = costoEstimado;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getCostoReal() {
        return costoReal;
    }

    public void setCostoReal(double costoReal) {
        this.costoReal = costoReal;
    }
    
    public boolean presupuesto(double presupuesto){
        if(this.presupuesto > presupuesto){
            return false;
        } else{
            return true;
        }
    }
    
    
}
