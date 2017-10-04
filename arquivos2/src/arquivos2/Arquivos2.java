/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivos2;

import java.io.File;


/**
 *
 * @author oracle
 */
public class Arquivos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File mostrar = new File("/home/oracle/NetBeansProjects/arquivos2/arquivosdir");
        File mostrar2 = new File("/home/oracle/NetBeansProjects/arquivos2/arquivosdir/subdir");
        mostrar.list();
        File[]ficheros=mostrar.listFiles();
        File[]ficheros2=mostrar2.listFiles();
        if(ficheros==null && ficheros2==null)
            System.out.println("No hay ficheros en esta carpeta"+mostrar
            +"No hay ficheros en esta carpeta"+mostrar2);
        else{
        for(int i=0;i<mostrar.length();i++){
            for(int u=0;u<mostrar2.length();u++)
            System.out.println(ficheros[i]+"\n"
                    + ""+ficheros2[u]); 
        }
    }
    }
}
