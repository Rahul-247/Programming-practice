import java.util.Scanner;

public class spiral_print {

	private static Scanner sc;
	static void getSpiral(int[][] arr, int m, int n){
        int top_row = 0, bottom_row = m - 1, left_column = 0,
        right_column = n - 1, direction = 0;
        
        while(top_row <= bottom_row && left_column <= right_column){
            
            if(direction == 0){
                for(int i = left_column; i <= right_column; i++){
                    System.out.print(arr[top_row][i]+" ");
                }
                top_row++;
                direction++;
                
            }else if(direction == 1){
                for(int i = top_row; i <= bottom_row; i++){
                	System.out.print(arr[i][right_column]+" ");
                }
                right_column--;
                direction++;
                
            }else if(direction == 2){
                for(int i = right_column; i >= left_column; i--){
                	System.out.print(arr[bottom_row][i]+" ");
                }
                bottom_row--;
                direction++;
                
            }else if(direction == 3){
                for(int i = bottom_row; i >= top_row; i--){
                	System.out.print(arr[left_column][i]+" ");
                }
                left_column++;
                direction++;
                
            }
            direction = direction % 4;
        }
        
    } 
	public static void main (String[] args)
	 {
	 sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    while(t-->0){
	        int m = sc.nextInt();
	        int n = sc.nextInt();
	        int[][] arr = new int[m][n];
	        for(int i = 0; i < m; i++){
	            for(int j = 0; j < n; j++){
	                arr[i][j] = sc.nextInt();
	            }
	        }
	        getSpiral(arr, m, n);
	        System.out.println();
	    }
	 }

}
