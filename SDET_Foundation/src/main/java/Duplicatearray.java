
public class Duplicatearray {

	public static void main(String[] args) {
		int[] arr = {4, 2, 3, 4, 5, 2, 6, 7, 8, 5}; 

        System.out.println("Duplicate elements in the array:");

      
        for (int i = 0; i < arr.length - 1; i++) {
       
            if (arr[i] == -1) { 
                continue;
            }
          
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                   
                    System.out.println(arr[i]);
                    
                
                }
            }
        }
    }
}