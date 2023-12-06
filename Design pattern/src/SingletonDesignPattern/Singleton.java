/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingletonDesignPattern;

/**
 *
 * @author hp pavailion
 */
public class Singleton {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstace();
        Logger logger2 = Logger.getInstace();

        System.out.println(logger1);
        System.out.println(logger2);
    }

}
