//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

class Solution {
    public static int maxProduct(int[] arr) {
        // code here
        // int n=arr.length;
        // int max=1;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         int product = arr[i]*arr[j];
        //         if(product>max)
        //             max=product;
        //     }
        // }
        // return max;
        // int n=arr.length;
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //         if(arr[i]>arr[j])
        //         {
        //             int temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }
        // int max=arr[n-1]*arr[n-2];
        // return max;
        // int first=Integer.MIN_VALUE;
        // int second=Integer.MIN_VALUE;
        // for(int num:arr)
        // {
        //     if(num>first)
        //     {
        //         second=first;
        //         first=num;
        //     }
        //     else if(num>second && num!=first)
        //     {
        //         second=num;
        //     }
        // }
        // return first*second;
        Arrays.sort(arr);
        int n=arr.length;
        return arr[n-1]*arr[n-2];
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int res = obj.maxProduct(arr);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends