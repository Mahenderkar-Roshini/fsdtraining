import java.util.Scanner;
public class OctalToHexa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Octaldecimal number: ");
        String octNumber = scanner.nextLine();
        int decimalNumber = Integer.parseInt(octNumber, 8);
        String hexaNumber = Integer.toHexString(decimalNumber);
        System.out.println("Hexa equivalent: " + hexaNumber);
    }
}