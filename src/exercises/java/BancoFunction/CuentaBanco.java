/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises.java.BancoFunction;
import java.util.Scanner;
/**
 *
 * @author SamKarsa
 */
public class CuentaBanco {
    // Funciones:
    public static double consultaSaldo(){
        double saldo = 123897.4;
        return saldo;
    }
    
    public static double hacerRetiro(){
        Scanner scanner =new Scanner(System.in);
        double valor = scanner.nextDouble();
        double amount = consultaSaldo(); 
        if(valor > amount){
            System.out.println("No tienes fondos suficiente");
            return amount;
        }
        return amount-valor;
    }
    
    public static double hacerConsignacion(){
        Scanner scanner =new Scanner(System.in);
        double valor = scanner.nextDouble();
        double amount = consultaSaldo(); 
        if(valor <= 0){
            System.out.println("El monto tiene que ser mayor a cero");
            return amount;
        }
        return amount+valor;
    }
    
    // M�todo Main:
    public static void main(String[] args){
        String usuario = "Eder Lara T";
        while(true){
            System.out.println("Hola Usuario" + usuario+"\n");
            System.out.println("�Qu� quieres hacer el d�a de hoy?\n");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Hacer Retiros");
            System.out.println("3. Hacer Consignaci�n");
            System.out.println("4. Salir");
            
            Scanner scanner =new Scanner(System.in);
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            if (opcion == 4){
                break;
            }
            
            double saldo;
            switch(opcion){
                case 1:
                    System.out.println("Consultando Saldo ...");
                    saldo = consultaSaldo();
                    System.out.println(saldo);
                    break;
                case 2:
                   System.out.println("Retirando ...");
                   saldo = hacerRetiro();
                   System.out.println(saldo);
                   break; 
                case 3:
                   System.out.println("Consignando ...");
                   saldo = hacerConsignacion();
                   System.out.println(saldo);
                   break; 
                default:
                    break;
            }
        }
    }
}

