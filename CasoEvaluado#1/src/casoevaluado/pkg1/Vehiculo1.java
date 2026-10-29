/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casoevaluado.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class Vehiculo1 {
    public static String inicioPlaca= "XXX";
    
    private String marca;
    private int placa;
    private int precioPorDia;
    private int cantidadDias;
    private int seguro;
    private int GPS;
    //constructor
    public Vehiculo1(String marca, int placa, int precioPorDia, int cantidadDias, int seguro, int GPS) {
        this.marca = marca;
        this.placa = placa;
        this.precioPorDia = precioPorDia;
        this.cantidadDias = cantidadDias;
        this.seguro = seguro;
        this.GPS = GPS;
    }
    //setter and getters
    public static String getInicioPlaca() {
        return inicioPlaca;
    }

    public static void setInicioPlaca(String inicioPlaca) {
        Vehiculo1.inicioPlaca = inicioPlaca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPlaca() {
        return placa;
    }

    public void setPlaca(int placa) {
        this.placa = placa;
    }

    public int getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(int precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public int getSeguro() {
        return seguro;
    }

    public void setSeguro(int seguro) {
        this.seguro = seguro;
    }

    public int getGPS() {
        return GPS;
    }

    public void setGPS(int GPS) {
        this.GPS = GPS;
    }
    //metodo para calcular el subtotal y descuentos
    public double calcularSubtotal(){
    double costoBase= precioPorDia*cantidadDias;
    
        if (cantidadDias>7) {
            costoBase= costoBase*0.85;
            }
        //calcular recargos por seguro y GPS
        double seguro= 5000*cantidadDias;
        double GPS= 2000*cantidadDias;
        return costoBase + seguro + GPS;
        
    }
    //calcular puntos
    public int calcularPuntos(){
        int puntos =0;
        if (cantidadDias>7) {
            puntos =+5;
        }
        return puntos;
    }
    
}
