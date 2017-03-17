/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serializar;

import java.io.*;
public class PersistenciaUsuario {
 
    /*
      Primer metodo de tipo accion guardar
    */
    public void guardar(Usuario u)throws Exception{
        File file=new File("basesita-usuarios");
        FileOutputStream fos=new FileOutputStream(file);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
         oos.writeObject(u);
    }
    
    /*
    primero obtenemos la busqueda
    */
    public Usuario busarPorNombre(String nombre)throws Exception{
        File file=new File("basesita-usuarios");
        FileInputStream fis=new FileInputStream(file);
        ObjectInputStream ois=new ObjectInputStream(fis);
        Usuario encontrado=null;
   Usuario u=     (Usuario) ois.readObject();
       //Comparamos
       if(u.getNombre().equals(nombre))encontrado=u;
       return encontrado;
    }
}
