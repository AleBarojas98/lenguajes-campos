/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elimc;


public class Imc {
 private Usuario user;
 
 public Imc(){
     user=new Usuario();
 }
 
 String calcular(){
     
     float imc=user.getPeso()/(user.getAltura()*user.getAltura());
     
     return "Estes es tu imc "+imc;
 }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
