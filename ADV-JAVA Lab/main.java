
// // 1. Define the Remote Interface
// import java.rmi.*;

// public interface AddServerIntf extends Remote
// {
// int add(int a,int b) throws RemoteException;
// int sub(int a,int b) throws RemoteException;
// int mul(int a,int b) throws RemoteException;
// int div(int a,int b) throws RemoteException;
// int mod(int a,int b) throws RemoteException;
// }
// // 2. Implement Remote Interface
// import java.rmi.*;
// import java.rmi.server.*;

// public class AddServerImpl extends UnicastRemoteObject implements AddServerIntf {
//     public AddServerImpl() throws RemoteException {
//     }

//     public int add(int a, int b) throws RemoteException {
//         return (a + b);
//     }

// {

// public int sub(int a,int b)throws RemoteException
// return (a-b);
// }

// {

// public int mul(int a,int b)throws RemoteException
// return (a*b);
// }

// {

// public int div(int a,int b)throws RemoteException
// return (a/b);
// }

// {

// public int mod(int a,int b)throws RemoteException
// return (a%b);
// }
// }
// // 3. Implementation of Server Machine
// import java.rmi.*;
// import java.net.*;

// public class AddServer {
// public static void main(String args[])
// {
// try
// {
// AddServerImpl obj = new AddServerImpl();
// Naming.rebind("addserver", obj);
// System.out.println("server started");
// }
// {
// catch (Exception e)
// System.out.println("Exception: " + e);
// }
// }
// }
// // 4. Implementation of Client Machine
// import java.rmi.*;
// import java.io.*;

// public class AddClient {
//     public static void main(String args[]) {
//         try {
//             DataInputStream ds = new DataInputStream(System.in);
//             String s = "rmi://MY-PC/addserver";
//             AddServerIntf obj = (AddServerIntf) Naming.lookup(s);
//             System.out.println("ENTER THE VALUES FOR a & b:");
//             int a = Integer.parseInt(ds.readLine());
//             int b = Integer.parseInt(ds.readLine());
//             System.out.println("ADDITION=" + obj.add(a, b));
//             System.out.println("SUBTRACTION=" + obj.sub(a, b));
//             System.out.println("MULTIPLICATION=" + obj.mul(a, b));
//             System.out.println("DIVISION=" + obj.div(a, b));
//             System.out.println("MODULODIVISION=" + obj.mod(a, b));
//         } catch (Exception e) {
//             System.out.println("Exception: " + e);
//         }
//     }
// }
