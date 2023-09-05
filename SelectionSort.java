package nithya;

public class SelectionSort {

	public static void main(String[] args) {
		 
		
		        int[] array = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};

		        System.out.println("Original Array:");
		        printArray(array);

		        selectionSort(array);

		        System.out.println("\nSorted Array:");
		        printArray(array);
		    }

		    public static void selectionSort(int[] array) {
		        int n = array.length;

		        for (int i = 0; i < n - 1; i++) {
		            int minIndex = i;

		            // Find the index of the minimum element in the unsorted part of the array
		            for (int j = i + 1; j < n; j++) {
		                if (array[j] < array[minIndex]) {
		                    minIndex = j;
		                }
		            }

		            // Swap the minimum element with the first element in the unsorted part
		            int temp = array[minIndex];
		            array[minIndex] = array[i];
		            array[i] = temp;
		        }
		    }

		    public static void printArray(int[] array) {
		        for (int num : array) {
		            System.out.print(num + " ");
		        }
		        System.out.println();
		    }
		}
