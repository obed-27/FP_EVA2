/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_practico_segunda_evaluacion;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EXAMEN_PRACTICO_SEGUNDA_EVALUACION {

    public static void main(String[] args) {
        Scanner mtr = new Scanner(System.in);
        double computadora=Math.random();
        double comparador;
        int jugador, gndrcompu=0,gndrjgdr=0,empate=0;
        do{
            System.out.println("0=piedra");
            System.out.println("1=papel");
            System.out.println("2=tijera");
            System.out.println("para determinar que quieres acabar el juego introduzca un numero mayor o igual a 3");
            System.out.println("inserta el numero segun tu desicion ");
            jugador=mtr.nextInt();
            
            System.out.println("Ganados por la computadora ="+gndrcompu);
            System.out.println("Ganados por el usuario = "+gndrjgdr);
            System.out.println("Empates = "+empate);
        }while(jugador <3);
        
    }
}
