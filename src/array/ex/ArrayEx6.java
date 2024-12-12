package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int numbers = scanner.nextInt();
        System.out.println(numbers + "개의 정수를 입력하세요 : ");
        int[] num = new int[numbers];

        int minNum, maxNum;

        for(int i = 0; i < numbers; i++) {
            num[i] = scanner.nextInt();
        }

        minNum = maxNum = num[0];
        for(int i =0; i < numbers; i++) {
            if(num[i] < minNum) {
                minNum = num[i];
            }
            if(num[i] > maxNum) {
                maxNum = num[i];
            }
        }
        System.out.println("가장 작은 정수 : " + minNum);
        System.out.println("가장 큰 정수 : " + maxNum);
    }
}
