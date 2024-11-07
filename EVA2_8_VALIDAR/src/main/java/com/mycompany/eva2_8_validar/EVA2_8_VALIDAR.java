/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_8_validar;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EVA2_8_VALIDAR {

    public static void main(String[] args) {
        int di;
        Scanner mtr = new Scanner(System.in);
        do{
            System.out.println("numero correspondiente del dia");
            di=mtr.nextInt();
        }while(di < 1 || di > 7);  
         switch(di){
            case 1:
                    System.out.println("DOMINGO");
                    break;
            case 2:
                    System.out.println("DOMINGO");
                    break;
            case 3:
                    System.out.println("DOMINGO");
                    break;
            case 4:
                    System.out.println("DOMINGO");
                    break;
            case 5:
                    System.out.println("DOMINGO");
                    break;
            case 6:
                    System.out.println("DOMINGO");
                    break;
            case 7:
                    System.out.println("DOMINGO");
                    break;
            default:
                System.out.println("numero no valido");
        }

    }
}

