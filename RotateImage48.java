import java.util.Arrays;

public class RotateImage48 {

    public static void rotate(int[][] matrix) {
        int len = matrix.length;

        for(int i = 0; i < len; i++){
            for(int j = i; j < len; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i < len; i++){
            for(int j = 0; j < len/2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][len - 1 - j];
                matrix[i][len - 1 - j] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
       
    }
}
