package Abstraction.Exception_Handling;

import java.util.*;

public class nextedtry {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        boolean flag = true;

        while (flag) {
            System.out.println("Enter the value of index:");
            int idx = sc.nextInt();
            try {
                System.out.println("Welcome to Program");
                try {
                    System.out.println(marks[idx]);
                    flag = false;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("INDEX DOESNT EXIST");
                    System.out.println("Exception at level 2");
                }
            } catch (Exception e) {
                System.out.println("Exception at level 1");
            }
        }
        System.out.println("Thanks for using this Program");
    }

}
