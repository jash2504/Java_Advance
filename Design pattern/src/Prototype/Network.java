/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype;

/**
 *
 * @author hp pavailion
 */
public class Network implements Cloneable {

    private String ip;
    private String impdata;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImpdata() {
        return impdata;
    }

    public void setImpdata(String impdata) {
        this.impdata = impdata;
    }

    public void loadimpdata() throws InterruptedException {
        this.impdata = "IMP DATA............";

//        It will takes 5 min
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return this.ip + " : " + this.impdata;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

}
