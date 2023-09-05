package nithya;

public class MergeSort {

	public static void main(String[] args) {
		        int[] array = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};

		        System.out.println("Original Array:");
		        printArray(array);

		        mergeSort(array);

		        System.out.println("\nSorted Array:");
		        printArray(array);
		    }

		    public static void mergeSort(int[] array) {
		        if (array.length <= 1) {
		            return; // The array is already sorted
		        }

		        int middle = array.length / 2;
		        int[] left = new int[middle];
		        int[] right = new int[array.length - middle];

		        // Populate left and right arrays
		        for (int i = 0; i < middle; i++) {
		            left[i] = array[i];
		        }
		        for (int i = middle; i < array.length; i++) {
		            right[i - middle] = array[i];
		        }

		        // Recursively sort left and right arrays
		        mergeSort(left);
		        mergeSort(right);

		        // Merge the sorted left and right arrays
		        merge(array, left, right);
		    }

		    public static void merge(int[] array, int[] left, int[] right) {
		        int i = 0, j = 0, k = 0;

		        while (i < left.length && j < right.length) {
		            if (left[i] < right[j]) {
		                array[k++] = left[i++];
		            } else {
		                array[k++] = right[j++];
		            }
		        }

		        while (i < left.length) {
		            array[k++] = left[i++];
		        }

		        while (j < right.length) {
		            array[k++] = right[j++];
		        }
		    }

		    public static void printArray(int[] array) {
		        for (int num : array) {
		            System.out.print(num + " ");
		        }
		        System.out.println();
		    }
		}

	


