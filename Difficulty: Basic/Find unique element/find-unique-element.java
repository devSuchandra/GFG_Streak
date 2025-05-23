//{ Driver Code Starts
import java.util.*;


// } Driver Code Ends

class Solution {
    public int findUnique(int k, int[] arr) {
        // code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0) + 1);
        }
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            if(mp.getValue() < k){
                return mp.getKey();
            }
        }
        return -1;
    }
}


//{ Driver Code Starts.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = Integer.parseInt(scanner.nextLine().trim());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(scanner.nextLine().trim());
            String[] inputLine = scanner.nextLine().trim().split(" ");
            int[] arr = new int[inputLine.length];
            for (int j = 0; j < inputLine.length; j++) {
                arr[j] = Integer.parseInt(inputLine[j]);
            }

            Solution solution = new Solution();
            System.out.println(solution.findUnique(k, arr));
        
System.out.println("~");
}

        scanner.close();
    }
}

// } Driver Code Ends