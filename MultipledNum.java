package by.epam.jb24.less04.htask4_2;

import java.util.Scanner;

// � ������ A [N] �������� ����������� �����. 
// ����� ����� ��� ���������, ������� ������ ������� �
public class MultipledNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr_size = 12;
		double[] arr = new double[arr_size];
		enterArray(arr);
		printArray(arr);
		double k_num = enterK_number();
		double sval = findMultiSumm(arr, k_num);
		System.out.printf("C���� ���������, ������� ��������� ����� '%f' �����: %f\n", k_num, sval);
		System.out.println("MultipledNum() finished");
	}
	
// set array values from Console	
	public static void enterArray(double[] arr) {		
		Integer vlen = arr.length;
		System.out.println("������� " + vlen.toString() + " �������� ��������:");
		Scanner scn = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[" + i + "]=>");
			arr[i] = scn.nextDouble();
		}
		System.out.println();
	}
// 	���� ����� ��� ������ ���������
	public static double enterK_number() {		
		System.out.println("������� ����� ��� ������ ���������:");
		Scanner scn = new Scanner(System.in);
		double vval = scn.nextDouble();
		return vval;
	}

//	print array to Console
	public static void printArray(double[] arr) {
		System.out.println(" �������� �������:");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("[" + i + "]=" + arr[i] + "; ");
		}
		System.out.println("\n--------------------------------------------");
	}

//  ������� ����� �������
	public static double findMultiSumm(double[] arr, double k_num) {
		double vval =0.0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % k_num == 0) {
				vval += arr[i];
			};
		}
		return vval;
	}
}
