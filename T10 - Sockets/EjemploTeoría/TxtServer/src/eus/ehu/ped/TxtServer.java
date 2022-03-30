/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author gorka
 */
public class TxtServer {

    public static void main(String[] args) {
        try(ServerSocket ss = new ServerSocket(Service.PORT)) {            
            do {
                System.out.println("Esperando cliente ...");
                try(Socket cs = ss.accept()) {
                    System.out.println("Nuevo cliente: " + cs.getInetAddress().getHostAddress());
                    File dir = serve(cs);
                    System.out.println("Directorio: " + dir.getAbsolutePath());
                    System.out.println();
                } catch( Exception e ) {
                    System.err.printf("Error al atender al cliente: %s\n", e.getMessage());
                }
            } while( true );
        } catch( Exception e ) {
            System.err.printf("Error al esperar clientes: %s\n", e.getMessage());
        }
    }

    private static File serve(Socket cs) throws IOException {
        try(
            BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
            PrintWriter pw = new PrintWriter(cs.getOutputStream(), true);
        ) {
            File dir = new File(br.readLine());
            String[] entries = dir.list();
            if( entries == null ) {
                pw.println("KO");
                pw.println("No existe el directorio");
            } else {
                pw.println("OK");
                pw.println(entries.length);
                for( String entry : entries )
                    pw.println(entry);
            }
            return dir;
        }
    }
    
}
