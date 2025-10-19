import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
      System.out.println("TAKING INPUT FROM USER");
        Scanner sc = new Scanner(System.in);
         System.out.println("enter number 01");
         int a = sc.nextInt();
         System.out.println("enter number 02");
         int b = sc.nextInt();
         int sum = a+b;
        System.out.println("the some of two numbers is");
        System.out.println(sum);
         boolean b1 = sc.hasNext();
        System.out.println(b1);
       String str = sc.next();
        System.out.println(str);
       // String str = sc.nextLine();
        System.out.println(str);
    }
}
