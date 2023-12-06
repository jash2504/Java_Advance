/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SingletonDesignPattern;

/**
 *
 * @author hp pavailion
 */
public class Logger {

    private Logger() {
    }

    ;




    public static class LoggerHolder {

        public static Logger l = new Logger();

    }

    public static Logger getInstace() {
        return LoggerHolder.l;
    }

    public void log(String s) {

        System.err.println(s);
    }
}
