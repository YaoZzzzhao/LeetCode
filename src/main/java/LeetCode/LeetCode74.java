package LeetCode;

/**   Search a 2D Matrix
 * Write an efficient algorithm that searches for a value in
 * an m x n matrix. This matrix has the following properties:
 *
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 */

public class LeetCode74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
        int m = matrix.length;
        int n = matrix[0].length;
        if(matrix[0][0]>target || matrix[m-1][n-1]<target) return false;
        for(int i = 0;i<m;i++){
            if(target > matrix[i][n-1]) continue;
            else{
                return binarySearch(matrix[i],0,n,target);
            }
        }
        return false;
    }
    boolean binarySearch(int[] a, int left, int right,int target){
        int mid = (left+right)/2;
        while(left<=right){
            if(a[mid]<target){
                left = mid+1;
            }else if(a[mid] == target){
                return true;
            }else{
                right = mid-1;
            }
            mid = (left+right)/2;
        }
        if(left>right) return false;
        return false;
    }
}

