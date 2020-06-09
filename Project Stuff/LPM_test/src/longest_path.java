
public class longest_path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[][] arr = { { 0, 0, 0, 1, 1  }, 
						{ 0, 1, 0, 0, 1  }, 
						{ 0, 1, 1, 0, 0  }, 
						{ 1, 0, 1, 1, 0  }, 
						{ 0, 0, 0, 1, 1  },
						{ 0, 0, 0, 0, 1  } };*/
		int[][] arr = {{1, 1, 0, 0}, 
					   {1, 1, 0, 0}, 
					   {1, 1, 0, 0}, 
					   {1, 1, 0, 0}};
		getLength(arr);
		

	}

	private static void getLength(int[][] arr) {
		
		StringBuilder[][] builder = new StringBuilder[arr.length][arr[0].length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (i % 2 == 0) {
				
				for (int j = 0; j < arr[0].length; j++) {

					if (arr[i][j] == 1) {
						builder[i][j] = new StringBuilder(++count+"");
						
					}
					else 
						builder[i][j] = new StringBuilder("."+"");
				}
			} else {
				
				for (int j = arr[0].length - 1; j >=0 ; j--) {

					if (arr[i][j] == 1) {
						builder[i][j] = new StringBuilder(++count+"");
					}else
						builder[i][j] = new StringBuilder("."+"");
						
				}
			}
		}
		
		print2dArray(builder);

	}
	
	static void print2dArray(StringBuilder[][] builder) {
		for (int i = 0; i < builder.length; i++) {

			for (int j = 0; j < builder[0].length; j++) {

				System.out.print(builder[i][j] + " ");
			}
			System.out.println();
		}

	}

}
