import java.util.Scanner;
public class Bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int size=s.nextInt();
		int array[]=new int [size];
		System.out.println("Enter values:");
		for (int i=0;i<size;i++){
			array[i]=s.nextInt();
		}
		for (int i=0;i<size;i++){
			for (int j=i;j<size-1;j++){
				if(array[j]>array[j+1]){
					array[j]=array[j+1]+array[j];
					array [j+1]=array[j]-array[j+1];
					array[j]=array[j]-array[j+1];
				}
			}
		}
		System.out.println("Sorted array is:");
		for (int i=0;i<size;i++){
			System.out.println(array[i]);
		}
	}

}
