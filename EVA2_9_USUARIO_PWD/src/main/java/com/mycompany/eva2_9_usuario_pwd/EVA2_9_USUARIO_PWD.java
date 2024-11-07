/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_usuario_pwd;

import java.util.Scanner;

/**
 *
 * @author obeds
 */
public class EVA2_9_USUARIO_PWD {

    public static void main(String[] args) {
        String name, pwd;
        Scanner mtr = new Scanner(System.in);
        do{
            System.out.println("nombre de usuario");
            name=mtr.next();
            System.out.println("Contraseña");
            pwd=mtr.next();
        }while(!name.equals("Obed") && !pwd.equals("trazo"));
        System.out.println("BIENVENIDO");
    }
}
