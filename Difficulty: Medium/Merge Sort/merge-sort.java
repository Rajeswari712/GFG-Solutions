//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {

            ArrayList<Integer> array1 = new ArrayList<Integer>();
            String line = read.readLine();
            String[] tokens = line.split(" ");
            for (String token : tokens) {
                array1.add(Integer.parseInt(token));
            }
            ArrayList<Integer> v = new ArrayList<Integer>();
            int[] arr = new int[array1.size()];
            int idx = 0;
            for (int i : array1) arr[idx++] = i;

            new Solution().mergeSort(arr, 0, arr.length - 1);

            for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");

            System.out.println();

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        int low = l;
        int high = r;
        if(low >= high) return;
        // int mid = (low+high)/2;
        int mid = low + (high-low)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    
    void merge(int arr[], int low, int mid, int high)
    {
        int left = low;
        int right = mid+1;
        int[] temp = new int[high-low+1];
        int i = 0;
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                temp[i]=arr[left];
                i++;
                left++;
            }
            else
            {
                temp[i]=arr[right];
                i++;
                right++;
            }
        }
        while(left<=mid)
        {
            temp[i]=arr[left];
            left++;
            i++;
        }
        while(right<=high)
        {
            temp[i]=arr[right];
            right++;
            i++;
        }
        for(int k=low;k<=high;k++)
        {
            arr[k]=temp[k-low];
        }
    }
}
