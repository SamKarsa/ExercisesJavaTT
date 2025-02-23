/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises.POO.concesionario;
import java.util.ArrayList;

/**
 *
 * @author SamKarsa
 */
public class Concesionario {
    /**
     * @param  
    */
    
    private ArrayList<Cliente> clientes;
    private ArrayList<Vendedor> vendedores;
    private ArrayList<Venta> ventas;
    private Inventario inventario;
    
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
        //Instanciamos clases
        Concesionario concesionario = new Concesionario();
        
        //Crear objetos
        
        
        
        
        
    }
    
}
