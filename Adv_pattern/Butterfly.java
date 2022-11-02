package Adv_pattern;
import java.util.*;
public class Butterfly {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		for(int i=1;i<=no;i++) {
			for(int j=1;j<=2*no;j++) {
				if(j<=i||j>2*no-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
					
			}
			System.out.println();
		}
		for(int i=no;i>=1;i--) {
			for(int j=1;j<=2*no;j++) {
				if(j<=i||j>2*no-i) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
					
			}
			System.out.println();
		}
		sc.close();
	}
}
