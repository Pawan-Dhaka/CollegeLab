import java.util.*;
public class calci {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number:");
        double a = sc.nextInt();
        System.out.println("Enter Operator:");
        String b = sc.next();
        System.out.println("Enter 2nd Number:");
        double c = sc.nextInt(); 
        double d = a/c;
        switch (b) {
            case "+":
                System.out.println("Sum:"+a+"+"+c+"="+(a+c));
                break;
            case "-":
                System.out.println("Subtraction:"+a+"-"+c+"="+(a-c));
                break;
            case "/":
            
                System.out.println("Devide :"+a+"/"+c+"="+d);
                break;
            case "*":
                System.out.println("Multiply :"+a+"*"+c+"="+(a*c));
                break;
            case "%":
                System.out.println("Modulo :"+a+"%"+c+"="+(a%c));
                break;
        
            default:
                System.out.println("Invalid Entries");
                break;
        }

    }
    
}
