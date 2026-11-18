
//WAP to create rectangle class with lengh and withdth area??
// also volume
import java.util.*;

public class index2 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Choose your shape|\nFor ractangle type 'r' \nFor cuboid type 'c' \nFor Circle type 'cir'-");
        String start_a = sc.nextLine();
        switch (start_a) {
            case "r": {
                System.out.println("Enter width of rectangle :");
                int w = sc.nextInt();
                System.out.println("Enter height of rectangle :");
                int h = sc.nextInt();
                int area = w * h;
                System.out.println("area =" + area);
                break;
            }

            case "c": {
                System.out.println("Enter width of Cuboid :");
                int w = sc.nextInt();
                System.out.println("Enter height of Cuboid :");
                int h = sc.nextInt();
                System.out.println("Enter breadth of Cuboid :");
                int b = sc.nextInt();
                int volume = w * h * b;
                System.out.println("Volume of Cuboid =" + volume);
                break;
            }
            case "cir": {
                System.out.println("Enter radius of Circle:");
                int r = sc.nextInt();
                
                double area = 3.14*r*r;
                double param = 2*3.14*r;
                System.out.println("Area of Circle =" + area);
                System.out.println("Parameter of Circle =" + param);
                break;
            }

            default:
                System.out.println("Invalid entries | Try Again");
                break;
        }

    }
}
