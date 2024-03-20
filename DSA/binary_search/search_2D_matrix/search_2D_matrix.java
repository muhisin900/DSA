package DSA.binary_search.search_2D_matrix;

public class search_2D_matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length;
        int j = matrix[0].length;
        int low = 0;
        int high = i * j -1;
        while (low <= high){
            int mid = low + (high - low) / 2;
            int row = mid / j;
            int col = mid % j;
            if (matrix[row][col] == target){
                return true;
            }
            else if (matrix[row][col] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;

    }
}
