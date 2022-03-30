/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author gorka
 */
public class BinServer {

    public static void main(String[] args) {
        try(ServerSocket ss = new ServerSocket(Service.PORT)) {
            do {
                System.out.println("Esperando cliente ...");
                try(Socket cs = ss.accept()) {
                    System.out.println("Nuevo cliente: " + cs.getInetAddress().getHostAddress());
                    File file = serve(cs);
                    System.out.println("Recibido fichero: " + IOUtils.info(file));
                    System.out.println();
                } catch( Exception e ) {
                    System.err.printf("Error al atender al cliente: %s\n", e.getMessage());
                }             
            } while(true);
        } catch( Exception e ) {
            System.err.printf("Error al esperar clientes: %s\n", e.getMessage());
        }
    }

    private static File serve(Socket cs) throws IOException {
        try(DataInputStream dis = new DataInputStream(cs.getInputStream())) {
            String fileName = dis.readUTF();
            long size = dis.readLong();
            File file = new File("/tmp", fileName);
            try(OutputStream os = new FileOutputStream(file)) {            
                IOUtils.copy(dis, os, Service.BUFFER_SIZE, size);
                return file;
            }
        }
    }
}