package array;

public class ArrayDi4 {
    public static void main(String[] args) {

        int[][] arr = new int[3][4];

        int i = 1;
        
        // 값을 넣음
        for(int row = 0; row < arr.length; row++) {
            for(int column = 0; column < arr[row].length; column++) {
                arr[row][column] = i++; // 후위증감 연산자
            }
        }
        
        // 값을 출력
        for(int row = 0; row < arr.length; row++) {
            for(int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}
