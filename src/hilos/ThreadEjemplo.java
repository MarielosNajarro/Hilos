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
public class ThreadEjemplo extends Thread{
    private String mensaje;
    
    public ThreadEjemplo(String msg){
        super(msg);
    }
    public void run(){
        for(int i = 0 ; i<10 ; i++){
            System.out.println(mensaje);
        }
        System.out.println("Este proceso ha terminado: " + this.getName());
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
}
