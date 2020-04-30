import java.util.Scanner;
public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int sum = 0;
        int i  = scanner.nextInt();
        while(i > 0)
        { n = i % 10;
        sum= sum + n;
        i = i / 10;
        }
        System.out.println("Sum of Digits is "+sum);
    }

}
