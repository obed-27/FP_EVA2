/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EVA2_3_POTENCIA {

    public static void main(String[] args) {
        Scanner mtr = new Scanner(System.in);
        int N, p, R, RR;
        System.out.println("agrega el numero que quieres agregsrle una potencia ");
        N = mtr.nextInt();
        System.out.println("cual es la potencia a la que vas a elevar");
        p=mtr.nextInt();
        R=N;        
        for (int i =2; i <= p; i++){
            R=R*N;
        }
        RR = R +0;
        System.out.println("El resultado es " +RR);
    }
}
