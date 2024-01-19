/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2adonysmercadal;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author adony
 */
public class Lab1P2AdonysMercadal {
    public static Date fechaNaci = null;
    public static ArrayList<Usuario> usuarios = new ArrayList();
    public static DateFormat osd = new SimpleDateFormat("yyyy/MM/dd");
    public static Date fechaAct = new Date();
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
            System.out.println("4.Salir");
            int opc = input.nextInt();
            switch (opc) {
                case 1:
                    System.out.println("Ingresar su nombre del usuario");
                    String nombre = input.nextLine();
                    nombre = input.nextLine();
                    System.out.println("Ingresar su apellido");
                    String apellido = input.nextLine();
                    boolean validar = validarDatos();
                    if (validar == false){
                        break;
                    }
                    System.out.println("Ingresar su correo electronico ");
                    String correo = input.nextLine();
                    System.out.println("Ingresar contraseña");
                    String contra = input.nextLine();
                    Usuario nuevoUsuario = new Usuario(nombre, apellido, fechaNaci, correo, contra);
                    break;
                case 2:
                    System.out.println("Listar Todo");
                    for (int i = 0; i < usuarios.size(); i++) {
                        Usuario usuarioIm = usuarios.get(i);
                        System.out.println(usuarioIm);
                        System.out.println("");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        }

    }

    public static boolean validarDatos() {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresar fecha de nacimiento formato(yyyy/MM/dd)");
        String fecha = input.nextLine();
        try {
            fechaNaci = osd.parse(fecha);
            return true;
        } catch (ParseException ex) {
            System.out.println("Error, Ingrese la fecha con el formato correcto");
            return false;
        }
    }

    public static void listarDatos() {

    }

    public static void listarDominio() {

    }
}
