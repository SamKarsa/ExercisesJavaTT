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
public class Conditionals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//PUNTO 1
//1.1 Escribir un programa que solicite un valor entero al usuario y determine si es par o impar.

/*  
    System.out.print("Ingresa un valor entero");
    int num = scanner.nextInt();

    if (num%2==0){
        System.out.println("El numero es par");
    }
    else{
        System.out.println("El numero es impar");
    }
    scanner.close();*/
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------   
        //1.2       Escribir un programa que solicite un valor entero al usuario y determine si es positivo o negativo

        /* 
    System.out.print("Ingresa un numero: ");
    int num = scanner.nextInt();

    if(num >= 0){
        System.out.print("El numero es positivo");
    }
    else {
        System.out.print("El numero es negativo");
    } 
    scanner.close();*/
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------    
        //1.3 Pedir al usuario un valor. Si el valor es positivo, pedir un segundo valor y calcular la suma, resta y producto de ambos. Mostrar los resultados por pantalla. 

        /*  
    System.out.print("Ingresa un numero: ");
    int num1 = scanner.nextInt();

    if (num1 >= 0 ){
        System.out.print("Ingresa otro numero: ");
        int num2 = scanner.nextInt();

        System.out.println("La suma de los numeros es: " + (num1+num2));
        System.out.println("La resta de los numeros es: " + (num1-num2));
        System.out.println("La multiplicacion de los numeros es: " + (num1*num2));
    }
    else {
        System.out.print("Chao con adios");
    }
    scanner.close(); 
         */
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //1.4 Calcular el mayor de dos números enteros introducidos por teclado. 
        /*  
    System.out.print("Ingresa un numero: ");
    int num1 = scanner.nextInt();

    System.out.print("Ingresa otro numero: ");
    int num2 = scanner.nextInt();

    if (num1>num2){
        System.out.println("El numero " + num1 + " es mayor");
    }
    else {
        System.out.println("El numero " + num2 + " es mayor");
    }
    scanner.close(); 
         */
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//1.5 Calcular el mayor de tres números enteros introducidos por teclado.
        /* 
    System.out.print("Ingresa un numero: ");
    int num1 = scanner.nextInt();

    System.out.print("Ingresa otro numero: ");
    int num2 = scanner.nextInt();

    System.out.print("Ingresa otro numero: ");
    int num3 = scanner.nextInt();

    if (num1>num2 && num1>num3){
        System.out.println("El numero " + num1 + " es mayor");
    }
    else if (num2>num3 && num2>num1){
        System.out.println("El numero " + num2 + " es mayor");
    }
    else if (num3>num2 && num3>num1){
        System.out.println("El numero " + num3 + " es mayor");
    }
    else {
        System.out.println("son iguales");
    }
    scanner.close();  
         */
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//1.6 Calcular el mayor de cuatro números enteros introducidos por teclado.

        /* 
    System.out.print("Ingresa un numero: ");
    int num1 = scanner.nextInt();

    System.out.print("Ingresa otro numero: ");
    int num2 = scanner.nextInt();

    System.out.print("Ingresa otro numero: ");
    int num3 = scanner.nextInt();

    System.out.print("Ingresa otro numero: ");
    int num4 = scanner.nextInt();

    if (num1>num2 && num1>num3 && num1>num4){
        System.out.println("El numero " + num1 + " es mayor");
    }
    else if (num2>num3 && num2>num1 && num2>num4){
        System.out.println("El numero " + num2 + " es mayor");
    }
    else if (num3>num2 && num3>num1 && num3>num4){
        System.out.println("El numero " + num3 + " es mayor");
    }
    else if (num4>num2 && num4>num1 && num4>num3){
        System.out.println("El numero " + num4 + " es mayor");
    }
    else {
        System.out.println("son iguales");
    }
    scanner.close(); 
         */
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//1.7 Determinar en que estado está el agua en función de su temperatura. Si es negativa el estado será sólido, si es menor que 100 será líquido y si es mayor que 100 será gas. Pedir al usuario el valor de la temperatura.

        /* 
    System.out.print("Ingresa el temperatura del agua: ");
    int temperatura = scanner.nextInt();
 
    if (temperatura>100){
        System.out.println("El agua esta en estado gaseoso");
    }
    else if (temperatura<=100 && temperatura>=0){
        System.out.println("El agua se encuentra en estado liquido");
    }
    else {
        System.out.println("El agua se encuentra en estado solido");
    }
    scanner.close(); */
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//1.8 Un año es bisiesto si es divisible por 4 y no es por 100, o si es divisible por 400. Escribe un programa que lea un año y devuelva si es bisiesto o no.

/* 
    System.out.print("Ingresa un year: ");
    int year = scanner.nextInt();
 
        
    if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
        System.out.println("Ek año es bisiesto");
    }
    else {
        System.out.println("El año no es bisiesto");
    }
    scanner.close(); 
*/

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// EJEMPLO DE SWITCH 
 
/*
    System.out.print("1.Saludo\n2.Chao\nElige una opcion: ");
    int opcion = scanner.nextInt();
        
    switch (opcion){
        case 1:
            System.out.println("Hello World!");
            break;
        case 2:
            System.out.println("Good Bye!");
            break;
        default:
            System.out.println("ERROR");
            break;     
        }
*/
    }
}
