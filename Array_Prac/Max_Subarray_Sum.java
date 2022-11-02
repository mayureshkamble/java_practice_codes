package Array_Prac;
import java.util.*;
public class Max_Subarray_Sum {
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int array[]=new int[size];
			for(int i=0;i<size;i++) {
				array[i]=sc.nextInt();
			}
			maxSum(array);
		 
}



private static void maxSum(int[] array) {//brute force approch
	// TODO Auto-generated method stub
	int sum=0,msum=0;
	for(int i=0;i<array.length;i++) {
		for(int j=i;j<array.length;j++) {
			for(int k=i;k<=j;k++) {
				sum=sum+array[k];
			}
			if(sum>msum) {
				msum=sum;
			}
			//System.out.println(sum);
			sum=0;
		}
	}
	System.out.println("max sum:"+msum);
	
}
}
