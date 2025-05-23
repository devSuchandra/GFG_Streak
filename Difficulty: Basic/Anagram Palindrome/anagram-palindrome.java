//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG
{
    public static void main (String[] args)
    {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int i=0;i<t;i++){
		    String s = in.next();
		    if (new Sol().isPossible (s) == 1)
		        System.out.println ("Yes");
		    else
		        System.out.println ("No");
		
System.out.println("~");
}
	}
}

// Contributed By: Pranay Bansal


// } Driver Code Ends


class Sol
{
    int isPossible (String S)
    {
        // your code here
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0; i<S.length(); i++){
            map.put(S.charAt(i), map.getOrDefault(S.charAt(i),0) + 1);
        }
        int oddCount = 0;
        for(int value : map.values()){
            if(value % 2 != 0){
                oddCount++;
            }
        }
        if(oddCount <= 1){
            return 1;
        }
        return 0;
    }
}