import java.util.Scanner;

public class chw_paracticeExercise01 {
    public static void main(String[] args) {
        float total;
        String studentName;
        Scanner sc = new Scanner(System.in);
        System.out.println("MARKS SHEET");
        System.out.println("Enter student name");
        studentName = sc.nextLine();
        System.out.println("Enter Maths Marks");
        float maths = sc.nextFloat();
        System.out.println("Enter English Marks");
        float english = sc.nextFloat();
        System.out.println("Enter Science Marks");
        float science = sc.nextFloat();
        System.out.println("Enter islamiyat marks");
        float islamiyat = sc.nextFloat();
        System.out.println("Enter Computer Science marks");
        float computerScience = sc.nextFloat();
        System.out.println(studentName);
        System.out.print("maths  ");
        System.out.println(maths);
        System.out.print("english  ");
        System.out.println(english);
        System.out.print("islamiyat  ");
        System.out.println(islamiyat);
        System.out.print("science  ");
        System.out.println(science);
        System.out.print("computer science  ");
        System.out.println(computerScience);
        total=english+science+islamiyat+computerScience+maths;
        System.out.print("Total obtained narks  :");
        System.out.println(total);
        System.out.println("in persantage");
        float per = (total*100)/500;
        System.out.println(per);
        float avr = total/5;
        System.out.println(avr);
            float cgp;
            cgp = total/30;
        System.out.println(cgp);
    }
}
