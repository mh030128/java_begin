package array;

public class ArrayDi3 {
    public static void main(String[] args) {

        // 2X3 2차원 배열 생성하면서 초기화
        int[][] arr = new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };    // 행2, 열3

        /*
        아래처럼 작성 할 수 있음
        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };
        */


        for(int row = 0; row < arr.length; row++) {
            for(int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();   // 한 행이 끝나면 라인 변경.

        }

        /*
        arr.length = 2
        arr[row].length = 3 row(행)의 요소의 길이는 3
         */
    }
}
