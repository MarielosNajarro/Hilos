/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilos;

/**
 *
 * @author MARIELOS
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreadEjemplo hilo1 = new  ThreadEjemplo("Hilo 1");
        ThreadEjemplo hilo2= new  ThreadEjemplo("Hilo 2");
        
        hilo1.setMensaje("Este es el mensaje del hilo 1");
        hilo2.setMensaje("Mensaje del hilo 2");
        
        hilo1.start();
        hilo2.start();
    }
    
}
