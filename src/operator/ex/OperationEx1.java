package operator.ex;

public class OperationEx1 {
    public static void main(String[] args) {

        int num1, num2, num3;

        num1 = 10;
        num2 = 20;
        num3 = 30;

        int sum = num1 + num2 + num3;
        int average = sum / 3;  // int끼리의 나눗셈은 자동으로 소수점 이하 버림.

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
