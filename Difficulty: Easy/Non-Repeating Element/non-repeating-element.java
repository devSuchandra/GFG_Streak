//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t =
            Integer.parseInt(scanner.nextLine().trim()); // Read number of test cases

        while (t-- > 0) {
            String line = scanner.nextLine().trim(); // Read the entire line
            String[] numsStr = line.split(" "); // Split the line into string numbers
            int[] nums = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                nums[i] =
                    Integer.parseInt(numsStr[i]); // Convert each string to integer
            }

            int ans = new Solution().firstNonRepeating(
                nums); // Compute the result using the Solution class

            System.out.println(ans); // Print the result
        
System.out.println("~");
}
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int firstNonRepeating(int[] arr) {
        // Complete the function
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i = 0; i<arr.length; i++){
        //     map.put(arr[i],map.getOrDefault(arr[i],0) +1);
        // }
        //  for (Map.Entry<Integer,Integer> mp : map.entrySet()) {
        //     if(mp.getValue() <= 1){
        //         if(mp.getKey() == 1){
        //             return 1;
        //         }else{
        //         return mp.getKey();
        //         }
        //     }
        // }
        // return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Count occurrences of each element
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find the first non-repeating element by checking the original array
        for (int num : arr) {
            if (map.get(num) == 1) {
                return num;
            }
        }
        return 0;
    }
    
}
