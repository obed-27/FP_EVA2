/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_17_califas;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EVA2_17_CALIFAS {

    public static void main(String[] args) {
        int Ca;
        int[] califa;
        String[] nombre;
        Scanner mtr = new Scanner(System.in);
        System.out.println("cantidad de calificaciones a capturar");
        Ca=mtr.nextInt();
        nombre=new String[Ca];
        mtr.nextLine();
        califa=new int[Ca];
        for (int i = 0; i < califa.length; i++) {
            System.out.println("calificacion estudiante #"+ i);
            nombre[i]=mtr.nextLine();
            califa[i]=mtr.nextInt();
            mtr.nextLine();
        }
        for (int i = 0; i < califa.length; i++) {
            System.out.print(nombre[i]  +":"+ califa[i]+"-");
        }
    }
}
