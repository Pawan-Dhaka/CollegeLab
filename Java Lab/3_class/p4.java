import java.util.*;
public class p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = sc.nextLine();
        System.out.println("Enter Your Gender (M/F):");
        String gender = sc.nextLine();
        System.out.println("Enter Your age:");
        int age = sc.nextInt();
        System.out.println("Enter Your Taxable Income :");
        int c = sc.nextInt();           
        if (age<=65 && gender=="M") {
            if (c<=250000) {
             System.out.println("Hello sir , "+name);
             System.out.println(age+gender);
             System.out.println("Total Income : "+c);
             System.out.println("Payble Tax : "+0);
             System.out.println("Govt. of India");
            } else if (c<=500000&&c>250000) {
             System.out.println("Hello sir , "+name);
             System.out.println(age+gender);
             System.out.println("Total Income : "+c);
             double tax = (c-250000)*.1;
             System.out.println("Payble Tax : "+tax);
             System.out.println("Govt. of India");
            }else if (c<=1000000&&c>500000) {
             System.out.println("Hello sir , "+name);
             System.out.println(age+gender);
             System.out.println("Total Income : "+c);
             double tax = (c-250000)*.2 + 34000;
             System.out.println("Payble Tax : "+tax);
             System.out.println("Govt. of India");
            }else if (c>1000000) {
             System.out.println("Hello sir , "+name);
             System.out.println(age+gender);
             System.out.println("Total Income : "+c);
             double tax = (c-250000)*.3 + 94000;
             System.out.println("Payble Tax : "+tax);
             System.out.println("Govt. of India");
            }
        }
        else{
            System.out.println("Invalid Entries");
        }
    }
    
}
