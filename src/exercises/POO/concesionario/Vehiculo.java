/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises.POO.concesionario;

/**
 *
 * @author SamKarsa
 */
public class Vehiculo {
    private String brand;
    private int model;
    private String references;
    private double price;

    public Vehiculo(String brand, int model, String references, double price) {
        this.brand = brand;
        this.model = model;
        this.references = references;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getReferences() {
        return references;
    }

    public void setReferences(String references) {
        this.references = references;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "brand=" + brand + ", model=" + model + ", references=" + references + ", price=" + price + '}';
    }
  
}
