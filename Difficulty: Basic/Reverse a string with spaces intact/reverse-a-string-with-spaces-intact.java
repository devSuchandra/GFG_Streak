//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0)
        {
            String s;
            s = br.readLine();
            
            Solution ob = new Solution();
            
            System.out.println(ob.reverseWithSpacesIntact(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution
{
    String reverseWithSpacesIntact(String S)
    {
        // your code here
        char[] array = S.toCharArray();
        int start = 0;
        int end = array.length - 1;
        while(start < end){
            if(array[start] == ' '){
                start++;
            }else if(array[end] == ' '){
                end--;
            }else{
                char temp = array[start];
                array[start] = array[end];
                array[end] = temp;
                start++;
                end--;
            }
        }
        return new String(array);
    }
}