/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises.POO.concesionario;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author SamKarsa
 * @change 
 */
public class Concesionario {
    /**
     * @param  
    */
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<Venta> ventas;
    private Inventario inventario;

    
    //Constructor de Concesionario
    public Concesionario() {
        this.clientes = new ArrayList<>();
        this.vendedores = new ArrayList<>();
        this.ventas = new ArrayList<>();
        this.inventario = new Inventario();
    }
    
    //Method to add clients 
    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    // Method get to view the clients 
    public ArrayList<Cliente> getClientes(){
        return clientes;
    }
    
    //Method to add selling
    public void addVendedor(Vendedor vendedor){
        vendedores.add(vendedor);
    }
    
    // Method get to view the sellings
    public ArrayList<Vendedor> getVendedores(){
        return vendedores;
    }
    
    //Method to add Vehiculo
    public void addVehiculo(Vehiculo vehiculo){
        inventario.addVehiculo(vehiculo);
    }
    
    //Mehtod to remove Vehiculo
    public void removeVehiculo(Vehiculo vehiculo){
        inventario.removeVehiculo(vehiculo);
    }
    
    //Method get to view the Vehiculos
    public ArrayList<Vehiculo> getVehiculos() {
        return inventario.getVehiculos();
    }
    
    public void addVenta(Vendedor vendedor, Cliente cliente, Vehiculo vehiculo, String fecha_venta) {
        Venta venta = new Venta(vendedor, cliente, vehiculo, fecha_venta);
        ventas.add(venta);
    }
    
    public static void main(String[] args){
        //Inicializamos el variables para la interfaz 
        Scanner scanner = new Scanner(System.in);
        int opcion;

        //Instanciamos clases
        Concesionario concesionario = new Concesionario();
        
        
        while(true){
             //Hacemos interfaz 
            System.out.print("1. Registrar a un cliente\n2. Registrar a un vendedor\n3. Registrar un vehiculo\n4. Salir\nSelecciona una opcion: ");
            opcion = scanner.nextInt();

            switch(opcion){
                case 1:
                    DatosCliente();
                    break;
                case 2:
                    DatosVendedor();
                    break;
                case 3:
                    DatosVehiculos();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default :
                    break;
            }
        }
    }

    //funciones para pedir la interfaz
    public static void DatosCliente(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los datos del Cliente:");
        
        System.out.print("ID Cliente: ");
        String id = sc.nextLine();
        
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Dirección: ");
        String direccion = sc.nextLine();
        
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();
        
        System.out.print("1.Si\n2.No\nCrear cliente: ");
        int opcion = sc.nextInt();
        
        if(opcion==1){
            Cliente cliente1 = new Cliente(id, dni, nombre, direccion, telefono);
        }
    }
    
    public static void DatosVendedor(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese los datos del Vendedor:");
        
        System.out.print("ID Vendedor: ");
        String id = sc.nextLine();
        
        System.out.print("DNI: ");
        String dni = sc.nextLine();
        
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        
        System.out.print("Dirección: ");
        String direccion = sc.nextLine();
        
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();
        
        System.out.print("1.Si\n2.No\nCrear cliente: ");
        int opcion = sc.nextInt();
        
        if(opcion==1){
            Vendedor vendedor1 = new Vendedor(id, dni, nombre, direccion, telefono);
        }
    }
    
    public static void DatosVehiculos(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese los datos del Vehículo:");
        
        System.out.print("Marca: ");
        String marca = sc.nextLine();
        
        System.out.print("Año: ");
        String año = sc.nextLine();
        
        sc.nextLine();  // Limpiar buffer después de nextInt
        
        System.out.print("Modelo: ");
        int modelo = sc.nextInt();
        
        System.out.print("Precio: ");
        double precio = sc.nextDouble();
        
        System.out.print("1.Si\n2.No\nCrear cliente: ");
        int opcion = sc.nextInt();
        
        if(opcion==1){
            Vehiculo vehiculo1 = new Vehiculo(marca, modelo, año, precio);
        }
    }
    
    @Override
    public String toString() {
        return "Concesionario{" + "clientes=" + clientes + ", vendedores=" + vendedores + ", ventas=" + ventas + ", inventario=" + inventario + '}';
    }
    
    
    
}
