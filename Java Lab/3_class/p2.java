import java.util.*;
public class p2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = sc.nextLine();
        System.out.println("Enter Your Number:");
        String number = sc.nextLine();
        System.out.println("Enter Consumed Units :");
        int c = sc.nextInt();
       if (c<=100) {
        System.out.println("Hello sir , "+name);
        System.out.println("Contact No. "+number);
        System.out.println("Used Units : "+c);
        System.out.println("Bill to be paid : "+c*5.50);
       } else if (c<=300 && c>=100) {
        System.out.println("Hello sir , "+name);
        System.out.println("Contact No. "+number);
        System.out.println("Used Units : "+c);
        double a = 100*5.50 + (c-100)*6.50;
        System.out.println("Bill to be paid : "+a);
       }else if (c<=600 && c>=300) {
        System.out.println("Hello sir , "+name);
        System.out.println("Contact No. "+number);
        System.out.println("Used Units : "+c);
       double a = 100*5.50 + (200)*6.50 + (c-300)*7.50;
        System.out.println("Bill to be paid : "+a);
       }else if (c>=600) {
        System.out.println("Hello sir , "+name);
        System.out.println("Contact No. "+number);
        System.out.println("Used Units : "+c);
       double a = 100*5.50 + (200)*6.50 + (600)*7.50 + (c-600)*8.50;
        System.out.println("Bill to be paid : "+a);
       }
    }
    
}
