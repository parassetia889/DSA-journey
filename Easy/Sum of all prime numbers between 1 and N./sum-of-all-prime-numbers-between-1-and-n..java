//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            long ans = ob.prime_Sum(n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


class Solution
{
    public long prime_Sum(int n)
    {
       long sum = 0;
       for(int i = 2; i <= n; i++){
           if(isPrime(i))
                sum += i;
       }
       return sum;
    }
    
    public static boolean isPrime(int a){
    
        for(int i = 2; i*i <= a; i++){
            if(a%i == 0)
                return false;
        }    
        return true;
    }
    
}