/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp pavailion
 */
public class MAIN {

    public static void main(String[] args) throws InterruptedException {

        try {

            Network net = new Network();
            net.setIp("192.192.92.1");
            net.loadimpdata();
            System.out.println(net);

            Network net2 = (Network) net.clone();
            System.out.println(net2);

        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }

    }

}
