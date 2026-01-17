
public class TransposeMatrix {

    public static int[][] transposeMatrix(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                transpose[i][j] = matrix[j][i];
            }

        }
        return transpose;
    }

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int[][] matrix = {
            {1, 2, 3}, {4, 5, 6},
        };
        int[][] transpose = transposeMatrix(matrix);
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                sb.append(transpose[i][j]).append(" ");
            }
            sb.append("\n");
        }
        
        System.out.println(sb.toString());

    }
}
