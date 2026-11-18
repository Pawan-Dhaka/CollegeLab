public class p8 {
    public static void main(String[] args) {
        int num1 = 7;
        int n = (int)Math.ceil(num1/2);
        for(int i = 0 ; i<=n; i++){
            for(int j = 0; j<=num1 ; j++ ){
                System.out.print(j+" ");
            }
            num1=num1-2;
            System.out.println();
        }
    }
}
