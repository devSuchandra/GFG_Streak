//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            System.out.println(new Solution().maxIndexDiff(arr));
        }
    }
}
// } Driver Code Ends


class Solution {

    int maxIndexDiff(int arr[]) {
        // code here
        int n = arr.length;
        int leftMin[] = new int[n];
        int rightMax[] = new int[n];
        leftMin[0] = arr[0]; rightMax[n - 1] = arr[n - 1];
        
        for(int i = 1; i<arr.length; i++){
            leftMin[i] = Math.min(arr[i], leftMin[i - 1]);
        }
        for(int i = n - 2; i >= 0; i--){
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }
        int k = 0, l = 0;
        int ans = Integer.MIN_VALUE;
        
        while(k < n && l < n){
            if(leftMin[k] <= rightMax[l]){
                ans = Math.max(ans, l - k);
                l++;
            }else{
                k++;
            }
        }
        return ans;
    }
}