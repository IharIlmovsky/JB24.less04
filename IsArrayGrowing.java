package by.epam.jb24.less04.htask4_2;

import java.util.Random;

public class IsArrayGrowing {

	public static void main(String[] args) {
		int arr_size = 9;
		double[] arr = new double[arr_size];
		boolean is_grow = true;
		String msg = " является возрастающей";
		
//  получить последовательность
		initArrayByRandom(arr);
//	определить возрастаемость
		for (int i =1; i < arr.length; i++) {
		  if (arr[i] < arr[i-1]) {
			 is_grow = false;
			 msg = "не " + msg;
			 break; 
		  }
		}
		printArray(arr); //  вывод
		System.out.println(msg);
		System.out.println("IsArrayGrowing() finished");
	}

	
	// set array values from Random class
	public static void initArrayByRandom(double[] arr) {
		Random ra = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 1 + ra.nextInt(10);
		}		
	}
	
	public static void printArray(double[] arr) {
		System.out.println(" последовательность чисел:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "; ");
		}
		System.out.println();
	}

}
