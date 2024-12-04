package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while(true) {
            System.out.print ("숫자 입력(0 입력시 프로그램 종료) : ");
            int number = scanner.nextInt();

            if(number == 0) {
                break;
            }

            sum += number;
        }
        System.out.println("입력한 모든 정수의 합은 : " + sum);
    }
}
