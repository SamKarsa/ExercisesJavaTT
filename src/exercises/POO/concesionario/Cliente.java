/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises.POO.concesionario;

/**
 *
 * @author SamKarsa
 */
public class Cliente extends Persona {
    private String clientCode;

    public Cliente(String ClientCode, String id, String name, String address, String phone) {
        super(id, name, address, phone);
        this.clientCode = ClientCode;
    }

    public String getClientCode() {
        return clientCode;
    }

    public void setClientCode(String ClientCode) {
        this.clientCode = ClientCode;
    }

    @Override
    public String toString() {
        return "Cliente{" + "ClientCode=" + clientCode + '}';
    }
}
