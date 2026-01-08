/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestor_curso;

import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class Alumno {

    private String dni;
    private String nombre;
    private Double notaProg;
    private Double notaBD;

    
    // CONSTRUCTOR
    public Alumno(String dni, String nombre, Double notaProg, Double notaBD) {
        this.dni = dni;
        this.nombre = nombre;
        this.notaProg = ajustarNota(notaProg);
        this.notaBD = ajustarNota(notaBD);
    }
    
    
    // GETTER/SETTER
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getNotaProg() {
        return notaProg;
    }

    public void setNotaProg(Double notaProg) {
        this.notaProg = ajustarNota(notaProg);
    }

    public Double getNotaBD() {
        return notaBD;
    }

    public void setNotaBD(Double notaBD) {
        this.notaBD = ajustarNota(notaBD);
    }
    
    
    // METODOS
    public static int cuentas(Alumno[] alumnos, String mensaje, Scanner sc){
        int opcion = -1;
        
        do {
            try {
                System.out.print(mensaje);
                opcion = sc.nextInt();
                
                if (opcion < 1 || opcion > alumnos.length) {
                    System.err.println("Error : Opcion inexistende");
                    opcion = -1;
                }
                
            } catch (Exception e) {
                System.err.println("Error : Has introducido un caracter no numerico");
                sc.nextLine();
                opcion = -1;
            }
        } while (opcion < 1 || opcion > alumnos.length);
        
        sc.nextLine();
        return opcion;
    }
    
    public static double leernota(String mensaje, Scanner sc){
        
        double nota = -1;
        
        do {                        
            try {
                System.out.print(mensaje);
                nota = sc.nextDouble();
                
                if(nota < 0 || nota > 10)       
                    System.err.println("Error : Has introducido una fuera de lo normal");
                
            } catch (Exception e) {
                System.err.println("Error : Has introducido caracter no numericos");
                sc.nextLine();
                nota = -1;
            }
        } while (nota < 0 || nota > 10);
        
        sc.nextLine();
        return nota;
    }
    
    public static boolean dniExiste(Alumno[] alumnos, String dni){
        
        boolean Existe = false;
        
        for (Alumno a : alumnos) {
            if (a != null && a.getDni().equalsIgnoreCase(dni)) Existe = true; 
        }
        
        return Existe;
    }
    
    private double ajustarNota(double nota) {
        
        if (nota < 0) nota = 0; 
        if (nota > 10)  nota = 10;
        
        return nota;
    }
    
    public double calcularMedia() {
        
        double media = (notaBD + notaProg) / 2;
        
        return media;
    }
    
    @Override
    public String toString(){
        return "DNI : " + dni 
                + "\tNombre : " + nombre 
                + "\tProg : " + String.format("%.2f", notaProg)
                + "\tBD : " + String.format("%.2f", notaBD)
                + "\tMedia : " + String.format("%.2f",calcularMedia());
    }
    
}
