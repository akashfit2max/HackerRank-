package com.sorting;

public class Sorting {

//	selection sort
	void selectSort(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int minIdx = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIdx]) {
					minIdx = j;
				}
			}
			int temp = arr[minIdx];
			arr[minIdx] = arr[i];
			arr[i] = temp;
		}
	}

//	bubble sort
	void bubbleSort(int arr[]) {

		int n = arr.length;
		for (int i = 0; i < n - 1; i++)
			for (int j = 0; j < n - i - 1; j++)
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
	}

//	insertion sort 
	void InsertionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int val = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > val) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = val;
		}
	}

	void printArray(int arr[]) {
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

	public static void main(String[] args) {
		Sorting sorting = new Sorting();

		int arr[] = { 64, 12, 25, 34, 9, 22 };
		sorting.InsertionSort(arr);
		System.out.println("sorted array");
		sorting.printArray(arr);
	}

}
