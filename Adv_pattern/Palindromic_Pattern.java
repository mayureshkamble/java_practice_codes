package Adv_pattern;
import java.util.*;
public class Palindromic_Pattern {
 public static void main(String args[]) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 for(int i=1;i<=n;i++) {
		 for(int j=1;j<=n-i;j++) {
			 System.out.print(" ");
		 }
		 for(int m=i;m>1;m--) {
			 System.out.print(m);
		 }
		 for(int m=1;m<=i;m++) {
			 System.out.print(m);
		 }
		 System.out.println();
	 }
 }
}
