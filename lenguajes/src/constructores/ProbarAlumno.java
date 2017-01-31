package constructores;

import javax.swing.*;
public class ProbarAlumno {
    public static void main(String[] args) {
        
        Alumno a=new Alumno();
        
        Alumno a2=new Alumno("Juan");
        
 System.out.println("Tu nombre es "+a2.getNombre());
        
        JFrame ventana=new JFrame("hola");
               ventana.setSize(200,120);
               ventana.setVisible(true);
        
    }
}
