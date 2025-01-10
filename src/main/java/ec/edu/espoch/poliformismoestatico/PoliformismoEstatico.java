/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.poliformismoestatico;

import ec.edu.espoch.poliformismoestatico.clases.Calculadora;

/**
 *
 * @author SO-LAB1-PC28
 */
public class PoliformismoEstatico {

    public static void main(String[] args) {
        
        
        Calculadora objCalculadora = new Calculadora();
        objCalculadora.sumar(9, 7);
        int result=objCalculadora.sumar(9, 7);
        int result2=objCalculadora.sumar(5,5,5);
        float result3=objCalculadora.sumar(10,8);
        float result4=objCalculadora.sumar(10,8,2);
        
        System.out.println("El resultado es "+ result);
        System.out.println("El resultado es "+ result2);
        System.out.println("El resultado es "+ result3);
        System.out.println("El resultado es "+ result4);
        
  
    }
}
