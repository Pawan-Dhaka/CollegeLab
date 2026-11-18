import java.util.*;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number:");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Number:");
        int c = sc.nextInt();
       if (a>b&&a>c) {
        if (b>c) {
            System.out.println("Greatest Number wii be:"+a+b+c);
        }else{
            System.out.println("Greatest Number wii be:"+a+c+b);
        }
       } else if (b>c&&b>a) {
        if (a>c) {
            System.out.println("Greatest Number wii be:"+b+a+c);
        }else{
            System.out.println("Greatest Number wii be:"+b+c+a);
        }
       }
        else {
            if (a>b) {
            System.out.println("Greatest Number wii be:"+c+a+b);
        }else{
            System.out.println("Greatest Number wii be:"+c+b+a);
        }
       }
    }
    
}
