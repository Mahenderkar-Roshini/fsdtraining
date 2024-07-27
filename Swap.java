import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        int a = 30, b = 6;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a + ", b = " + b);
    }
}