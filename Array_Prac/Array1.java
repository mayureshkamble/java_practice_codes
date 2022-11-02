package Array_Prac;

public class Array1 {
	public static void update(int marks[]) {
		for(int i=0;i<marks.length;i++) {
			marks[i]=marks[i]+1;
		}
	}
public static void main(String[] args) {
	//int marks[]=new int [50];
	int marks[]= {1,2,3};
	String[] fruits= {"Apple","Mango","Orange"};
	for(int i=0;i<marks.length;i++) {
		System.out.println(marks[i]);
	}
	update(marks);
	for(int i=0;i<marks.length;i++) {
		System.out.println(marks[i]);
	}
}
}
