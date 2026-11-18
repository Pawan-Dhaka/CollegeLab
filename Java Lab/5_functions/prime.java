import java.util.*;
public class prime {
    static void prime(int a){
        int check = 0;
        for(int i = 1 ; i<=a ; i++){
            if(a%i!=0){
                check++;
            }
        }
        if (check==0) {
            System.out.println(a+" is a prime number.");
        } else {
            System.out.println(a+" is a not prime number.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        prime(num);
    }
    
}
