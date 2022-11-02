package Array_Prac;
import java.util.*;
public class Binary_Search {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size=sc.nextInt();
		int [] array=new int[size];
		System.out.println("Enter elemets in sorted order");
		for(int i=0;i<size;i++) {
			array[i]=sc.nextInt();
		}
		System.out.println("Enter Element to search");
		int no=sc.nextInt();
		BinarySearch(array,no);
		sc.close();
	}
	public static void BinarySearch(int []array,int no) {
		int low=0;
		int flag=0;
		int high=array.length;
		int mid;
		while(low<high) {
			mid=(low+high)/2;
			if(array[mid]==no) {
				System.out.println("Element found at "+mid);
				 flag=1;
				break;
			}
			else if(no<array[mid]) {
				high=mid-1;
			}
			else if(no>array[mid]){
				low=mid+1;
			}
			
			
		}
		if(flag==0) {
			System.out.println("Number Not found");
		}
		
		
	}
}
