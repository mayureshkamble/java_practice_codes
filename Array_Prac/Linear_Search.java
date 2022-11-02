package Array_Prac;
import java.util.*;
public class Linear_Search {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Size of array");
	 int n=sc.nextInt();
	 int [] array=new int[n];
	 for(int i=0;i<n;i++) {
		 array[i]=sc.nextInt();
	 }
	 System.out.println("Enter the element to search");
	 int no=sc.nextInt();
	 System.out.println("key is at index: "+linearSearch(array,no));
	 sc.close();
 }
 public static int linearSearch(int[]a,int no ) {
	int index=-1;
	for(int i=0;i<a.length;i++) {
		if(a[i]==no)
			index=i;
	}
	 return index;
	 
 }
}
