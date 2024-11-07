/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_nuemero_mayor;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EVA2_11_NUEMERO_MAYOR {

    public static void main(String[] args) {
        Scanner mtr = new Scanner(System.in);
        int nu1, nu2=0;
        do{
            System.out.println("inserta un numero");
            nu1=mtr.nextInt();
            if(nu1>=nu2){
                nu2=nu1;
            }
        }while(nu1>=0);
        System.out.println("El numero mas grande es "+nu2);
    }
}
