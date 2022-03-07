/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eus.ehu.ped.domain;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "ServicioFicheros")
public class ServicioFicheros {

    @WebMethod(operationName = "hello")
    public List<String> listar(@WebParam(name = "directorio") String directorio) {
        File dir = new File(directorio);
        if( !dir.isDirectory() )
            return null;
        List<String> lista = new ArrayList<>();
        for( File file : dir.listFiles() )
            if( file.isFile() && !file.isHidden() )
                lista.add(file.getName());
        return lista;
    }
}
