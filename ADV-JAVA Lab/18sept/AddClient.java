import java.rmi.*;
import java.io.*;

public class AddClient {
    public static void main(String args[]) {
        try {
            DataInputStream ds = new DataInputStream(System.in);

            String s = "rmi://localhost/addserver";

            AddServerIntf obj =
                (AddServerIntf) Naming.lookup(s);

            System.out.println("ENTER THE VALUES FOR a & b:");

            int a = Integer.parseInt(ds.readLine());
            int b = Integer.parseInt(ds.readLine());

            System.out.println("ADDITION = " + obj.add(a, b));
            System.out.println("SUBTRACTION = " + obj.sub(a, b));
            System.out.println("MULTIPLICATION = " + obj.mul(a, b));
            System.out.println("DIVISION = " + obj.div(a, b));
            System.out.println("MODULO DIVISION = " + obj.mod(a, b));

        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}