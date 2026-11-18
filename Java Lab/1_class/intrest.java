// import java.util.Scanner;

// public class intrest {
    
    
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("What is your good name : ");
//         String name = in.next();
//         System.out.println("Give me base money");
//         int p = in.nextInt();
//         System.out.println("give me intrest rate");
//         float r = in.nextFloat();
//         System.out.println("Give me time in years");
//         int t = in.nextInt();
        
//         float ans = (p*r*t/100);



//         System.out.println("Hello dear "+name);
//         System.out.println("Intrest will be : "+ans);
//         System.out.println("Total money : "+(p+ans));
//     }
// }

import java.util.Scanner;
public class intrest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Principle amount = " );
        int a=sc.nextInt();
        System.out.print(" Rate = " );
        int b=sc.nextInt();
        System.out.print("Time period = " );
       int c=sc.nextInt(); 
       System.out.println("Simple Interest = " +(a*b*c*0.01));
        System.out.println("Compound Interest = " +(a*b*c*0.01+a));

    }
}