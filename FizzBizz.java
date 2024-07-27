import java.util.Scanner;
public class FizzBizz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        if (number  % 3 == 0){
            System.out.println("Fizz");
        }
        if (number % 5 == 0){
            System.out.println("Bizz"); 
        }
        if (number % 3 == 0 || number % 5 == 0) {
            System.out.println("FizzBizz");
        }
        scanner.close();
    }
}