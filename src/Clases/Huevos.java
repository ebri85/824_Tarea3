/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author esau_br
 */
public class Huevos {
    
    private String nombreCl;
    private double precioH;
    private double kilogramos;
    private double total;
    
    public Huevos()
    {
        
    }
    
    public Huevos(String nombreCl, double precioH,double kilogramos, double total)
    {
        this.nombreCl   = nombreCl;
        this.precioH    = precioH;
        this.kilogramos = kilogramos;
        this.total      = total;
    }

    public String getNombreCl() {
        return nombreCl;
    }

    public double getKilogramos() {
        return kilogramos;
    }

    public void setKilogramos(double kilogramos) {
        this.kilogramos = kilogramos;
    }
    

    public void setNombreCl(String nombreCl) {
        this.nombreCl = nombreCl;
    }

    public double getPrecioH() {
        return precioH;
    }

    public void setPrecioH(double precioH) {
        this.precioH = precioH;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Venta{" + "Nombre del Cliente: " + nombreCl + ", Precio del KG de Huevo: " + precioH +", Kilogramos: " +kilogramos + ", TOTAL: " + total + '}';
    }
    
    
    
    public double Venta(double kg, double prec)
    {
        return kg * prec;
    }
    
    
}
