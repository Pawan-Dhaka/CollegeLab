import java.util.*;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of array:");
        for(int i = 0; i<size ; i++){
            System.out.println("Next Value?");
            arr[i] = sc.nextInt();
        }
        int sort[] = new int[3];
            for(int j=0 ; j<size ; j++){
                if(sort[0]<arr[j]){
                    sort[0] = arr[j];
                }
            }
            for(int j=0 ; j<size ; j++){
                if((sort[1]<arr[j])&&(arr[j]!=sort[0])){
                        sort[1] = arr[j];
                }
            }
            for(int j=0 ; j<size ; j++){
                if((sort[2]<arr[j])&&(arr[j]!=sort[1])&&(arr[j]!=sort[0])){
                    sort[2] = arr[j];
                }
            }


            System.out.println("The first largest is : "+sort[0]);
            System.out.println("The second largest is : "+sort[1]);
            System.out.println("The third largest is : "+sort[2]);

    }
}
