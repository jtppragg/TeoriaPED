/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author gorka
 */
public class TxtClient {

    public static void main(String[] args) {
        String dir = "/home/gorka";
        try(
            Socket socket = new Socket(Service.SERVER, Service.PORT);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ) {
            pw.println(dir);
            if( br.readLine().equals("OK") ) {
                int num = Integer.parseInt(br.readLine());
                for( int i = 0; i < num; i++ )
                    System.out.printf("%s (%s bytes)\n", br.readLine(), br.readLine());
            } else
                System.out.println("Error: " + br.readLine());
        } catch( Exception e ) {
            System.err.println("Error al listar directorio: " + e.getMessage());
        }
    }

}
