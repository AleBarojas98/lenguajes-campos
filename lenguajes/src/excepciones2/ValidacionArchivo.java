/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones2;

/**
 *
 * @author campitos
 */
import java.io.*;
public class ValidacionArchivo {
   public static void validarExtencion(File file)throws ExtencionNoValidaException{
       //Preguntamos el nombre
    String nombre= file.getName();
           
    //Como obtener la extenion
     int indice1=   nombre.indexOf(".");
     int indice2=   nombre.length();
     String extencion=nombre.substring(indice1+1, indice2);
       System.out.println(extencion);
     if(!extencion.equals("txt"))
         throw  new ExtencionNoValidaException();
       
   }
   
   public static void validarMayusculas(File file)throws MayusculasException{
       String nombre=file.getName();
       int indice1=   nombre.indexOf(".");
       String name=nombre.substring(0,indice1);
       
       String mayusculas=name.toUpperCase();
    
       if(name.equals(mayusculas))throw new MayusculasException();
       
   }
}
