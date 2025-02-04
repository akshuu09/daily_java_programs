

import java.util.*;
class EpamCode
{
	public static void main(String[] args) 
	{
		int[] arr={16,17,4,3,5,2};
		int start=0;
		for(;;)
		{
			if(start==arr.length)
				break;
		}
		int[]op=findHighest(arr,start);
		System.out.println(op[0]+"");
		start=op[1]+1;
	}
	static int[] findHighest(int[] arr,int start)
	{
		int[] op=new int[2];
		int max=Integer.MIN_VALUE;
		int ind=0;
		for (int i=start; i<arr.length ;i++ ) 
		{
			if(max<arr[i])
			{
				max = arr[i];
				ind=i;
			}
		}
		op[0]=max;
		op[1]=ind;
		return op;
	}
}