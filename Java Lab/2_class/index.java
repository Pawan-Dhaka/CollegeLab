//Q1. wap to create class student with student name roll no and marks off physics chemisty math english hindi and computer find the total marks of stusent and find the percnetage 
//Ans.-
import java.util.*;
public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me your name:");
        String name = sc.nextLine();
        System.out.println("Tell me your Roll_no:");
        String roll = sc.nextLine();
        System.out.println("Tell me your marks off physics:");
        int physics = sc.nextInt();
        System.out.println("Tell me your marks off chemisty:");
        int chemisty = sc.nextInt();
        System.out.println("Tell me your marks off math:");
        int math = sc.nextInt();
        System.out.println("Tell me your marks off english:");
        int english = sc.nextInt();
        System.out.println("Tell me your marks off hindi:");
        int hindi = sc.nextInt();
        System.out.println("Tell me your marks off computer:");
        int computer = sc.nextInt();
        int total = physics + chemisty +math+english+hindi+computer;
        if (total<600) {
            double percentage = total / 6;
            System.out.println("Hello dear, "+name);
            System.out.println("Roll No- "+roll);
            System.out.println("Your total marks is "+total+" out of 600.");
            System.out.println("You have scored "+percentage+"%");
        } else{
            System.out.println("Invalid entries | ");
        }
    }
}
