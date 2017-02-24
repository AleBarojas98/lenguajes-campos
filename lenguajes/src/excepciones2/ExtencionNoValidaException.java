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
public class ExtencionNoValidaException extends Exception{
   
    public ExtencionNoValidaException(){
        super("Lo siento pero solo leo archivos txt");
    }
}
