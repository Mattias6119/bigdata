/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.apache.beam.examples;

/**
 *
 * @author leo
 */
public class Aire {
    
    //DOLAR
    private String codigo;
    private String nombre;
    private String unidadmedida;
    private String fecha;
    private String valor;
  
    
    //TASA DESEMPLEO
    private String tasadesCodigo;
    private String tasadesNombre;
    private String tasadesUnidadmedida;
    private String tasadesFecha;
    private String tasadesValor;
    


    public Aire() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUnidadmedida() {
        return unidadmedida;
    }

    public void setUnidadmedida(String unidadmedida) {
        this.unidadmedida = unidadmedida;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
  
    public String getTasadesCodigo() {
        return tasadescodigo;
    }

    public void setTasadesCodigo(String tasadescodigo) {
        this.tasadescodigo = tasadescodigo;
    }
    
    public String getTasadesNombre() {
        return tasadesnombre;
    }

    public void setTasadesNombre(String tasadesnombre) {
        this.tasadesnombre = tasadesnombre;
    }

    public String getTasadesUnidadmedida() {
        return tasadesunidadmedida;
    }

    public void setTasadesUnidadmedida(String tasadesunidadmedida) {
        this.tasadesunidadmedida = tasadesunidadmedida;
    }

    public String getTasadesFecha() {
        return tasadesfecha;
    }

    public void setTasadesFecha(String tasadesfecha) {
        this.tasadesfecha = tasadesfecha;
    }

    public String getTasadesValor() {
        return tasadesvalor;
    }

    public void setTasadesValor(String tasadesvalor) {
        this.tasadesvalor = tasadesvalor;
    }
    

    @Override
    public String toString() {
        return "Aire{" + "codigo=" + codigo + ", nombre=" + nombre + ", unidadmedida=" + unidadmedida + ", fecha=" + fecha + ", valor=" + valor + ", tasadescodigo=" + tasadescodigo + ", tasadesnombre=" + tasadesnombre + ", tasadesunidadmedida=" + tasadesunidadmedida + ", tasadesfecha=" + tasadesfecha + ", tasadesvalor=" + tasadesvalor +'}';
    }
    
    public String toCSV()
    {
        return "" + codigo + "," + nombre + "," + unidadmedida + "," + fecha + "," + valor + "," + tasadesCodigo + "," + tasadesNombre + "," + tasadesUnidadmedida + "," +
                tasadesFecha + "," + tasadesValor + "";
    }

}//Aire
