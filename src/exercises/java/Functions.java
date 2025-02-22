/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises.java;
import java.util.Scanner;

/**
 *
 * @author SamKarsa
 */
public class Functions {
//3
//3.1 Crear una función llamada "suma", que reciba como parámetros dos números enteros y devuelva como resultado 
// otro número entero que sea la suma de ambos. 
    public static int sum(int a, int b){
        return a+b;
    }
    
//3.2 Crear una función llamada "division", que reciba como parámetros dos números enteros y devuelva como
//resultado un número real, que sea el resultado de dividir el primer número entre el segundo (con decimales). 
    public static double divisor(int numerador, int divisor){
        return numerador/divisor;
    }
    
//3.3 Crear una función llamada "letraRepetida", que reciba como parámetros una letra y un número, y escriba en
//pantalla esa letra repetida en pantalla varias veces (tantas como indique el número), sin devolver ningún valor.
    public static void letraRepetida(char letter, int num){
        for(int i=0; i<num; i++){
            System.out.print(letter + " ");
        }
        System.out.println("");
    }
    
//3.4 Crear una función llamada "rotulo", que tome como parámetro una cadena de texto, no devuelva ningún valor, y
//escriba en pantalla ese texto centrado (suponiendo una anchura de pantalla de 80 letras) y en la línea siguiente
//escriba guiones para que el rótulo parezca subrayado (tantos guiones como letras formen la palabra).
    public static void rotulo(String chain){
        int size = (80 - chain.length())/2;
        
        for(int i=0; i<size; i++){
            System.out.print(" ");
        }
        System.out.print(chain);
        for(int i=0; i<size; i++){
            System.out.print(" ");
        }
        System.out.println("");
        
        for(int i=0; i<size; i++){
            System.out.print(" ");
        }
        for(int i=0; i<chain.length(); i++){
            System.out.print("-");
        }
        for(int i=0; i<size; i++){
            System.out.print(" ");
        }
        System.out.println("");
    }
    
//3.5 
//Crea dos funciones "solucionRC1" y "solucionRC2" que devuelvan las dos raíces de una ecuación de segundo
//grado. Además, deberás crear una función "existeSolucionRC", que devuelva un 1 si la raíz cuadrada tiene
//solución, o un 0, si no la tiene. 
    public static void solucionRC1(){
    
    }
    
    
    public static void main(String[] args){
        //3.1 Hacemos uso de la funcion de suma
        /*
        int suma = suma(2, 4);
        System.out.println(suma);
        */
        
        //3.2 Hacemos uso de la funcion de division
        /*
        double division = divisor(12,2);
        System.out.println(division);
        */
        
        //3.3 Hacemos uso de la funcion de letterRepetida
        /*
        letraRepetida('a', 20);
        */
        
        //3.4 Hacemos uso de la funcion de rotulo
        /*
        rotulo("samue");
        */
        
        //3.5 Hacemos uso de la funcion de 
    
    }
}
