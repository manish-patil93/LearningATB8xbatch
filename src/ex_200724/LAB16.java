package ex_200724;

import java.util.Scanner;
public class LAB16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int user_input = sc.nextInt();  /// command user to enter input
        System.out.println(user_input);



        if (user_input%2==0) {
            System.out.println("even");
        } else {
            System.out.println("odd");


        }


    }
}
