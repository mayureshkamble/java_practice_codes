package Basic_Sorting_Algorithm;
import java.util.*; 
public class Counting_Array {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int[] arr=new int[s];
		for(int i=0;i<s;i++) {
			arr[i]=sc.nextInt();
		}
		countingSort(arr);
		sc.close();
	}

	private static void countingSort(int[] arr) {
		// TODO Auto-generated method stub
		
		int min=arr[0],max=arr[0];
		for(int i=0;i<arr.length;i++) {
			min=Math.min(min, arr[i]);
			max=Math.max(max, arr[i]);
		}
		int count[]=new int[max+1];
		int c=0;
		for(int i=0;i<count.length;i++) {
			c=0;
			for(int j=0;j<arr.length;j++) {
				if(i==arr[j]) {
					c++;
				}
			}
			count[i]=c;
		}
		int m=0;
		for(int j=0;j<count.length;j++) {
			while(count[j]!=0) {
				arr[m]=j;
				m++;
				count[j]--;
				//System.out.println(j);
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
