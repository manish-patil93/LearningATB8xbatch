package ex_200724;

import java.util.Scanner;
public class LAb24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student score!!!");
        Scanner sc1 = sc;
        int score = sc1.nextInt();

        char grade = 'F';

        if (score > 90 && score <= 100) {
            grade = 'A';
        } else if (score > 80 && score <= 89) {
            grade = 'B';
        } else if (score > 70 && score <= 79) {
            grade = 'c';
        } else if (score > 60 && score <= 69) {
            grade = 'd';

    } else {
        grade = 'F';
    }
        System.out.println(grade);

        sc.close();

        }





    }




