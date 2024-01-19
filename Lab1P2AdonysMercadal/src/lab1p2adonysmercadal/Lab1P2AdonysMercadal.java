/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2adonysmercadal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author adony
 */
public class Lab1P2AdonysMercadal {
 public static ArrayList<Usuario> usuarios = new ArrayList();
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
                    ingresarDatos();
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
    public static void ingresarDatos() throws ParseException {
        SimpleDateFormat osd = new SimpleDateFormat("yyyy/MM/dd");
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresar su nombre del usuario"); 
        String nombre = input.nextLine();
        System.out.println("Ingresar su apellido");
        String apellido = input.nextLine();
        System.out.println("Ingresar fecha de nacimiento formato(yyyy/MM/dd");
        String fecha = input.nextLine();
        Date fechaNaci = osd.parse(fecha);
        System.out.println("Ingresar su correo electronico ");
        String correo = input.nextLine();
        System.out.println("Ingresar contraseña");
        String contra = input.nextLine();
        Usuario nuevoUsuario = new Usuario(nombre,apellido,fechaNaci,correo,contra);
        
    }
    public static void listarDatos(){
        
    }
    public static void listarDominio(){
        
    }
}