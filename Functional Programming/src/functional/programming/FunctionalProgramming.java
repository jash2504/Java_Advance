package functional.programming;

/**
 *
 * @author hp pavailion
 */
interface APart {

    int sum(int c, int b);

    default int sub(int a, int b) {
        return a - b;
    }

    default int mul(int a, int b) {
        return a * b;
    }

    default int div(int a, int b) {
        return a - b;
    }

}

public class FunctionalProgramming {

    public static void main(String[] args) {

        APart a = (int b, int c) -> {

            return b + c;

        };

        System.out.println(a.sum(10, 55));
        System.out.println(a.sub(10, 55));
        System.out.println(a.mul(10, 55));
        System.out.println(a.div(10, 55));

    }
}
