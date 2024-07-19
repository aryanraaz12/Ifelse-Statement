package ConditionalStatement;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the grade :-");
        int grade = sc.nextInt();


        if (grade > 90 && grade <= 100) {
            System.out.println("Excellent");

        } else if (grade > 80 && grade <= 90) {
            System.out.println(" very good");

        } else if (grade > 60 && grade <= 79) {
            System.out.println("good");
        } else if (grade >= 40 && grade <= 59) {
            System.out.println("very bad");

        } else  {
            System.out.println("fail");
        }

    }
}




