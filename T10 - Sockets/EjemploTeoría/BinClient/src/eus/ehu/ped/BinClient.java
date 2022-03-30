/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.Socket;

/**
 *
 * @author gorka
 */
public class BinClient {

    public static void main(String[] args) {
        File file = new File("/home/gorka/Descargas/Temp/prueba.txt");
        try(
            InputStream is = new FileInputStream(file);
            Socket socket = new Socket(Service.SERVER, Service.PORT);
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        ) {
            dos.writeUTF(file.getName());
            dos.writeLong(file.length());
            IOUtils.copy(is, dos, Service.BUFFER_SIZE, file.length());
            System.out.println("Enviado fichero: " + IOUtils.info(file));
        } catch( Exception e ) {
            System.err.printf("Error al enviar fichero: %s\n", e.getMessage());
        }
    }
}
