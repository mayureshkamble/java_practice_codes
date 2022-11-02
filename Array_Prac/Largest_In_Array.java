package Array_Prac;
import java.util.*;
public class Largest_In_Array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Size:");
	int size=sc.nextInt();
	int array[]=new int[size];
	System.out.println("Enter Array Elements:");
	for(int i=0;i<size;i++) {
		array[i]=sc.nextInt();
	}
	int large=-1;
	for(int i=0;i<size;i++) {
		if(array[i]>large) {
			large=array[i];
		}
	}
	System.out.println(large);
}
}
