package Leet.OO2;

import java.util.Arrays;

/*
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly.
DO NOT allocate another 2D matrix and do the rotation
 */
public class Rotate_Matrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        rotate(mat);
    }
    /*
    Input: [[1,2,3],[4,5,6],[7,8,9]]
    Output: [[7,4,1],[8,5,2],[9,6,3]]
     */
    static void rotate(int[][] matrix){
        int n=matrix.length;
        for (int i=0; i<n; i++){
            for (int j=0; j<n-1; j++){
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][n-i-1];
                matrix[j][n-i-1]=temp;
            }
        }
        for (int i=n-1; i<=n-1; i++){
            for (int j=0; j<n-1; j++) {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[i][n-j-1];
                matrix[i][n-j-1]=temp;
            }
        }

        System.out.println(Arrays.deepToString(matrix));





//        transpose(matrix);
//        for(int j = 0 ; j<matrix.length/2 ; j++){
//            for(int i = 0 ; i < matrix.length;i++){
//                int k = matrix[i][j];
//                matrix[i][j] = matrix[i][matrix.length-1-j];
//                matrix[i][matrix.length-1-j] = k;
//            }
//        }
//        // 0 with last
//        // 1 with last-1
//        System.out.println(Arrays.deepToString(matrix));
//         }
//    public static void transpose(int[][] grid){
//        for(int i = 0 ;i<grid.length ; i++){
//            for(int j = 0 ; j <= i ; j++){
//                swap(i,j,grid);
//            }
//        }
//        return; }
//    public static void swap(int i , int j , int[][] arr){
//        int a = arr[i][j];
//        arr[i][j] = arr[j][i];
//        arr[j][i] = a;
//        return;
    }
}
