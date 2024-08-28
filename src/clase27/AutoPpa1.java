/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase27;

/**
 *
 * @author vina
 */
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
        System.out.println(objAuto2);
        System.out.println(objAuto2);
        
        //javase2020
        //primer ejercicio fin de semestre
        //git +  token
        //canal del hernan
        
