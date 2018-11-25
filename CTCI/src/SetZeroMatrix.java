
public class SetZeroMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nrows = 10;
		int ncols = 15;
		int[][] matrix = randomMatrix(nrows, ncols, -10, 10);
		printMatrix(matrix);
		setZeroes(matrix);
		System.out.println("/n");
		printMatrix(matrix);
	}
	
	public static int[][] randomMatrix(int M, int N, int min, int max) {
		int[][] matrix = new int[M][N];
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				matrix[i][j] = randomIntInRange(min, max);
			}
		}
		return matrix;
	}
	public static int randomInt(int n) {
		return (int) (Math.random() * n);
	}

	public static int randomIntInRange(int min, int max) {
		return randomInt(max + 1 - min) + min;
	}
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] < 10 && matrix[i][j] > -10) {
					System.out.print(" ");
				}
				if (matrix[i][j] < 100 && matrix[i][j] > -100) {
					System.out.print(" ");
				}
				if (matrix[i][j] >= 0) {
					System.out.print(" ");
				}
				System.out.print(" " + matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	
	public static void nullifyRow(int[][] matrix, int row) {
		for(int j=0; j<matrix[0].length; j++) {
			matrix[row][j] = 0;
		}
	}
	
	public static void nullifyColumn(int[][] matrix, int col) {
		for(int i=0; i<matrix.length; i++) {
			matrix[i][col]=0;
		}
	}
	

	public static void setZeroes(int[][] matrix) {
		boolean rowHasZero = false;
		boolean colHasZero = false;
		// Check if the first row has a zero
		
		for(int j=0; j<matrix[0].length; j++) {
			if(matrix[0][j]==0) {
				rowHasZero = true;
				break;
			}
		}
		
		for(int i=0; i<matrix.length;i++) {
			if(matrix[i][0] == 0) {
				colHasZero = true;
				break;
			}
		}
		
		// For every row or col in the matrix which has a zero change the first row or col to zero
		
		for(int i=1; i<matrix.length; i++) {
			for(int j=1; j<matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		// N
		
		for(int i = 1; i<matrix.length; i++) {
			if(matrix[i][0] == 0) {
				nullifyRow(matrix, i);
			}
		}
		
		for(int j =1; j<matrix[0].length; j++) {
			if(matrix[0][j] == 0) {
				nullifyColumn(matrix, j);
			}
		}
		
		// Nullify first row
		
		if(rowHasZero) {
			nullifyRow(matrix, 0);
		}
		
		if(colHasZero) {
			nullifyColumn(matrix, 0);
		}
		
		// Nullify first col
	}
	
	

}
