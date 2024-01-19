/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2adonysmercadal;

import java.util.Scanner;

/**
 *
 * @author adony
 */
public class Lab1P2AdonysMercadal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int entrar = 1;
        while (entrar == 1) {
            Scanner input = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1.Registar usuario");
            System.out.println("2.Listar Todo");
            System.out.println("3.Listar Por Dominio");
            int opc = input.nextInt();
            switch (opc) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion invalida");
            }
            
        }
        
    }
}
