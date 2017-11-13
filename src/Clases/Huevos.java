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
    private String hora;
    
    public Huevos()
    {
        
    }
    
    public Huevos(String nombreCl, double precioH,double kilogramos, double total, String hora)
    {
        this.nombreCl   = nombreCl;
        this.precioH    = precioH;
        this.kilogramos = kilogramos;
        this.total      = total;
        this.hora       = hora;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
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
        return "Venta{" + "Nombre del Cliente: " + nombreCl + ", Precio del KG de Huevo: ₡" + precioH +", Kilogramos: " +kilogramos + ", TOTAL: ₡" + total + ", HORA: "+ hora +'}';
    }
    
    
    
    public double Venta(double kg, double prec)
    {
        return kg * prec;
    }
    
    
}
