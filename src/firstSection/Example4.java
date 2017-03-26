package firstSection;


/**
 * @fileName Example4.java
 * @Description
 *  Quick Sorting 
 *  
 */
public class Example4 {
	
	public void quickSort(int[] arr, int left, int right) {
	    int i, j, pivot, tmp;

	    if (left < right) {
	        i = left;
	        j = right;
	        pivot = arr[left];
	        //���� ����
	        while (i < j) {
	            while (arr[j] > pivot) j--;
	            while (i < j && arr[i] <= pivot) i++;

	            tmp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = tmp;
	        }
	        arr[left] = arr[i];
	        arr[i] = pivot;
	        //���� ����
	        quickSort(arr, left, i - 1);
	        quickSort(arr, i + 1, right);
	    }
	}

}
