package com.ritubrata.arrays;

public class MaxOnesIn2DArray {
	public static int findRowIndex(final int mat[][]){
		// stores row number with maximum index
		int row = -1;
		int i = 0, j = mat[0].length - 1;
		while (i <= mat.length - 1 && j >= 0){
			// move left if the current cell has value 1
			if (mat[i][j] == 1){
				j--;
				row = i;    // update row number
			}else {
				// otherwise, move down
				i++;
			}
		}
		return row + 1;
	}

	public static int findColumnIndex(final int mat[][]){
		// stores row number with maximum index
		int column = -1;
		int j = 0, i = mat[0].length - 1;
		while (j <= mat.length - 1 && i >= 0){
			// move left if the current cell has value 1
			if (mat[i][j] == 1){
				i--;
				column = j;    // update row number
			}else {
				// otherwise, move down
				j++;
			}
		}
		return column + 1;
	}


	public static void main(final String[] args) {
		final int[][] mat ={
				{ 0, 0, 0, 1, 1 },
				{ 0, 0, 1, 1, 1 },
				{ 0, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1 },
				{ 0, 0, 0, 0, 1 }
		};
		final int rowIndex = findRowIndex(mat);
		// `rowIndex = 0` means no 1's are present in the matrix
		if (rowIndex != 0) {
			System.out.println("The maximum 1's are present in the row " + rowIndex);
		}

		final int colIndex = findColumnIndex(mat);
		// `colIndex = 0` means no 1's are present in the matrix
		if (colIndex != 0) {
			System.out.println("The maximum 1's are present in the col " + colIndex);
		}
	}
}
