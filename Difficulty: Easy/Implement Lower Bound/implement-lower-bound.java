//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.lowerBound(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    int lowerBound(int[] arr, int target) {
        // code here
        int start = 0, end = arr.length - 1;
        int maxIndex = arr.length;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] < target){
                //maxIndex = Math.max(maxIndex, mid);
                
                start = mid + 1;
            }else{
                //int temp = mid
                maxIndex = Math.min(maxIndex, mid);
                end = mid - 1;
                
            }
        }
        return maxIndex;
    }
}
