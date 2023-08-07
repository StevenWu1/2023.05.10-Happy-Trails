import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Integer> bin = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 1){
            bin.add(n%2);
            n = n/2;
        }
        bin.add(1);
        int c1 = 0, c0 = 0;
        for (int i = 0; i < bin.size(); i++){
            int current = bin.get(i);
            if (current == 1){
                c1++;
            } else{
                c0++;
            }
        }
        if (c1 == c0){
            System.out.println("NEUTRAL");
        } else if (c1 > c0){
            System.out.println("HAPPY");
        } else{
            System.out.println("SAD");
        }
    }
}
