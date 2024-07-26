package ex_200724;

import java.util.Scanner;
public class LAb25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Day from 1 to 7, tell what day it is");
        int day = sc.nextInt();

        switch (day) {

            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("Thur");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("SAT");
                break;
            case 7:
                System.out.println("FUN-DAY SUNDAY");
                break;
            default:
                System.out.println("no idea BROOOOOOOO");
                break;
        }




        }
    }

