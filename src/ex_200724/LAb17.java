package ex_200724;
import java.util.Scanner;
public class LAb17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number 1");
        int user_input = sc.nextInt();  /// command user to enter input

        System.out.println("enter the number 2");
        int user_input_2 = sc.nextInt();  /// command user to enter input

        System.out.println(user_input);
        System.out.println(user_input_2);

        if (user_input_2 % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}

