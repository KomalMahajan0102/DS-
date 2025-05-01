import java.rmi.*;
import java.rmi.server.*;

public class ServerImpl extends UnicastRemoteObject implements ServerIntf {

    public ServerImpl() throws RemoteException {
    }

    public int addition(int a, int b) throws RemoteException {
        return a + b;
    }

    public int substraction(int a, int b) throws RemoteException {
        return a - b;
    }

    public int division(int a, int b) throws RemoteException {
        return a / b;
    }

    public int multiplication(int a, int b) throws RemoteException {
        return a * b;
    }

    public int square(int a) throws RemoteException {
        return a * a;
    }

    public int squareroot(int a) throws RemoteException {
        return (int) (Math.sqrt(a));
    }

    public boolean palindrome(String str) throws RemoteException {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();

        if (str.equals(sb.toString()))
            return true;
        else
            return false;

    }

    public boolean isequalstring(String str1, String str2) throws RemoteException {
        if (str1.equals(str2))
             return true;
        else
             return false;
    }
    public String concatenate(String str1, String str2) throws RemoteException {
           return str1 + str2;
    }

}
