import javax.swing.*;
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int i = 100;
        int answer = 0;
        int k;
        if (a > b) {
            k = (b * i) / a;
            answer = k - i;

            System.out.println("Answer is " + answer + "%");
        }else{
            k = (b*i)/a;
            System.out.println("Answer is "+k+"%");
        }
    }
}