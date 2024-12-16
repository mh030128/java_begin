package method;

public class MethodValue0 {
    public static void main(String[] args) {

        // 자바는 항상 변수의 값을 복사해서 대입함 → 이 대원칙은 반드시 이해해야 함.

        int num1 = 5;
        int num2 = num1;
        num2 = 10;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
