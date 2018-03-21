package by.epam.jb24.less04.htask4_2;

import java.util.Random;

//� ������������� ������������������ ���� ������� ��������. 
// ������� ������ �� ������� ���� ���������.

public class zeroedArray {
	public static void main(String[] args) {
		int arr_size = 99;
		int[] arr = new int[arr_size];
		
	//  �������� ������������������
		initIntegerArray(arr);
    //  ����� ����� ������� ���������
		int n_zeroed = GetZeroFromArray(arr);
	//  c������ ������
		int[] zeroed = new int[n_zeroed];
	//  fill zeroed
		printArray(arr);
		fillZeroedArray(zeroed, arr);
		printArray(zeroed);
		System.out.println("zeroedArray() finished");
	}

	// set array values from Random class
	public static void initIntegerArray(int[] arr) {
		Random ra = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ra.nextInt(arr.length); 
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] - ra.nextInt(arr.length) <5) {
				arr[i] = 0;
			}
		}
	}
	
	public static int GetZeroFromArray(int arr[]) {
		int v_count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) { v_count++; }; 
		}
		return v_count;
	}
	
	public static void fillZeroedArray(int[] zeroed, int[] arr) {
		int v_idx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zeroed[v_idx] = i;
				v_idx++;
			};
		}
	}
	
	public static void printArray(int[] arr) {
		System.out.println(" ������������������ ����� � �������:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "; ");
		}
		System.out.println();
	}

}
