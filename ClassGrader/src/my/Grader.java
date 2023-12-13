/*
 Part 1: Class Grader

    Open IntelliJ Idea App and create a project called ClassGrader
    Write a program where a user enters the grade of a student and the program returns a grade based on the following conditions

    Failed if they scored 3 or less
    Insufficient if they scored > 3 but less than 5. (5 included)
    Good if they scored > 5 but less than 8. (8 included)
    Excellent Grade if they scored 10.
    if participants enter a negative number or a number outside the range supported (outside 0 - 10)

 * */
package my;
import java.util.*;

public class Grader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		grading();

	}
	static void grading() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Score of Student:");
		int i=0;


		do {
			i=sc.nextInt();	

			if(i<=3) {
				System.out.println("Student failed !!!");
			}
			else if(i>3 && i<=5) {
				System.out.println("Insufficient Score !!!");
			}
			else if(i>5 && i<=8 || i>=9) {
				System.out.println("Good !!!");
			}
			else if(i==10) {
				System.out.println("Excellent !!!");
			}
			}while(i<=0 || i!=0 || i!=1 || i!=2 || i!=3 || i!=4 || i!=5 || i!=6 || i!=7 || i!=8 || i!=9 ||i!=10);
				
		}
		
		
	}


