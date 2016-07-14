import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0; i < t; i++){
            int n = in.nextInt();
            int m = in.nextInt();
            int array_m[][] = new int[n+1][n+1];
            for(int j = 0; j < m; j++){
                int a = in.nextInt();
                int b = in.nextInt();
                array_m[a][b] = 6;
                array_m[b][a] = 6;
            }
            int s = in.nextInt();
            int[] visited = new int[n+1];
            int k, element;
            Queue<Integer> queue = new LinkedList<Integer>();
            visited[s] = 6;
            queue.add(s);
            while(!queue.isEmpty()){
                element = queue.remove();
                k = 1;
                while(k <= n){
                    if(array_m[element][k] == 6 && visited[k] == 0){
                        queue.add(k);
                        visited[k] = 6;
                        array_m[s][k] = array_m[s][element] + array_m[element][k];
                    }
                    k++;
                }
            }
            for(int l = 1; l <= n; l++){
                if(l != s){
                    if(array_m[s][l] == 0){
                        System.out.print("-1" + " ");
                    }
                    else{
                        System.out.print(array_m[s][l]+ " ");
                    }
                }  
            }
            System.out.println();
        }   
    }
}