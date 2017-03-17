/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread2;

/**
 *
 * @author campitos
 * SEgunda forma de crear threads implmentando
 * la interface runnable
 */
public class TareaMejor implements Runnable{
    public static void main(String[] args) {
        
        //CRear el thread
        Runnable r=new TareaMejor();
        Thread t1=new Thread(r);
        //Iniciarlo:
        
        t1.start();
        
        
    }

    @Override
    public void run() {
        System.out.println("Soy u thread mejor");
    }
}
