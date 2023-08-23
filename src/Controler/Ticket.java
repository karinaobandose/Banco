/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

/**
 *
 * @author Student
 */
public class Ticket {
    private String plataforma;
    private String cajas;
    private String preferencial; 

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getCajas() {
        return cajas;
    }

    public void setCajas(String cajas) {
        this.cajas = cajas;
    }

    public String getPreferencial() {
        return preferencial;
    }

    public void setPreferencial(String preferencial) {
        this.preferencial = preferencial;
    }
    
    

    public Ticket(String plataforma, String cajas, String preferencial) {
        this.plataforma = plataforma;
        this.cajas = cajas;
        this.preferencial = preferencial;
    }
    
    
}
