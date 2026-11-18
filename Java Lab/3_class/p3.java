import java.util.*;
public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name = sc.nextLine();
        System.out.println("Enter Your Number:");
        String number = sc.nextLine();
        System.out.println("Enter Your bill :");
        int c = sc.nextInt();
       if (c<=2000) {
        System.out.println("Hello sir , "+name);
        System.out.println("Contact No. "+number);
        System.out.println("Total bill before discount: "+c);
        System.out.println("Bill to be paid (Discount Done) : "+(c-(c*0.05)));
        System.out.println("Freeeee Gift : Wall Clock");
       } else if (c<=5000 && c>2000) {
        System.out.println("Hello sir , "+name);
        System.out.println("Contact No. "+number);
        System.out.println("Total bill before discount: "+c);
        System.out.println("Bill to be paid (Discount Done) : "+(c-(c*.1)));
        System.out.println("Freeeee Gift : School Bag");

       } else if (c<=10000 && c>5000) {
        System.out.println("Hello sir , "+name);
        System.out.println("Contact No. "+number);
        System.out.println("Total bill before discount: "+c);
        System.out.println("Bill to be paid (Discount Done) : "+(c-(c*.15)));
        System.out.println("Freeeee Gift : Electic Iron");

       } else if (c>10000) {
        System.out.println("Hello sir , "+name);
        System.out.println("Contact No. "+number);
        System.out.println("Total bill before discount: "+c);
        System.out.println("Bill to be paid (Discount Done) : "+(c-(c*.2)));
        System.out.println("Freeeee Gift : Wrist Watch");

       }
    }
    
}