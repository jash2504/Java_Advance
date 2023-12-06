/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iterator_;

/**
 *
 * @author hp pavailion
 */
import java.util.*;

public class Iterator_ {

    public static void main(String[] args) {
        List<student> l = new ArrayList<>(5);
        l.add(new student(1, "jash"));
        l.add(new student(2, "nirj"));
        l.add(new student(3, "dhruv"));
//        l.add(new student(3, "dhruv"));

//        Iterator<student> ir = l.iterator();
//        student s;
//        while (ir.hasNext()) {
//            s = ir.next();
//            System.out.print("id = " + s.getId());
//            System.out.println(" name = " + s.getName());
//
//        }
        for (student st : l) {
            System.out.print("id = " + st.getId());
            System.out.println(" name = " + st.getName());

        }

    }

}
