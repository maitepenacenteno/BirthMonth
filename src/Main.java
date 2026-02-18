import java.util.Scanner;

public class Main {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleaser enter your birth month: ");
        int N = scanner.nextInt();
        
        if (N >= 1 && N <= 12)
        {
            System.out.println("Your birth month is: " + N);
        }
        else
        {
            System.out.println("You entered an incorrect month value: " + N);
        }
    }
}

