package arrays;

public class Matrix {
    public static void main(String[] args) {

        int[][] matrix = {{1,2}, {5,7}, {3,5}};

        for(int i = 0; i < 3; i++)
        {
            for(int e = 0; e < 2; e++)
            {
                System.out.println(matrix[i][e]);
            }
        }
    }
}
