/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1p2adonysmercadal;

import java.util.Date;

/**
 *
 * @author adony
 */
public class Usuario {
    String nombre;
    String apellido;
    String fechaStr;
    Date fechaNacimiento;
    String correo;
    String contra;

    public Usuario(String nombre, String apellido, String fechaStr, Date fechaNacimiento, String correo, String contra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaStr = fechaStr;
        this.fechaNacimiento = fechaNacimiento;
        this.correo = correo;
        this.contra = contra;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaStr() {
        return fechaStr;
    }

    public void setFechaStr(String fechaStr) {
        this.fechaStr = fechaStr;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Nombre: " + nombre + ", Apellido: " + apellido + ", Fecha de Nacimiento: " + fechaStr + ", Correo:" + correo + ", Contraseña" + contra + '}';
    }

}