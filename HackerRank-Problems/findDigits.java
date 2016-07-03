import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            char[] c = Integer.toString(n).toCharArray();
            //System.out.println(Arrays.toString(c));
            int c_len = c.length;
            int count = 0;
            for(int j = 0; j < c_len; j++){
                //System.out.println(c[j]);
                int b = Integer.parseInt(Character.toString(c[j]));
                //System.out.println(b);
                if(b != 0 && n % b == 0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}