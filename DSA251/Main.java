import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findSecondLargest(int n, int[] arr) {
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++){
			if(max1<arr[i]){
				max2=max1;
				max1=arr[i];
			}
			else if(max1!=arr[i] && max2<arr[i]) max2=arr[i];
		}
		if(max2!=Integer.MIN_VALUE) return max2;
		else return -1;
	}
}