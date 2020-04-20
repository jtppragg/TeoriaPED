/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;

import eus.ehu.ped.comun.Protocolo;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.BindException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author docencia
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(ServerSocket ss = new ServerSocket(Protocolo.PORT)) {
            while(true) {
                System.out.println("Esperando nuevo cliente ...");
                try(
                    Socket cs = ss.accept();
                    DataOutputStream dos = new DataOutputStream(cs.getOutputStream());
                    DataInputStream dis = new DataInputStream(cs.getInputStream());
                ) {                    
                    System.out.println("Qué bien, conectado cliente: " + cs.getInetAddress().getHostAddress());
                    String txt = dis.readUTF();
                    System.out.println("Recibido del cliente: " + txt);
                    dos.writeUTF(txt.toUpperCase());
                }
                System.out.println();
            }
        } catch(BindException ex) { 
            System.out.println("¿Te has acordado de detener la ejecución anterior?");
        } catch (IOException ex) {
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Servidor terminado");
    }
    
}
