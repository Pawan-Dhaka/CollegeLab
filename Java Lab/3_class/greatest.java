import java.util.*;
public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int a = sc.nextInt();
        System.out.println("Enter 1st Number:");
        int b = sc.nextInt();
        System.out.println("Enter 1st Number:");
        int c = sc.nextInt();
       if (a>b&&a>c) {
        System.out.println("Greatest Number is:"+a);
       } else if (b>c&&b>a) {
        System.out.println("Greatest Number is:"+b);
       }
        else {
        System.out.println("Greatest Number is:"+c);
       }
    }
}
