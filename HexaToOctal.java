import java.util.Scanner;
public class HexaToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexNumber = scanner.nextLine();

        int decimalNumber = Integer.parseInt(hexNumber,16);
        String octalNumber = Integer.toOctalString(decimalNumber);
        System.out.println("octal equivalent: " + octalNumber);
        
    }

}