/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collection;

/**
 *
 * @author hp pavailion
 */
import java.util.*;

public class Collection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s;
        int i;

        Map<Integer, String> sm = new HashMap<>();
        sm.put(1, "jash");
        sm.put(2, "Riya");
        sm.put(3, "Nirj");

        i = 12;
        s = sm.get(i);

        System.out.println(i + " " + s);
    }

}
