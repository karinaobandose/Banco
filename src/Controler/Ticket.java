/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controler;

import static java.util.Collections.list;
import static javax.swing.text.html.HTML.Tag.P;

/**
 *
 * @author Student
 */
public class Ticket {
   public static int numP = 0;
   public static int numA = 0;
   public static int numC = 0;
   private listTicket list;
   
    public static int getNumP() {
        return numP;
    }

    public static void setNumP(int numP) {
        Ticket.numP = numP;
    }

    public static int getNumA() {
        return numA;
    }

    public static void setNumA(int numA) {
        Ticket.numA = numA;
    }

    public static int getNumC() {
        return numC;
    }

    public static void setNumC(int numC) {
        Ticket.numC = numC;
    }

    public Ticket() {
        switch (Ticket.agregar){
            case numP:
                numP++;
                list.agregarP(this);
            case numC:
                numC++;
                list.agregarC(this);
            case numA:
                numA++;
                list.agregar(this);
                   
    }
                
    }
   
   
}
