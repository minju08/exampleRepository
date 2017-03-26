package firstSection;


/**
 * @fileName Example2.java
 * @Description
 *  Insert Sorting 
 *  
 */
public class Example2 {
	
	int init_grades[] = {35, 9, 8, 18, 98, 31, 58, 17, 76, 45};
	int size = init_grades.length;
	
	public void insertionSort(int[] arr)
		{

		   for(int index = 1 ; index < arr.length ; index++){
		      
		      int temp = arr[index];
		      int aux = index - 1;

		      while( (aux >= 0) && ( arr[aux] > temp) ) {

		         arr[aux+1] = arr[aux];
		         aux--;
		      }
		      arr[aux + 1] = temp;
		   }
		}
	

}
