package firstSection;

/**
 * @fileName example1.java
 * @Description
 *  Selection Sorting 
 *  
 *  students : 10
 *  grade : 
 */
public class Example1 {

	int init_grades[] = {31, 41, 22, 68, 96, 95, 78, 72, 64, 15};
	int size = init_grades.length;
	
	public void selectSort(){
		
		int j = 0;
		int i = 1;
		int temp, min;
			
		for(j = 0; j < size; j++) {
			if(j == size-1){
				System.out.print(init_grades[j]);
			}
			else{
				System.out.print(init_grades[j] + ", ");
			}
		}
		System.out.println();
		j=0;
		
		
		while(j < size-1){
			while(i < size){
				if(init_grades[j] < init_grades[i]){
					i++;
				}
				else{
					temp = init_grades[j];
					init_grades[j] = init_grades[i];
					init_grades[i] = temp;
					i++;
				}
			}
			j++;
			i=j+1;
		}
		
		for(j = 0; j < size; j++) {
			if(j == size-1){
				System.out.print(init_grades[j]);
			}
			else{
				System.out.print(init_grades[j] + ", ");
			}
		}			
	}
	
	
}