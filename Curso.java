/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestor_curso;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class Curso {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        boolean verificar = false;
        int opciones = 0;
        int tamaño = 0, index = 0, contador = 0, cuentas = 0;
        double notaPROG = 0, notaBD = 0;
        String dni = "", nombre = "";
        
        do {
            try {
                System.out.print("\nIntroduce el tamaño de alumnos : ");
                tamaño = sc.nextInt();
                
                if (tamaño < 0) System.err.println("Error : Has introducido un tamaño negativo");
                
            } catch (Exception e) {
                System.err.println("Error : Has introducido un caracter no numerico");
                sc.nextLine();
            }
        } while (tamaño < 0);
        
        Alumno[] alumnos = new Alumno[tamaño];
        
        do {
            
            System.out.println("\n|=== === MENU === ===|\n");
            
            System.out.println("0.- Salir");
            System.out.println("1.- Alta alumno");
            System.out.println("2.- Listar alumnos");
            System.out.println("3.- Buscar alumnos por dni y mostrarlo");
            System.out.println("4.- Modificar nota de Progrmacion");
            System.out.println("5.- Modificar nota de BD");
            System.out.println("6.- Mostrar estadisticas del curso");
            System.out.println("7.- Eliminar alumno");
            System.out.println("8.- Simulacion");
            
            do {
                try {
                    System.out.print("\nIntroduce la opcion deseada : ");
                    opciones = sc.nextByte();
                    
                    if(opciones < 0 || opciones > 8) System.err.println("Error : Opcion invalida");
                    
                } catch (Exception e) {
                    System.err.println("Error : Has introducido un caracter no numerico");
                    sc.nextLine();
                }
            } while (opciones < 0 || opciones > 8);
            sc.nextLine();
            
            switch (opciones) {
                case 0:
                    System.out.println("ADIOOSSSS");
                    break;
                    
                case 1:
                    
                    if (index != alumnos.length) {
                        do {
                            verificar = true;

                            System.out.print("\nIntroduce su DNI (7 numeros y 1 letra): ");
                            dni = sc.nextLine().strip().trim();

                            if (dni.length() != 8) {
                                System.err.println("Error : Debe tener 8 caracteres");
                                verificar = false;
                            } else {

                                String digitos = dni.substring(0,7);
                                char letra = dni.charAt(7);

                                if(!digitos.matches("\\d{7}")){
                                    System.err.println("Error : No has introducido los 7 digitos");
                                    verificar = false;
                                }

                                if(!Character.isLetter(letra)){
                                    System.err.println("Error : No has introducido la letra");
                                    verificar = false;
                                }

                                if (Alumno.dniExiste(alumnos, dni)) {
                                    System.err.println("Error : Has introducido un DNI registrado");
                                    verificar = false;
                                }

                            }

                        } while (!verificar);

                        do {
                            verificar = true;

                            System.out.print("\nIntroduce su nombre : ");
                            nombre = sc.nextLine();

                            if (!nombre.matches("[\\p{L}]+")) {
                                System.err.println("Error : Has introducido numeros en su nombre");
                                verificar = false;
                            }

                        } while (!verificar);

                        notaPROG = Alumno.leernota("\nIntroduce la nota de Prog : ", sc);

                        notaBD = Alumno.leernota("\nIntroduce la nota de Ba : ", sc);

                        alumnos[index++] = new Alumno(dni, nombre, notaPROG, notaBD);
                    }
                    
                    break;    
                    
                case 2:
                    
                    cuentas = 0;
                    
                    for (Alumno a : alumnos) {
                        if (a != null) {
                            System.out.println(a);
                            contador++;
                        }
                    }
                    
                    if(cuentas == 0) System.out.println("No hay alumnos registrados");
                    
                    if(cuentas == alumnos.length) System.out.println("Esta tope de alumnos registrados");
                    
                    if (cuentas > 0) System.out.println("Puedes llenar " + (alumnos.length-cuentas) + " alumnos");
                    
                    break; 
                    
                case 3:
                    
                    System.out.println("");
                    
                    break; 
                    
                case 4:
                    contador = 1;
                    
                    for (Alumno a : alumnos) {
                        if (a != null) {
                            System.out.println(contador + ".- " + a.getNombre());
                        }
                    }
                    
                    opciones = Alumno.cuentas(alumnos, "\nIntroduce la cuenta deseada para modificar la nota de programacion : ", sc);
                    
                    
                    
                    
                    break;     
                    
                case 5:
                    contador = 1;
                    
                    for (Alumno a : alumnos) {
                        if (a != null) {
                            System.out.println(contador + ".- " + a.getNombre());
                        }
                    }
                    
                    opciones = Alumno.cuentas(alumnos, "\nIntroduce la cuenta deseada para modificar la nota de BD : ", sc);
                    
                    
                    
                    break;     
                    
                case 6:
                    System.out.println("ADIOOSSSS");
                    break; 
                    
                case 7:
                    System.out.println("ADIOOSSSS");
                    break; 
                    
                case 8:
                    System.out.println("ADIOOSSSS");
                    break;     
            }
            
        } while (opciones != 0);
        
    }
    
}
