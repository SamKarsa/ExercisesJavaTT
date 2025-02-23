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
public class Inventario {
    private ArrayList<Vehiculo> vehiculos;

    public Inventario(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }
    
    //Methods 
    public void addVehiculo(Vehiculo vehiculo){
        vehiculos.add(vehiculo);
    }
    
    public void removeVehiculo(Vehiculo vehiculo){
        vehiculos.remove(vehiculo);
    }

    // Getter: 
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    
    
 
    
    
}
