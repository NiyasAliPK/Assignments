import java.util.Scanner;

public class Assignment23 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the size of 2D array");
	int size=input.nextInt();
	TwoD obj=new TwoD();
	int arr1[][]= obj.getArray(size);
	obj.displayArray(arr1, size);
}
}
