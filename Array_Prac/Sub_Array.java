package Array_Prac;
import java.util.*;
public class Sub_Array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int array[]=new int[size];
	for(int i=0;i<size;i++) {
		array[i]=sc.nextInt();
	}
	printSubarrays(array);
			sc.close();
}

private static void printSubarrays(int[] array) {
	// TODO Auto-generated method stub
	int start,end;
	for(int i=0;i<array.length;i++) {
		for(int j=i;j<array.length;j++) {
			start=i;
			end=j;
			//System.out.print("[");
			for(int k=start;k<=end;k++ ) {
				System.out.print(array[k]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
}
