
public class Array2D {

	public static void main(String[] args) {
		
//		2D array -> 1d arrays inside 1d array
//		3D array -> 1d arrays inside 1d arrays which are also sitting in some other 1d array

		int arr2D[][] = { {1,2,3,4,5}, {6,7,8,9,90}, {87,76,65,54,43}, {99,88,77,66,55}, {23,45,56,67,78} };
//		arr2D[1][4] = 10;
//	
//		int inner_array[] = arr2D[1];
//		
//		for(int element : inner_array) {
//			System.out.print(element + ", ");
//		}
//		
		System.out.print("{ ");
		for(int i = 0; i < arr2D.length; i++) {
//			System.out.println(arr2D[i]);
			
			int inner_array[] = arr2D[i];
			
			System.out.print("{ ");
			for(int j = 0; j < inner_array.length; j++) {
				System.out.print(inner_array[j] + ", ");
			}
			System.out.print("} ");
		}
		System.out.println(" }");
		
		System.out.print("{ ");
		for(int i = 0; i < arr2D.length; i++) {
			
			System.out.print("{ ");
			
			for(int j = 0; j < arr2D[i].length; j++) {
				System.out.print(arr2D[i][j] + ", ");
			}
			
			System.out.print("} ");
		}
		System.out.println(" }");
		
//		System.out.println(arr2D);
		
	}

}
