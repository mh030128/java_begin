package array;

public class ArrayDi1 {
    public static void main(String[] args) {

        // 2X3 2차원 배열 생성
        int[][] arr = new int[2][3];    // 행2, 열3

        arr[0][0] = 1;  // 0행 0렬
        arr[0][1] = 2;  // 0행 1렬
        arr[0][2] = 3;  // 0행 2렬
        arr[1][0] = 4;  // 1행 0렬
        arr[1][1] = 5;  // 1행 1렬
        arr[1][2] = 6;  // 1행 2렬

        for(int row = 0; row < 2; row++) {
            System.out.print(arr[row][0] + " ");    // 0열 출력
            System.out.print(arr[row][1] + " ");    // 1열 출력
            System.out.print(arr[row][2] + " ");    // 2열 출력
            System.out.println();   // 한 행이 끝나면 라인 변경.

        }
    }
}
