/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio35;

import java.util.Scanner;

/**
 *
 * @author Ingenieria
 */
public class Ejercicio35 {

    /*
     * Crea un enum con los días de la semana, pide un día de la semana 
     * e indica si es laboral o no (en el main).
     */
    public enum Dias {
        LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
    }

    public static void main(String[] args) {

        Scanner Teclado = new Scanner(System.in);
        String Dia;
        int Contador=0;
        System.out.println("Digite un día de la semana: (ejm Lunes)");
        Dia = Teclado.nextLine();
        Dias d = Dias.LUNES;
        switch (Dia){
        
            case "Lunes":
                  d = Dias.LUNES;
                  break;
            case "Martes":
                  d = Dias.MARTES;
                  break;
            case "Miercoles":
                  d = Dias.MIERCOLES;
                  break;
            case "Jueves":
                  d = Dias.JUEVES;
                  break;
            case "Viernes":
                  d = Dias.VIERNES;
                  break;
            case "Sabado":
                  d = Dias.SABADO;
                  break;
            case "Domingo":
                  d = Dias.DOMINGO;
                  break;
            default:
                  System.out.println("No digito un día de la semana valido");
                  break;
        }
       
        if (d == Dias.DOMINGO || d == Dias.SABADO) {
            System.out.println("Este día no es laboral");
        } else {
            System.out.println("Este día si laboral");
        }

        /*
        switch (d) {  //ejemplo de switch
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("Aún no ha llegado el fin de semana");
                break;
            default:
                System.out.println("Estamos en fin de semana");
        }*/
        
    }  
}
