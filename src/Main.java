import java.util.Arrays;

/**
 * The class in which the matrix is вЂ‹вЂ‹transposed
 * 
 * @author Asus
 *
 */
public class Main {

	public static void main(String[] args) {
		int[][] sourceMatrix = new int[3][4];
		int[][] transposedMatrix = new int[4][3];

		sourceMatrixWithFiller(sourceMatrix);
		transposedMatrix(sourceMatrix, transposedMatrix);
	}

	/**
	 * Method for initial matrix
	 * 
	 * @param sourceMatrix
	 * @return sourceMatrix
	 */
	public static int[][] sourceMatrixWithFiller(int[][] sourceMatrix) {
		int numberFiller = 1;
		System.out.println("Початкова матриця:");
		for (int i = 0; i < sourceMatrix.length; i++) {
			for (int j = 0; j < sourceMatrix[i].length; j++) {
				sourceMatrix[i][j] = numberFiller++;
			}
		}
		for (int[] row : sourceMatrix)
			System.out.println(Arrays.toString(row));
		return sourceMatrix; // return the result
	}

	/**
	 * Method for transposing and displaying a new matrix
	 * 
	 * @param sourceMatrix
	 * @param transposedMatrix
	 * @return transposedMatrix
	 */
	public static int[][] transposedMatrix(int[][] sourceMatrix, int[][] transposedMatrix) {
		for (int i = 0; i < sourceMatrix.length; i++) {
			for (int j = 0; j < sourceMatrix[i].length; j++) {
				transposedMatrix[j][i] = sourceMatrix[i][j];
			}
		}
		System.out.println("Транспонована матриця:");
		for (int[] row : transposedMatrix)
			System.out.println(Arrays.toString(row));
		return transposedMatrix; // return the result
	}
}
