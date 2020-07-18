
public class Array3D {

	public static void main(String[] args) {
		
		int arr3D[][][] = { { {1,2,3,4,5}, {6,7,8,9,10}, {11,12,13}, {14}, {15}},
							{ {12,23,34,45}, {45,34,45,34,45}, {34,23,34}, {23,23,23}}, 
							{ {23, 45, 67}, {1,2,3}, {4,5,6} }                          };
		
		System.out.println("{");
		first:
		for(int arr2D[][] : arr3D) {
			
			System.out.print("{ ");
			second:
			for(int arr1D[] : arr2D) {
				
				System.out.print("{");
				third:
				for(int element : arr1D) {
					System.out.print(element + ",");
					break;
//					continue first;
				}
				System.out.print("}");
				
			}
			System.out.println(" }");
			
		}
		System.out.println("}");

	}

}
