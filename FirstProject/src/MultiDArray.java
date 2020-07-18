import java.util.ArrayList;

public class MultiDArray {

	public static void main(String[] args) {
//		
//		int arr2D[][] = new int[5][];
//		
//		arr2D[0] = new int[50];
//		arr2D[1] = new int[40];
//		arr2D[2] = new int[30];
//		arr2D[3] = new int[20];
//		arr2D[4] = new int[10];
//		
//		arr2D[2][27] = 1;
//		arr2D[2][28] = 1;
//		arr2D[2][29] = 1;
//		
//		for(int arr[]: arr2D) {
////			System.out.println(arr);
//			for(int element: arr) {
//				System.out.print(element);
//			}
//			System.out.println();
//		}
		
		int Bus[][][] = new int[2][][];
		
		int lowerFloor[][] = new int[10][];
		int upperFloor[][] = new int[7][];
		
		Bus[0] = lowerFloor;
		Bus[1] = upperFloor;
		
		lowerFloor[0] = new int[4];
		lowerFloor[1] = new int[4];
		lowerFloor[2] = new int[4];
		lowerFloor[3] = new int[4];
		lowerFloor[4] = new int[4];
		lowerFloor[5] = new int[4];
		lowerFloor[6] = new int[4];
		lowerFloor[7] = new int[4];
		lowerFloor[8] = new int[4];
		lowerFloor[9] = new int[5];
		
		upperFloor[0] = new int[4];
		upperFloor[1] = new int[4];
		upperFloor[2] = new int[4];
		upperFloor[3] = new int[4];
		upperFloor[4] = new int[4];
		upperFloor[5] = new int[4];
		upperFloor[6] = new int[4];
		
		Bus[1][6][3] = 1;
		Bus[0][5][1] = 1;
	
		for(int floor[][] : Bus) {
			
			System.out.println();System.out.println();
			for(int row[]: floor) {
				
				for(int seat: row) {
					System.out.print(seat);
				}
				System.out.println();
				
			}
			
		}

	}

}
