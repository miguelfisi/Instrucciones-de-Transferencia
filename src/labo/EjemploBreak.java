/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo;

import java.util.Scanner;

/**
 *
 * @author miguel
 */
public class EjemploBreak {

    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);

        while (true)//bucle infinito
        {
            System.out.println("valor: ");

            //ingreso de entero como cadena
            String num = scanner.nextLine();

            //convertir a entero
            x = Integer.valueOf(num).intValue();
            System.out.println("tu numero ingresado es " + num);
            if ((x % 7) == 0) {

                break;
            }
        }
        scanner.close();
        System.out.println("Fin: tu número ingresado si es un multiplo de 7 - BYE");
    }
}
