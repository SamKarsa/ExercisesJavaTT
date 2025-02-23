/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises.POO.concesionario;

import exercises.POO.concesionario.Persona;

/**
 *
 * @author SamKarsa
 */
public class Vendedor extends Persona {
    private String sellingCode;

    public Vendedor(String sellingCode, String id, String name, String address, String phone) {
        super(id, name, address, phone);
        this.sellingCode = sellingCode;
    }

    public String getSellingCode() {
        return sellingCode;
    }

    public void setSellingCode(String sellingCode) {
        this.sellingCode = sellingCode;
    }
    
    @Override
    public String toString() {
        return "Vendedor{" + "sellingCode=" + sellingCode + '}';
    }
    
}
