/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package annotation;

import java.lang.annotation.*;
import java.lang.annotation.RetentionPolicy;

/**
 *
 * @author hp pavailion
 */
@test1(value1 = "jash", value2 = "riya")
public class annotation {

    public static void main(String[] args) {
//        annotation a = new annotation();
        String s = annotation.class.getAnnotation(test1.class).value1();
        String s2 = annotation.class.getAnnotation(test1.class).value2();
        System.out.println(s + s2);
    }

}
