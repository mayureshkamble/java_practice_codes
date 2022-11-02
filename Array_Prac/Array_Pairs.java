package Array_Prac;
import java.util.*;
public class Array_Pairs {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 int size=sc.nextInt();
	 int array[]=new int[size];
	 for(int i=0;i<size;i++) {
		 array[i]=sc.nextInt();
	 }
	 printPairs(array);
 }
 public static void printPairs(int [] array) {
	 for(int i=0;i<array.length-1;i++) {
		 for(int j=i+1;j<array.length;j++) {
			 System.out.print("("+array[i]+","+array[j]+")");
		 }
		 System.out.println();
	 }
 }
}
