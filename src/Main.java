
/**
 * The class in which the matrix is ​​transposed
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
 * @param sourceMatrix
 * @return sourceMatrix
 */
	    public static int[][] sourceMatrixWithFiller(int[][] sourceMatrix) {
	        int numberFiller = 1;
	        System.out.println("Вихідна матриця:");
	        for (int i = 0; i < sourceMatrix.length; i++) {
	            for (int j = 0; j < sourceMatrix[i].length; j++) {
	                sourceMatrix[i][j] = numberFiller++;
	                System.out.print(sourceMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	        return sourceMatrix; //return the result  
	    }
/**
 * Method for transposing and displaying a new matrix
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
	        for (int i = 0; i < transposedMatrix.length; i++) {
	            for (int j = 0; j < transposedMatrix[i].length; j++) {
	                System.out.print(transposedMatrix[i][j] + " ");
	            }
	            System.out.println();
	        }
	        return transposedMatrix; //return the result  
	    }
	}

