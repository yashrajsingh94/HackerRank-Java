import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();

        BigInteger b;

        boolean b1;

        b = new BigInteger(n);

        b1 = b.isProbablePrime(1);

        if(b1 == true){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
        scanner.close();
    }
}
