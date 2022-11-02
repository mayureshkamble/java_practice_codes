package Array_Prac;
import java.util.*;
public class Trapping_RainWater {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int array[]=new int[size];
	for(int i=0;i<size;i++) {
		array[i]=sc.nextInt();
	}
	trappedWater(array);
	sc.close();
}

 private static void trappedWater(int[] array) {
	// TODO Auto-generated method stub
	int []lAux=new int[array.length];
	int []rAux=new int[array.length];
	int lmax=0,rmax=0;
	for(int i=0;i<array.length;i++) {
		lmax=array[i];
		rmax=array[i];
		for(int j=i;j>=0;j--) { //to search left maximum from bar
			if(array[j]>lmax) {
				lmax=array[j];
			}
			
		}
		lAux[i]=lmax;
		for(int j=i;j<array.length;j++) { //to search left maximum from bar
			if(array[j]>rmax) {
				rmax=array[j];
			}
		}
	    rAux[i]=rmax;
	}
	calculateTrappedWater(lAux,rAux,array);
//	for(int i=0;i<array.length;i++) {
//		System.out.print(lAux[i]);
//		
//	}
//	System.out.println();
//	for(int i=0;i<array.length;i++) {
//		System.out.print(rAux[i]);
		
	//}
  }

 private static void calculateTrappedWater(int[] lAux, int[] rAux, int[] array) {
	// TODO Auto-generated method stub
	 int totalWater=0;
	for(int i=0;i<array.length;i++) {
		int wl=Math.min(lAux[i], rAux[i]);
		totalWater=totalWater+(wl-array[i]);
	}
	System.out.println(totalWater);
 }
}