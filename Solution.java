import java.lang.*;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public static int solution(int[] A, int[] B, int M, int X, int Y) {
        // write your code in Java SE 8
    	int stop=0;
    	
    	int st=0,end=0;
    	int i,wt;
    	while(st<A.length)
    	{
    	for(i=st,wt=0;i<(st+X)&&i<A.length;i++)
    	{
    		wt+=A[i];
    	    if(wt>Y)
    	    {
    	    	i--;
    	    	end=i;
    	    	break;
    	    }
    	    
    	    end=i;
    	}
    	HashSet<Integer> a=new HashSet<Integer>();
    	for(int j=st;j<=end;j++)
    	{
    		 if(!a.contains(B[j]))			
    		 {
    			 stop++;
    			 a.add(B[j]);
    			 
    		 }
    	}
    	st=end+1;
    	stop++;
    	}
    	//System.out.println(st);
    	return stop;
    }
    public static void main(String[] args)
    {
    	int[] A = new int[] {60,80,40};
        int[] B = new int[] {2,3,5};
        int M = 5;
        int X = 2;
        int Y = 200;
        System.out.println(solution(A,B,M,X,Y));
        
    }
}

    	
    	
    