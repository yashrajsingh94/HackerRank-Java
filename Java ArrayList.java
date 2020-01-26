import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
                
        // Save numbers in 2-D ArrayList
        ArrayList<ArrayList<Integer>> lists = new ArrayList();
        for (int i=0; i<n; i++) {
            int d = scan.nextInt();
            ArrayList<Integer> list = new ArrayList();
   
            for (int j=0; j<d; j++) {
                list.add(scan.nextInt());
            }
            lists.add(list);
        }
        
        // Answer the queries
        int q = scan.nextInt();
        for(int i=0; i<q; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            ArrayList<Integer>  list = lists.get(x-1);
            if(y<=list.size()){
                System.out.println(list.get(y-1));
            }
            else{
                System.out.println("ERROR!");
            }
        }
        scan.close();
    }
}

