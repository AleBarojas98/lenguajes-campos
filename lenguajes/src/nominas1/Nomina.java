/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nominas1;

import java.util.Date;

/**
 *
 * @author campitos
 */
public class Nomina {
    private Trabajador worker;
    private Date fechaPago;
    private float saldo;

    public Trabajador getWorker() {
        return worker;
    }

    public void setWorker(Trabajador worker) {
        this.worker = worker;
    }

    public Date getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Date fechaPago) {
        this.fechaPago = fechaPago;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
