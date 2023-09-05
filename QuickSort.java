package nithya;

public class QuickSort {

	public static void main(String[] args) {
		
	
		        int[] array = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};

		        System.out.println("Original Array:");
		        printArray(array);

		        quickSort(array, 0, array.length - 1);

		        System.out.println("\nSorted Array:");
		        printArray(array);
		    }

		    public static void quickSort(int[] array, int low, int high) {
		        if (low < high) {
		            int pivotIndex = partition(array, low, high);

		            // Recursively sort elements before and after the pivot
		            quickSort(array, low, pivotIndex - 1);
		            quickSort(array, pivotIndex + 1, high);
		        }
		    }

		    public static int partition(int[] array, int low, int high) {
		        int pivot = array[high];
		        int i = low - 1;

		        for (int j = low; j < high; j++) {
		            if (array[j] <= pivot) {
		                i++;

		                // Swap array[i] and array[j]
		                int temp = array[i];
		                array[i] = array[j];
		                array[j] = temp;
		            }
		        }

		        // Swap array[i+1] and array[high] (or the pivot)
		        int temp = array[i + 1];
		        array[i + 1] = array[high];
		        array[high] = temp;

		        return i + 1;
		    }

		    public static void printArray(int[] array) {
		        for (int num : array) {
		            System.out.print(num + " ");
		        }
		        System.out.println();
		    }
		

	}


