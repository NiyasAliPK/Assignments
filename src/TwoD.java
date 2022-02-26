import java.util.Scanner;

public class TwoD {

	int[][] getArray(int size) {
		int arr[][]=new int [size][size];
		Scanner input=new Scanner(System.in);
		int i,j;
		System.out.println("Enter the values for arary1");
		for(i=0;i<size;i++) {
			for(j=0;j<size;j++) {
				arr[i][j]=input.nextInt();
			}
		}
		return arr;
	}
	void displayArray(int arr1[][],int size) {
		int m,n;
		System.out.println("Elements of array are :");
		for(m=0;m<size;m++) {
			for(n=0;n<size;n++) {
				System.out.print(arr1[m][n]+"\t");
			}
			System.out.println();
		}
	}
	}
