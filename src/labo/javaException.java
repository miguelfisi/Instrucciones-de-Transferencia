/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo;

/**
 *
 * @author miguel
 * Excepciones en java 
 * Captura con bloque try catch
 */
public class javaException {
    
    public static void main (String[] args){
    
        try {
            System.out.println("Instruccion 1");
            //int n = Integer.parserInt("25"); Manera correcta
            int n=Integer.parseInt("H");//el método parseInt de la clase Integer 
                                        //espera que dentro de las comillas llegue un número y no una letra
                                        //error forzado en tiempo de ejecución
            System.out.println("Instruccion 2");
        } catch (Exception e) {
            System.out.println("Instrucciones a ejecutar cuando se produce un error");
        }
    }
    
}
