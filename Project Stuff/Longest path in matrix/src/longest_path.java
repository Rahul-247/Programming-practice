
public class longest_path {

	private static StringBuilder[][] newarr;

	static void print2dArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j++) {

				System.out.println(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void getLength(int[][] arr) {
		// TODO Auto-generated method stub
		int row = 0, column = 0;
		
		System.out.println(row + "," + column + " = " + arr[row][column] + " Start");

		try {
			
			while (row < arr.length && column < arr[0].length) {
				

				if (arr[row][column + 1] == 1) { // Move Right

					arr[row][column] = 0;
					column += 1;
					System.out.println(row + "," + column + " = " + arr[row][column] + " Move Right");

				} 
				if (arr[row][column - 1] == 1 && column >0) { // Move left

					arr[row][column] = 0;
					column -= 1;
					System.out.println(row + "," + column + " = " + arr[row][column] + " Move left");

				}
				if (arr[row + 1][column] == 1 ) { // Move Down

					arr[row][column] = 0;
					row += 1;
					System.out.println(row + "," + column + " = " + arr[row][column] + " Move Down");

				}

			}
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("You're out of bounds.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] arr = { { 1, 0, 0, 0 }, 
						{ 1, 1, 0, 0 }, 
						{ 0, 1, 1, 0 }, 
						{ 1, 0, 1, 1 }, 
						{ 0, 0, 0, 0 },
						{ 0, 0, 0, 0 } };
		getLength(arr);

	}

}
