/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase27;

/**
 *
 * @author keni
 * @author 27-08-2024
 */
public class auto {
    
    private String marca,modelo, tipoConbustible;
    private int año;
    private double cilindrada;
    
    
    public auto() {
        marca = "Suzuki";
        modelo = "Baleno";
    }

    public auto(String marca, String modelo, String tipoConbustible, int año, double cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoConbustible = tipoConbustible;
        this.año = año;
        this.cilindrada = cilindrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoConbustible() {
        return tipoConbustible;
    }

    public void setTipoConbustible(String tipoConbustible) {
        this.tipoConbustible = tipoConbustible;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "auto{" + "marca=" + marca + ", modelo=" + modelo + ", tipoConbustible=" + tipoConbustible + ", a\u00f1o=" + año + ", cilindrada=" + cilindrada + '}';
    }
    
    public class AutoPpa1 {
    // main + tab 
    // aca se maniene en tiempo en memoria, se mantienen los datos, no necesito crear objetos de la clase 
   
    public static void main(String[] args) {
        //clase, objeto, metodo
        //System.out.println("");
        
        // constructor sin parametros 
        Auto objAuto = new Auto();
        System.out.println(objAuto.getMarca());
        System.out.println(objAuto.getModelo());
        
        Auto objAuto2 = new Auto("KIA" , "Morning" , "Bencina" , 2022, 1500);
        
        System.out.println(objAuto2.getMarca());
        System.out.println(objAuto2.getModelo());
        System.out.println(objAuto);
        System.out.println(objAuto2);
        
    }
    
}
    
}
