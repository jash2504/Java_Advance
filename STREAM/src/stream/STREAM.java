/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stream;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class STREAM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        System.out.println("METHOD 1 - Creating stream using LIST");
        List<String> name = Arrays.asList("Jash", "Asmani", "Riya", "Jivani");
        name.stream()
                .filter(n -> n.startsWith("J"))
                .sorted()
                .forEach(System.out::println);

        System.out.println("METHOD 2 - Creating stream directly");
        Stream.of("Jash", "Asmani", "Riya", "Jivani")
                .filter(n -> n.startsWith("J"))
                .sorted()
                .forEach(System.out::println);

        System.out.println("METHOD 3 - Creating stream with arrays");
        Arrays.stream(new int[]{11, 12, 13, 14, 15, 16, 17, 18, 19, 20})
                .average()
                .ifPresent(System.out::println);

        System.out.println("Stream for premitive type - IntStream");
//        IntStream.range(0, 10)
//                .forEach(System.out::println);

        System.out.println("Transforming Stream with premitive type - IntStream");
        Arrays.stream(new String[]{"11", "12"})
                .mapToInt(Integer::parseInt)
                .forEach(System.out::println);

        System.out.println("Collect stream into list");
        List<Man> st = Arrays.asList(
                new Man("jash", 1866),
                new Man("riya", 4785),
                new Man("nirj", 1922),
                new Man("jal", 5648),
                new Man("meet", 4687)
        );
//        List<Man> filter = st.stream()
//                .filter(s -> {
//                    return (s.age > 2000);
//                })
//                .collect(Collectors.toList());
//        System.out.println(filter);

    }
}
